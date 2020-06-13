package kattis;

import java.util.Scanner;

public class Oddities {
//Problem Oddities
	public static void main(String[] args) {
   
	Scanner scan = new Scanner(System.in);
    
    int x = scan.nextInt();
    

    for(int i= 0; i<x;i++) {
    	 int y = scan.nextInt(); 
    	 if(y%2==0) {
    		 System.out.println(y+ " is even");
    	 } else {
    		 System.out.println(y + " is odd");
    	 }
    	
    }
}
}
