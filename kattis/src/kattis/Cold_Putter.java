package kattis;

import java.util.Scanner;

public class Cold_Putter {
//Problem Cold-Putter Science
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
	    
	    int x = scan.nextInt();
	    int y;
	    int total = 0;
	    for(int i = 0; i<x ;i++ ) {
	    	y = scan.nextInt();
	    	if (y<0) {
	    		total++;
	    	}
	    }
	    System.out.println(total);
	}

}
