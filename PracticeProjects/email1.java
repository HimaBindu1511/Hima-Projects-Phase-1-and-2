package PracticeProjects;
import java.util.Scanner;
public class email1 {
	public static void main(String[] args) {
       Scanner scn=new Scanner(System.in);
        String s1="abc@gmail.com" ,s2="bac@gmail.com",s3="bacd@gmail.com",s4="bach@gmail.com";
        System.out.println("Enter the Email ID");
        String s5=scn.nextLine();
        if (s5==s1||s5==s2||s5==s3||s5==s4) {
        	System.out.println("Entetrd mail id is correct");
        }
        	else {
        		System.out.println("Entered mailId is wrong");
        	}
        	
        	}
	}
