package project3_carwash;

import java.util.Random;

/**
@author - Cade Justad-Sandberg
@version - 3/29/19
CarWashOptions
Enum to create various types of car washes
*/
public enum CarWashOption {

	STANDARD(5,10.5),
	AWFUL(1,3.0),
	AMAZING(10,21.6),
	LUXURIOUS(30,30.6),
	ISTHISNECESSARY(60,120.0);
	
	
	private static CarWashOption[] vals = values();
	private static Random gen = new Random();
	
	private int time;
	private double price;
	/*
	 * @param takes an int for the time of a wash and a double for time of wash
	 * constructor for types of car washes
	 */
	CarWashOption(int time, double price){
		
		this.time = time;
		this.price = price;
	}
	
	/*
	 * getter for time of car wash
	 * @return time of wash
	 */
	public int getTime() {
		return this.time;

	}
	
	/*
	 * getter for price of car wash
	 * @return double price of wash
	 */
	public double getPrice() {
		return this.price;
		
	}
	
	/*
	 * method to get random values
	 */
	public static CarWashOption getRandomOption() {
		return vals[(gen.nextInt(vals.length))];
		}
		
	
}
