package kattis;

import java.util.Scanner;

public class SpeedLimit {

	public static void main(String[] args) {
		
		
		
		Scanner scan = new Scanner(System.in);
	   
		int totaltime = 0;
		while(scan.hasNext()) {
			int miles = 0;
	    	int x = scan.nextInt();
		    for(int i =0; i<x;i++) {
		    	int spd = scan.nextInt();
		    	int time = scan.nextInt();
		    	
		    	
		    	miles = miles + (spd*(time-totaltime));
		    	totaltime = totaltime+time;
		    	
		    }

	    	System.out.println(miles + " miles");
	    }
	    
	}

}
