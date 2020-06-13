
public abstract class TimedMedium extends Medium {

	/**
	@author - Cade Justad-Sandberg
	@version - 2/22/19
	TimedMedium
	Abstract class to create the outline of timed medium to be used later 

	*/

	int hours;
	int minuets;
	int seconds;
	Time time;
	
	/*
	 * Constructor that creates a TimedMedium class
	 * @param year - the year when it was created
	 * @param creator- the person who created the media
	 * @param title - name of the media
	 * @param Time - instance of Time object that stores length
	 */
	public TimedMedium(int year, String creator, String title, Time time) {
		super(year, creator, title);
		
		this.hours = time.hours;
		this.minuets = time.minuets;
		this.seconds = time.seconds;
		
		
	}
	
	/*
	 * creates a unique hash number
	 * @return int
	 */
	@Override
	public int hashCode() {
	int hash =5;
	hash = 7 * hash + super.hashCode() + hours;
	hash = 3 * hash + minuets;
	hash = 13 * hash + seconds;
	return hash;

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
		TimedMedium tm = (TimedMedium) obj;
		return hours == tm.hours && minuets == tm.minuets && seconds == tm.seconds ;
		
	}
	/*
	 * overrides toString to output necessary information
	 * @return string
	 * 
	 */
	
	public String toString() {
		return super.toString() + " and the movie is " + gettotalSeconds() + " seconds long";
		
	}
	/*
	 * @return int
	 * getter for hours variable
	 */
	final public int getHours() {
		return hours;
	}
	/*
	 * @return int
	 * getter for miuets variable
	 */
	final public int getMinuets() {
		return minuets;
	}
	/*
	 * @return int
	 * getter for seconds variable
	 */
	final public int getSeconds() {
		return seconds;
	}
	/*
	 * @return int
	 * outputs time in seconds
	 */
	final public int gettotalSeconds() {
		return (hours*60*60)+(minuets*60)+seconds;
	}
	
}
