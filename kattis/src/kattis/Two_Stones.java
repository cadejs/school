package kattis;

import java.util.Scanner;

public class Two_Stones {
	//problem Take Two Stones
	

	
	    public static void main(String[] args) {
	        Scanner scan = new Scanner(System.in);
	        
	        int a = scan.nextInt();
	        
	        String results = (a%2!=0)? "Alice": "Bob";
	        
	        System.out.println(results);
	        
	    

	}
	
}
