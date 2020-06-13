package kattis;

import java.util.Scanner;

public class Autori {
//Problem Autori
	public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
	    
	    String input = scan.next();
	    String output = input.replaceAll("[a-z-]", "");
	    
	    System.out.println(output);
	    
	}

}
