package edu.unca.csci235;

public class Cell {
/*
 * 
    @author - Cade Justad-Sandberg
    @version - 2/1/19
    Cell
    This class can be used to create Cell object containing the properties needed to play minesweeper. 
 * 
 * 
 */
	
	
	private boolean bombpresnet = false;
	private int adjacentbombs;
	private boolean guessedasbomb = false;
	private boolean guessedasempty = false;
	
/*
 * This method is setter that changes boolean bombpresent to true in a Cell
 */
	void bombsetter(){
		this.bombpresnet=true;
	}
	/*
	 * @return boolean
	 * This method is getter that returns the value of bombpresent of a cell
	 */
	boolean bombgetter() {
		return this.bombpresnet;
	}
	
	/*
	 * @return String
	 * This method is returns varying characters based on if the cell has been guessed as bomb, contains a bomb, or the number of adjacent bombs
	 * 
	 */

	String getoutput() {
		 if (this.guessedasbomb && this.bombpresnet) {
			return " M ";
		} else if(this.guessedasempty && !this.bombpresnet) {
			return " " + this.adjacentbombs +" ";
		} else {
			return " - ";
		}
		
	}
	/**
	 * @return String
	 * method to get output to peek at the board showing the bomb locations
	 */
	String getoutputpeek() {
		 if (this.bombpresnet) {
			return " M ";
		} else if(this.guessedasempty && !this.bombpresnet) {
			return " " + this.adjacentbombs +" ";
		} else {
			return " - ";
		}
		
	}
	
	/**
	 * method to change update the boolean guessedasbomb if user guesses it as a bomb
	 */
	void adjacentbombadd(){
		this.adjacentbombs++;
	}
	
	/**
	 * method to change update the boolean guessedasbomb if user guesses it as a bomb
	 */
	void guessedasbomb() {
		this.guessedasbomb = true;
	}
	
	/**
	 * method to change update the boolean guessedasempty if user guesses it as a bomb
	 */
	void guessedasempty() {
		this.guessedasempty = true;
	}

	/**
	 * method to change update the boolean guessedasempty if user guesses it as a bomb
	 */

	/**
	 * @return String
	 * method to return M if bombpresent true and to add to bombsadjacent 
	 */
	private String getoutputadjacent() {
		if (this.bombpresnet) {
			return " M ";
		}
		return " "+ this.adjacentbombs + " ";
	}	
	
	
	
}
