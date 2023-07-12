package Interfaces;

public interface Laptop {
	public void copy();
	public void cut();
	public void paste();
	public void keyboard();
	public static void commoncode1() {
		// TODO Auto-generated method stub
		
	}
	
	default void security() {
		commoncode1();
		System.out.println("Create a Security code");
	}
	static void audio() {
		commoncode1();
		System.out.println("Audio code");
	}
	private static void commoncode() {
		System.out.println("common code for all laptops");
	}
	

}
