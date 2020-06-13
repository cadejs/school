
public class AudioMedium extends TimedMedium {
	/**
	@author - Cade Justad-Sandberg
	@version - 2/22/19
	AudioMedium
	Class extends TimedMedium to create template for storing audio medium information

	*/
	
	/*
	 * Constructor that creates a AudioMedium class
	 * @param year - the year when it was created
	 * @param creator- the person who created the media
	 * @param title - name of the media
	 * @param Time - instance of Time object that stores length
	 */
	public AudioMedium(int year, String creator, String title, Time time) {
		super(year, creator, title, time);
		
	}

	/*
	 * overrides equals to compare objects
	 * @return boolean
	 * 
	 */
	public boolean equals(Object obj) {
		return super.equals(obj);
		
	}
	/*
	 * overrides toString to output necessary information
	 * @return string
	 * 
	 */
	public String toString() {
		return super.toString();
		
	}
	/*
	 * creates a unique hash number
	 * @return int
	 */
	public int hashCode() {
	return super.hashCode();
	}
}
