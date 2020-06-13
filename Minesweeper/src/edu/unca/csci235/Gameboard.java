package edu.unca.csci235;
import java.util.Random;
import java.util.Scanner;

/**
@author - Cade Justad-Sandberg
@version - 2/1/19
Gameboard
class that can be used to create and instance of Gameboard which can used to play minecraft in conjunction with a Cell class

*/
public class Gameboard {
	
	private int numberofbombs =10;
	private static int numberofrows = 10;
	private static int numberofcollums = 10;
	private Cell[][] matrix; 
    private boolean gamerunning = true;
    private boolean playagain = true;
    
	/**

    This method creates a new board with a number of randomlly placed bombs and an extra pair of rows and collums to surround the grid

 */	
	private void makeboard() {
		Cell[][] matrix = new Cell[numberofrows][numberofcollums];
		for (int i=0; i<matrix.length; i++) {		
			for (int j=0; j<matrix[i].length; j++ ) {
				matrix[i][j] = new Cell();	 
			}
		}
		
		for (int i=1; i<=this.numberofbombs;) {
			Random rand = new Random();
			
			int row = rand.nextInt(numberofrows-2)+1;
			
			int col = rand.nextInt(numberofcollums-2)+1;
			
			if (!matrix[row][col].bombgetter()) {
				matrix[row][col].bombsetter();
				i++;
			}
	}
		 this.matrix = matrix;
	}
/**

    This method outputs the current board with "-" for unguessed, "M" for bombs and string 0-8 for guessed 
    indicating how many bombs are adjacent

 */

	private void printboard() {
		for (int i=0; i<this.matrix.length; i++) {		
			for (int j=0; j<this.matrix[i].length; j++ ) {
				if (i==0 || i ==this.matrix.length-1 || j==0 || j==this.matrix[i].length-1) ; 
				else {
					System.out.print(this.matrix[i][j].getoutput());
				}
			}
			System.out.println("");
		}
	}
	
	
	/**
  
    This method go through an array to determine calculate the number of bombs adjacent to a array cordinate
 */
	
	private void addbombsadjacent() {
			for (int i=0; i<this.matrix.length; i++) {		
				for (int j=0; j<this.matrix[i].length; j++ ) {
					  if (this.matrix[i][j].bombgetter()) {
						this.matrix[i+1][j-1].adjacentbombadd();
						this.matrix[i+1][j].adjacentbombadd();
						this.matrix[i+1][j+1].adjacentbombadd();
						this.matrix[i-1][j-1].adjacentbombadd();
						this.matrix[i-1][j].adjacentbombadd();
						this.matrix[i-1][j+1].adjacentbombadd();
						this.matrix[i][j-1].adjacentbombadd();
						this.matrix[i][j+1].adjacentbombadd();
					}
					else ;
	}}}
	
	
	/**
    This method allows the entire matrix to be seen, excluding the buffer rows added
 */
	private void peak() {
		for (int i=0; i<this.matrix.length; i++) {		
			for (int j=0; j<this.matrix[i].length; j++ ) {
				if (i==0 || i ==this.matrix.length-1 || j==0 || j==this.matrix[i].length-1) ; 
				else {
					System.out.print(this.matrix[i][j].getoutputpeek());
				}
				}
			System.out.println("");
		}
	}
	
	/**
  
    This method allows the user to input cordinates to guess for a mine or open space and plays the game until they lose 
 */
	
	private void playgame() {
		this.gamerunning=true;
		while (this.gamerunning) {
			//need this to loop until the player either wins or loses
			System.out.println("Would you like to peak and see the mines? (yes/no)");
			Scanner scan = new Scanner(System.in);
			String userinput= scan.next();
			if (userinput.equals("yes")) {
				peak();
			}

			System.out.println("Please enter the row number followed by the collum number");
			int collumtocheck = scan.nextInt();
			int rowtocheck = scan.nextInt();
			collumtocheck++;  rowtocheck++;
			System.out.println("Does this location contain a bomb (yes/no)");

			String bombguess = scan.next();
			if (bombguess.equals("yes") && this.matrix[collumtocheck][rowtocheck].bombgetter()) {
				this.matrix[collumtocheck][rowtocheck].guessedasbomb();
				 printboard();
				
			}else if(!bombguess.equals("yes") && !this.matrix[collumtocheck][rowtocheck].bombgetter()) {
				this.matrix[collumtocheck][rowtocheck].guessedasempty();
				printboard();
			} else {
				this.gamerunning=false;
				System.out.println("The game is over");
				
				
			}

		}
	}


	/**
	 * 
	 * method to run all methods required to play game, including take user input, and stay in loop until exited by user input
	 */
	void run() {
		
		while (this.playagain) {
		makeboard();
		addbombsadjacent();
		printboard();

	
		playgame();
	
	System.out.println("Would you like to play again? (yes/no)");
	Scanner scan = new Scanner(System.in);
	String userinput1= scan.next();
	if (userinput1.equals("no")) {
		this.playagain = false;
	}
		}
	}
	
	

	
}

