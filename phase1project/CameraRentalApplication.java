package phase1project;
import java.util.ArrayList; 
import java.util.Scanner; 
class Data { 
 
       private int camera_id; 
       private String brand; 
       private String model; 
       private double price; 
       private boolean status; 
 
         Data(int camera_id, String brand, String model, double price, boolean Available) { 
                  this.camera_id = camera_id; 
                  this.brand = brand; 
                  this.model = model; 
                  this.price = price; 
                  this.status = Available; 
          } 
 
           public int getId() { 
              return camera_id; 
        } 
 
           public String getBrand() { 
             return brand; 
        } 
 
           public String getModel() { 
              return model; 
       } 
 
          public double getPrice() { 
             return price; 
       } 
 
            public boolean isAvailable() { 
               return status; 
         } 
 
               public void setAvailable(boolean Available) { 
                   this.status = Available; 
          } 
     } 

                   public class CameraRentalApplication {
	                         public static void main(String[] args) { 
		 // TODO Auto-generated method stub 
		 double INR = 10000; 
		 String username, password; 
		 
		 Scanner s = new Scanner(System.in); 
		 System.out.println("********************************************************************");
		 System.out.println("               Welcome to Camera Rental App\n     "); 
		 System.out.println("********************************************************************");
		 
		 System.out.print("Enter username:");// username:user 
		 username = s.nextLine(); 
		 System.out.print("Enter password:");// password:user 
		 password = s.nextLine(); 
		 if (username.equals("himabindu") && password.equals("Bindu@123")) { 
		 System.out.println("Login Successful"); 
		 System.out.println("***********************************************************");
		 ArrayList<Data> list = new ArrayList<>(); 
		 list.add(new Data(1, "Canon", "DSLR", 1200, true)); 
		 list.add(new Data(2, "Nikon", "SRL", 550, false)); 
		 list.add(new Data(3, "LG", "Digital", 2600, true)); 
		 list.add(new Data(4, "Lenova", "XPL", 3000, true)); 
		 list.add(new Data(5, "Ricoh", "Panasonic", 3350, true)); 
		 list.add(new Data(6, "Sony", "2130", 2700, false)); 
		 list.add(new Data(7, "Samsung", "DL", 5600, true)); 
		 list.add(new Data(8, "Leica", "Sigma", 1200, true)); 
		 list.add(new Data(9, "oneplus", "Digi", 7000,true));
		 list.add(new Data(10,"unicon", "Mega",3500,true));
		 // int l=list.size(); 
		 int x = 0; 
		 do { 
		 int option; 
		 Scanner sc = new Scanner(System.in); 
		 // public void main_option() 
		 System.out.println("1.MY CAMERA"); 
		 System.out.println("2.RENT A CAMERA"); 
		 System.out.println("3.VIEW ALL CAMERA"); 
		 System.out.println("4.MY WALLET"); 
		 System.out.println("5.EXIT");
		 System.out.println("Select your option : "); 
		 option = sc.nextInt(); 
		 
		 switch (option) { 
		 case 1: 
		 int k = 0; 
		 do { 
		 int choose; 
		 System.out.println("1.ADD"); 
		 System.out.println("2.REMOVE"); 
		 System.out.println("3.VIEW MY CAMERA"); 
		 System.out.println("4.GO TO PREVIOUS MENU"); 
		 System.out.println("Enter your choice : "); 
		 choose = sc.nextInt(); 
		 
		 switch (choose) { 
		 
		 case 1: 
		 System.out.println("Enter Camera ID: "); 
		 int camera_id = sc.nextInt(); 
		 System.out.println("Enter Camera Brand: "); 
		 String brand = sc.next(); 
		 System.out.println("Enter Camera Model: "); 
		 String model = sc.next(); 
		 System.out.println("Enter Camera Price per day: "); 
		 double price = sc.nextFloat(); 
		 boolean Available = true; 
		 list.add(new Data(camera_id, brand, model, price, Available)); 
		 System.out.println("Successfully Added"); 
		 System.out.println("You want view camera List please enter '1' else enter '0': "); 
		 int m = sc.nextInt(); 
		 if (m == 1) { 
			 System.out.println("***************************************************************");
		 System.out.println("cameraID\t Brand\t Model\t Price\t Status"); 
		 System.out.println("*******************************************************************");
		 for (int i = 0; i < list.size(); i++) { 
		 Data data = list.get(i); 
		 String status = data.isAvailable() ? "Available" : "Rented"; 
		 System.out.println(data.getId() + "\t\t" + data.getBrand() + "\t" + 
		data.getModel() 
		 + "\t" + data.getPrice() + "\t" + status); 
		 } 
		 
		 } 
		 System.out.println("**************************************************************");
		 break; 
		 case 2: 
		 System.out.println("Which one you want to remove 'Enter camera Id': "); 
		 int cameraId = sc.nextInt(); 
		 for (int i = 0; i < list.size(); i++) { 
		 Data camera = list.get(i); 
		 if (camera.getId() == cameraId) { 
		 list.remove(i); 
		 System.out.println("Camera Sucessfully Removed From The List");
		 break; 
		 } 
		 } 
		 break; 
		 case 3: 
			 System.out.println("***********************************************************************");
		 System.out.println("cameraID\t Brand\t Model\t Price\t Status"); 
		 System.out.println("***************************************************************************");
		 for (int i = 0; i < list.size(); i++) { 
		 Data data = list.get(i); 
		 String status = data.isAvailable() ? "Available" : "Rented"; 
		 System.out.println(data.getId() + "\t\t" + data.getBrand() + "\t" + 
		data.getModel() 
		 + "\t" + data.getPrice() + "\t" + status); 
		 } 
		 case 4: 
		 x = 1; 
		 System.out.println("******************************************************************************");
		 break; 
		 } 
		 System.out.println("If u want add or remove camera please enter '1' else '0':"); 
		 k = sc.nextInt(); 
		 } while (k == 1); 
		 break; 
		 
		 case 2:
			 System.out.println("****************************************************************************");
		 
		 System.out.println("cameraID\t Brand\t Model\t Price\t Status"); 
		 System.out.println("********************************************************************************");
		 for (Data data : list) { 
		 if (data.isAvailable()) { 
		 String status = data.isAvailable() ? "Available" : "Rented"; 
		 
		 System.out.println(data.getId() + "\t\t" + data.getBrand() + "\t" + 
		data.getModel() + "\t" 
		 + data.getPrice() + "\t" + status); 
		 } 
		 } 
		 System.out.println("***********************************************************************************");
		 int index = -1; 
		 System.out.println("Which one you want to rent 'Entre camera Id': "); 
		 int cameraId = sc.nextInt(); 
		 for (int i = 0; i < list.size(); i++) { 
		 Data camera = list.get(i); 
		 if (camera.getId() == cameraId) { 
		 index = i; 
		 break; // Found the camera, exit the loop 
		 } 
		 } 
		 if (index != -1) { 
		 Data a = list.get(index); 
		 if (a.getPrice() <= INR) { 
		 System.out.println("Rented Successfully"); 
		 a.setAvailable(false); 
		 INR = INR - a.getPrice(); 
		 System.out.println("Current wallet balance - " + INR); 
		 } else { 
		 System.out.println("ERROR: Transction Failed Due To Insufficient Wallet Balance. Please Deposit The Amount To Your Wallet."); 
		 } 
		 } else { 
		 System.out.println("Camera with ID " + cameraId + " is not found in the list."); 
		 } 
		 
		 break; 
		 
		 case 3: 
			 System.out.println("************************************************************************");
		 System.out.println("cameraID\t Brand\t Model\t Price\t Status"); 
		 System.out.println("*****************************************************************************");
		 for (int i = 0; i < list.size(); i++) { 
		 Data data = list.get(i); 
		 String status = data.isAvailable() ? "Available" : "Rented"; 
		 System.out.println(data.getId() + "\t\t" + data.getBrand() + "\t" + 
		data.getModel() + "\t" 
		 + data.getPrice() + "\t" + status); 
		 } 
		 System.out.println("*****************************************************************************");
		 break; 
		 case 4: 
		 System.out.println("Your current wallet balance is :" + INR); 
		 System.out.println("Do you want to deposit more amount to your wallet?(1.Yes 2.No)- "); 
		 int m = sc.nextInt(); 
		 if (m == 1) { 
		 System.out.println("Enter deposit amount: "); 
		 double addAmount = sc.nextDouble(); 
		 INR = INR + addAmount; 
		 System.out.print("Your Wallet balance updated successfully..."); 
		 } 
		 System.out.println("Current wallet balance - " + INR); 
		 break; 
		 } 
		 System.out.println("If u want continue (1.Yes 2.No)- "); 
		 x = sc.nextInt(); 
		 } while (x == 1); 
		 } 
		 else { 
		 System.out.println("Authentication Failed"); 
		 } 
		 System.out.println("Thank you for visiting camera rental");
		 System.out.println("************************************************************************");
	}
	

}