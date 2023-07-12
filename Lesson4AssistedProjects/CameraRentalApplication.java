package Lesson4AssistedProjects;
import java.util.*;

class Camera {
 private String id;
 private String brand;
 private String model;
 private float price;
 public Camera(String id, String brand, String model, float price) {
 this.id = id;
 this.brand = brand;
 this.model = model;
 this.price = price;
 }
 public String getId() {
 return id;
 }
 public String getBrand() {
 return brand;
 }
 public String getModel() {
 return model;
 }
 public float getPrice() {
 return price;
 }
 @Override
 public String toString() {
 return "Camera [id=" + id + ", brand=" + brand + ", model=" + model
+ ", rentalAmount=" + price + "]";
 }
}
class CameraListing {
 private static List<Camera> cameras;
 public CameraListing() {
 cameras = new ArrayList<>();
 }
 public static void addCamera(Camera camera) {
 cameras.add(camera);
 }
 public static void removeCamera(Camera camera) {
 cameras.remove(camera);
 }
 public static List<Camera> getCameras() {
 return cameras;
 }
}
public class CameraRentalApplication {
 private static Wallet wallet;
 public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
 Map<String, String> signupMap = new HashMap<>();
 CameraListing cameraListing = new CameraListing();
 wallet = new Wallet();
 while (true) {
	 System.out.println("Welcome to Camera Rental Application");
 System.out.println("1. Sign in");
 System.out.println("2. Sign up");
 System.out.println("3. Exit");
 System.out.print("Enter your choice: ");
 int option = sc.nextInt();
 sc.nextLine();
 switch (option) {
 case 1:
 System.out.println("\nWelcome to sign in");
 System.out.print("Enter username: ");
 String username = sc.nextLine();
 System.out.print("Enter password: ");
 String password = sc.nextLine();
 if (signupMap.containsKey(username) && 
signupMap.get(username).equals(password)) {
 System.out.println("Welcome to dashboard\n"); handleDashboard(sc, cameraListing);
 } else {
 System.out.println("If your new user go for Sign up or check credentials.");
 }
break;
 case 2:
 System.out.println("\nWelcome to sign up");
 System.out.print("Enter username: ");
 String signupUsername = sc.nextLine();
 if (signupMap.containsKey(signupUsername)) {
 System.out.print("User already exists.");
 }
System.out.print("Enter password: ");
 String signupPassword = sc.nextLine();
 signupMap.put(signupUsername, signupPassword);
 System.out.println("Sign up successful. You can now log in to the dashboard\n");
 break;
 case 3:
 System.out.println("Exiting...");
 sc.close();
return;
 default:
 System.out.println("Invalid choice. Please enter a valid choice.");
 break;
 }
 }
 }
 private static void handleDashboard(Scanner sc, CameraListing 
cameraListing) {
 while (true) {
 System.out.println("1. My Camera");
 System.out.println("2. Rent a Camera");
 System.out.println("3. View All Cameras");
 System.out.println("4. My Wallet");
 System.out.println("5. Exit");
 System.out.print("Choose an option: ");
 int option = sc.nextInt();
 sc.nextLine();
 switch (option) {
 case 1:
 handleMyCamera(sc, cameraListing);
 break;
 case 2:
 handleRentCamera(sc, cameraListing,wallet);
 break;
 case 3:
 viewAllCameras(cameraListing);
 break;
 case 4:
 handleWallet(sc);
 break;
 case 5:
 System.out.println("Exiting dashboard...");
 return;
 default:
 System.out.println("Invalid choice. Please enter a valid option.");
 break;
 }
 }
 }
 private static void handleMyCamera(Scanner sc, CameraListing 
cameraListing) {
 System.out.println("\n1. Add Camera");
 System.out.println("2. Remove Camera");
 System.out.println("3. View My Cameras");
 System.out.println("4. Go to Previous Menu");
 System.out.print("Enter your option: ");
 int myCamOption = sc.nextInt();
 sc.nextLine();
 switch (myCamOption) {
 case 1:
 addCamera(sc, cameraListing);
 break;
 case 2:
 removeCamera(sc, cameraListing);
 break;
 case 3:
 viewMyCameras(cameraListing);
 break;
 case 4:
 return;
 default:
 System.out.println("Enter a valid option.");
 break;
 }
 }
 private static void addCamera(Scanner scanner, CameraListing 
cameraListing) {
 System.out.print("Enter camera id: ");
 String id = scanner.nextLine();
 // Check if camera ID already exists
 for (Camera camera : cameraListing.getCameras()) {
 if (camera.getId().equals(id)) {
 System.out.println("Camera with the given ID already exists. Please enter a unique ID.");
 return;
 }
 }
 System.out.print("Enter camera brand: ");
 String brand = scanner.nextLine();
 System.out.print("Enter camera model: ");
 String model = scanner.nextLine();
 System.out.print("Enter camera per day price: ");
 float price = scanner.nextFloat();
 scanner.nextLine(); // Consume newline character
 Camera camera = new Camera(id, brand, model, price);
 cameraListing.addCamera(camera);
 System.out.println("Your camera has been successfully added to the list.");
 }
 private static void removeCamera(Scanner scanner, CameraListing 
cameraListing) {
 System.out.print("Enter camera id to remove: ");
 String id = scanner.nextLine();
 Camera cameraToRemove = null;
 for (Camera camera : cameraListing.getCameras()) {
 if (camera.getId().equals(id)) {
 cameraToRemove = camera;
 break;
 }
 }
 if (cameraToRemove != null) {
 cameraListing.removeCamera(cameraToRemove);
 System.out.println("Camera successfully removed from the list.");
 } else {
 System.out.println("Camera with the given id was not found.");
 }
 }
 private static void viewMyCameras(CameraListing cameraListing) {
 List<Camera> cameras = cameraListing.getCameras();
 if (cameras.isEmpty()) {
 System.out.println("No cameras available.");
 } else {
 System.out.println("My Camera Listing:");
 System.out.println("--------------------------------------------------");
 System.out.printf("%-10s %-10s %-10s %-10s\n", "ID", "Brand", 
"Model", "Rental Amount");
 System.out.println("--------------------------------------------------");
 for (Camera camera : cameras) {
 System.out.printf("%-10s %-10s %-10s %-10s\n", 
camera.getId(), camera.getBrand(), camera.getModel(),
 camera.getPrice());
 }
 }
 }
 private static void viewAllCameras(CameraListing cameraListing) {
 List<Camera> cameras = cameraListing.getCameras();
 if (cameras.isEmpty()) {
 System.out.println("No cameras available.");
 } else {
 System.out.println("Camera Listing:");
 System.out.println("--------------------------------------------------");
 System.out.printf("%-10s %-10s %-10s %-10s\n", "ID", "Brand", 
"Model", "Rental Amount");
 System.out.println("--------------------------------------------------");
 for (Camera camera : cameras) {
 System.out.printf("%-10s %-10s %-10s %-10s\n", 
camera.getId(), camera.getBrand(), camera.getModel(),
 camera.getPrice());
 }
 }
 }
 private static void handleRentCamera(Scanner scanner, CameraListing 
cameraListing, Wallet wallet) {
 System.out.print("Enter camera id to rent: ");
 String id = scanner.nextLine();
 Camera selectedCamera = null;
 for (Camera camera : cameraListing.getCameras()) {
 if (camera.getId().equals(id)) {
 selectedCamera = camera;
 break;
 }
 }
 if (selectedCamera != null) {
 float rentalAmount = selectedCamera.getPrice();
 if (wallet.getBalance() >= rentalAmount) {
 wallet.deposit(-rentalAmount);
 System.out.println("Your transaction for Camera - " + 
selectedCamera.getBrand() + " "
 + selectedCamera.getModel() + " with rent " + 
rentalAmount + " has been successfully completed.");
 } else {
 System.out.println("Insufficient funds. Maintain sufficient funds to rent a camera.");
 }
 } else {
 System.out.println("Camera with the given id was not found.");
 }
 }
 private static void handleWallet(Scanner scanner) {
 System.out.println("Wallet Balance: " + Wallet.getBalance());
 System.out.print("Enter 'y' to add funds to the wallet or 'n' to quit: ");
 String choice = scanner.nextLine();
 if (choice.equalsIgnoreCase("y")) {
 System.out.print("Enter amount to deposit: ");
 float depositAmount = scanner.nextFloat();
 scanner.nextLine(); // Consume newline character
 Wallet.deposit(depositAmount);
 System.out.println("Wallet balance updated.");
 } else if (choice.equalsIgnoreCase("n")) {
 // Do nothing, go back to the previous menu
 } else {
 System.out.println("Invalid choice. Going back to the previous menu.");
 }
 }
}
class Wallet {
 private static float balance = 0;
 public static float getBalance() {
 return balance;
 }
 public static void deposit(float amount) {
 balance += amount;
 }
}