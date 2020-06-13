package project3_carwash;

import java.text.DecimalFormat;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;
/**
@author - Cade Justad-Sandberg
@version - 3/29/19
CarWash
to create car wash objects to run simulations on
*/
public class CarWash {

	
	private static Random gen = new Random();

	int bays;
	int linemaxed;
	int timestep;
	double carchance;
	int maxbaysize = 10;
	Queue<Car>[] carlines;
	int carinline;
	int shortestline = 0;
	double totalearned = 0;
	int carswashed= 0;
	int leftin = 0;
	DecimalFormat dt = new DecimalFormat("#.##"); 

	
	
	
	/*
	 * @params int of number of bay doors
	 * Constructor of CarWash to create an array of queues to process data
	 */
	public CarWash(int bays) {
		this.bays=bays;
		carlines = new Queue[maxbaysize];
		//create array of queues to hold car types
		for (int i =0; i<bays; i++) {
			carlines[i] =  new LinkedList<Car>() ;
			
		}
		
	}
	/*
	 * @params int timestep - number of time steps to run
	 * @param double  carchance - chance a car will show up
	 * runs the simulation a set number of time steps while udpating global variables to be output in printData()
	 */
	public void run(int timestep, double carchance) {
	this.timestep = timestep;
	this.carchance = carchance;
	int baytoadd = 0;
	
	for (int timecounter=0; timecounter<timestep; timecounter++) {
		//test here
		for (int i=0; i<bays;i++) {
			 shortestline = carlines[0].size();
				if (carlines[i].size() <= shortestline) {
					baytoadd = i;
				}
			//System.out.println(i+ "  "+carlines[i].size());
		}
		
		
			if (gen.nextDouble()<=carchance) {
				
						carlines[baytoadd].add(new Car((CarWashOption.getRandomOption())));				
						carinline++;
		
				for (int i=0; i<bays;i++) {
					 if (carlines[i].isEmpty()); else {//runs a time step for each car, then removes all clean cars and edits the car in line number
						 carlines[i].peek().washincrement();
						if(carlines[i].peek().getTimeleft()==0) {
							totalearned = totalearned + carlines[i].peek().getOption().getPrice();
							carlines[i].remove();
							carinline--;
							carswashed = carswashed+1;
							
						} 
						}
						
						
					
					
				}
				 } else if(carinline!=0) {  
						 for (int i=0; i<bays; i++) {
							 if (carlines[i].isEmpty()) {;}
							 else { 
								//runs a time step for each car, then removes all clean cars and edits the car in line number
								 carlines[i].peek().washincrement();
								
								 if(carlines[i].peek().getTimeleft()==0) 
								{
									 totalearned = totalearned + carlines[i].peek().getOption().getPrice();
									carlines[i].remove();
									carinline--;
									carswashed = carswashed+1;
									
								} 
								 
							 }
							
							
						}	
					
					} else ; 
	       if(carinline>linemaxed) { linemaxed=carinline; }
			//System.out.println("Time Counter"+ timecounter);
	} 
		for (int i=0; i<bays;i++) {
			leftin = carlines[i].size()-1;
		}	
		} 
		

	
	/*
	 * method to print out the results of simulation run
	 */
	public void printData() {
		System.out.println("There were "+ bays + " bays, " + timestep +" timesteps, a " + carchance + "\n chance a car showed up each timestep and the line maxed out at " + linemaxed + "\n this was made $"+dt.format(totalearned) + " washing " +
	carswashed+ " cars with " +leftin + " left in queue\n");
		
	}
	
	
	
}
