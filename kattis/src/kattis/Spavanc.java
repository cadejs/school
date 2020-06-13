package kattis;

import java.util.Scanner;

public class Spavanc {
//Problem Spavanac
	public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
        
        int a = scan.nextInt();
       int b = scan.nextInt();
         
        
        // 10 10    9 25
       // Scanner reader = new Scanner(System.in);  // Reading from System.in
       // System.out.println("Enter a number: ");
     // int a = reader.nextInt();
     // int b = reader.nextInt();
        
        if (b>=45) {
        	
        	System.out.println(a +" "+ (b-45));
        } else if(a>1) {
        	int c = b-45;
        	//System.out.println(c);
            b = c+60;
            //System.out.println(b);
            a--; 
            System.out.println(a +" " +b);
        } else {
        	int c = b-45;
        //	System.out.println(c);
            b = c+60;
          //  System.out.println(b);
            a=23; 
            System.out.println(a +" " +b);
        	
        }
       

	}

}
