package kattis;

import java.util.Scanner;

public class Filip {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
	    
	    String x = scan.nextInt();
	    int y = scan.nextInt();
	    int xflip = 0;
	    int yflip = 0;
	  
	    String cade = new String(x);
	    
	    
	    //123
	  //  for (int i = 0; i<3;i++) {
	    	xflip = xflip + (x % 10); //3
	    	xflip = xflip*10; //30
	    	xflip = xflip+ (x % 100); //32
	    	xflip = xflip*10; //320
	    	xflip = xflip+ (x % 1000); //321
	    	yflip = yflip+ (y % 10);
	    	yflip = yflip*10;
	    	yflip = yflip+ (y % 100);
	    	yflip = yflip*10;
	    	yflip = yflip+ (y % 1000);
	    	
	    	 int reverse = (x<y)? x:y;
	    	 System.out.println(reverse);
	    	 
	   // }
	}

}
