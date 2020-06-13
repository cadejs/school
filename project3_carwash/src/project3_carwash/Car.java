package project3_carwash;



public class Car {

	
	private CarWashOption option;
	private int timeleft;
	/*
	 * constrcutor taking CarWashOption as parameter
	 * @params a car wash option the car wants
	 */
	public Car(CarWashOption option){
		this.timeleft = option.getTime();
		this.option = option;
		
	}
	 /*
	  * method to take one time step off of a carwash
	  */
	public void washincrement() {
		 
			this.timeleft--;
			
		
	}
	
	

	/*
	 * getter for car wash option
	 * @return a car wash option
	 */
	public CarWashOption getOption() {
		return option;
	}
/*
 * getter for time left
 */
	public int getTimeleft() {
		return timeleft;
	}
	
	
	
	
}
