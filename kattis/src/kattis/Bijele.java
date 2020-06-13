package kattis;

import java.util.Scanner;

public class Bijele {
//Problem Bijele
	public static int differnce(int piece, int desired) {
    	if(piece==desired) {
    		return 0;
    	} if (piece>0) {
    		
    		return desired-piece;
    	}
    		return desired-piece;
    	
    	
    }
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	    
	    int kings = scan.nextInt();
	    int queens = scan.nextInt();
	    int rooks = scan.nextInt();
	    int bishops = scan.nextInt();
	    int knights = scan.nextInt();
	    int pawns = scan.nextInt();
	    
	    int cking = 1;
	    int cqueens = 1;
	    int crooks = 2;
	    int cbishops = 2;
	    int cknights = 2;
	    int cpawns = 8;
	    
	    int changeking = 0;
	    int changequeens = 0;
	    int changerooks = 0;
	    int changebishops = 0;
	    int changeknights = 0;
	    int changepawns = 0;
	    
	
	    System.out.println(changeking=differnce(kings,cking));
	    System.out.println(changequeens=differnce(queens,cqueens));
	    System.out.println(changerooks=differnce(rooks,crooks));
	    System.out.println(changebishops=differnce(bishops,cbishops));
	    System.out.println(changeknights=differnce(knights,cknights));
	    System.out.println(changepawns=differnce(pawns,cpawns));
	    }
	    
	}


