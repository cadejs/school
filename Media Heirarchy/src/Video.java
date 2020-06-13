
public class Video extends TimedMedium {

	/**
	@author - Cade Justad-Sandberg
	@version - 2/22/19
	Time
	Class extends TimedMedium to create template for storing video information

	*/
	int resolution;
	/*
	 * Constructor that creates a TimedMedium class
	 * @param year - the year when it was created
	 * @param creator- the person who created the media
	 * @param title - name of the media
	 * @param Time - instance of Time object that stores length
	 */
	
	public Video(int year, String creator, String title, Time time, int resolution) {
		super(year, creator, title, time);
		this.resolution = resolution;
	}
	/*
	 * creates a unique hash number
	 * @return int
	 */
	@Override
	public int hashCode() {
	int hash =5;
	hash = 7 * hash + super.hashCode() + resolution;	
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
		Video vd = (Video) obj;
		return resolution == vd.resolution;
		
	}
	/*
	 * overrides toString to output necessary information
	 * @return string
	 * 
	 */
	public String toString() {
		return super.toString() + " and the resolution is " + resolution;
		
	}
	
}
