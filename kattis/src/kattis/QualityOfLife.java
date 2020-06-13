package kattis;

import java.util.Scanner;

public class QualityOfLife {
//Problem Quality-Adjusted Life-year
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        double time;
        double qaulity;
        double total = 0;
        for (int i = 0; i<x; i++) {
        	time = scan.nextDouble();
        	qaulity=scan.nextDouble();
        	total = total + time*qaulity;
        }
System.out.println(total);
	}

}
