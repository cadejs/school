package edu.unca.csci202;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * 
 * @author CadeJustadsandberg
 *
 */

public class Warehouse {

	 private InventoryItem[] ArrayList;
	 private int sizeofarray = 5;
	 
	 //going to hard code array as 5 units
	 
	 /**
	  * 
	  * @param userfileread
	  * @param userfilewrite
	  * This method takes in the data from the file and organizes into an object array of InventoryItems
	  */
	
	void ReadInventoryFile(String  userfileread ) {
		
		InventoryItem[] ArrayList = new InventoryItem[sizeofarray];
		for (int i=0; i<ArrayList.length;i++) {
			ArrayList[i]= new InventoryItem();
		}
		
		File inputFile = new File(userfileread);
		Scanner in = null;

		try {
			 in = new Scanner(inputFile);
			 
			 int counter = 0;
				
				while (in.hasNext()) {
					
						if (!in.hasNextInt()) {
							ArrayList[counter].setdescrpition(in.nextLine());
						}
						
						ArrayList[counter].setsku(in.nextInt());
						ArrayList[counter].setprice(in.nextDouble());
						ArrayList[counter].setquantity(in.nextInt());
						in.nextLine();
					
						counter++;
					
					}

				this.ArrayList=ArrayList;
		}
	
	catch (FileNotFoundException e) {
		System.out.println("The input file you entered in invalid");
	}
		
	}
	
	/**
	 * @param the name of the file the user chose to write out to
	 * @throws  FileNotFoundException 
	 * This method takes the array data from ReadInventoryFile and outputs to a text file
	 */
	public void writeOutputFile(String userfilewrite) {
		
		PrintWriter pw;
		try {
			
			pw = new PrintWriter(userfilewrite);
		
			
			for ( InventoryItem i: ArrayList) {
				
				
				pw.print(i.getdescription() + " ");
				pw.print(i.getsku()+  " ");
				pw.print(i.getprice()+ " ");
				pw.println(i.getquantity());
				
			}

			
			pw.close();
		} catch (FileNotFoundException e) {
			System.out.println("please enter a valid file name");
			
		}
		
	}
	/**
	 * 
	 * @param inputfilename
	 * @throws FileNotFound
	 * This method reads in a file of the grocery inventory and stores it into an array
	 */
	
	
}
