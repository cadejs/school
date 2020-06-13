
public class Time {

	
	int hours;
	int minuets;
	int seconds;
	
	
	/*
	 * Constructor that creates a Time class
	 * @param hours - hours long
	 * @param minuets- minuets long
	 * @param seconds - Seconds long
	 */
	public Time (int hours, int minuets, int seconds) {
		this.hours = hours;
		this.minuets = minuets;
		this.seconds = seconds;
		
		
	}
	
	/*
	 * overrides toString to output necessary information
	 * @return string
	 * 
	 */
	public String toString() {
		return "The time is saying that it is " + hours + " hours" +  minuets + " minuets and" + seconds + " seconds";
	}
	
	/*
	 * overrides equals to compare objects
	 * @return boolean
	 * 
	 */
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null) return false;
		if (getClass()!=obj.getClass() ) return false;
		if (!super.equals(obj)) return false;
		Time ti = (Time) obj;
		return hours == ti.hours && minuets == ti.minuets && seconds == ti.seconds ;
		
	}
	
	/*
	 * creates a unique hash number
	 * @return int
	 */
	
	@Override
	public int hashCode() {
		//small prime number hash
		int hash = 3;
		hash = 13 * hash + this.hours;
		hash = 21 * hash + this.minuets;
		hash = 3 * hash + this.seconds;
		return hash;
		//everything thats used in equality test shoudl show up in hashcode test
		
	}
	
	/*
	 * @return int
	 * outputs time in seconds
	 */
	
	final public int gettotaleSeconds() {
		return (hours*60*60)+(minuets*60)+seconds;
	}
	/*
	 * @return int
	 * getter for hours variable
	 */
	public int getHours() {
		return hours;
	}
	/*
	 * @return int
	 * getter for miuets variable
	 */
	public int getMinuets() {
		return minuets;
	}
	/*
	 * @return int
	 * getter for seconds variable
	 */
	public int getSeconds() {
		return seconds;
	}

}
