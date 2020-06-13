package edu.unca.csci202;

public class Main {
	/**
	 * 
	 * @author CadeJustadsandberg
	 *
	 */
	public static void main(String[] args) {
		
		
		/*
		 * @param the input is the command line arguments of the file to read in and the name to write out a file too
		 * @throws
		 * This method takes in input from the user and then drives the program
		 */
		
		//Code to hard test file output "/Users/CadeJustadsandberg/Desktop/Spring 2019/CSCI202/Lab03.202/input.txt";
	
		
		
		if (args.length !=2) {
			System.out.println("You should input your data in the following format : Java Main \"inputfile\" \"outputfile\"");
		
			System.exit(0);
		}
		
		
		Warehouse test = new Warehouse();
	
		test.ReadInventoryFile(args[0]);
		
		test.writeOutputFile(args[1]);
		
		
	
	}

}
