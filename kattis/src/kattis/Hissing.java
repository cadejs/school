package kattis;

import java.util.Scanner;

public class Hissing {
//Problem Hissing Microphone
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        
        String output = s.contains("ss")? "hiss": "no hiss";
        System.out.println(output);

	}

}
