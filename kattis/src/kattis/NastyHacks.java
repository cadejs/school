package kattis;

import java.util.Scanner;

public class NastyHacks {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        int count = scan.nextInt();
		int rev ;
        int adrev ;
        int adcost ;
		
		for (int i = 0; i<count; i++) {
			rev = scan.nextInt();
	        adrev = scan.nextInt();
	        adcost = scan.nextInt();
			
			if ((adrev-adcost)<rev) {
				System.out.println("do not advertise");
			}if ((adrev-adcost)==rev) {
				System.out.println("does not matter");
			}System.out.println("advertise");
			
		}
	}

}
