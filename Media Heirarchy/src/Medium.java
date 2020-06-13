
public abstract class Medium {
/*
 * 
 * 
 */
	
	/**
	@author - Cade Justad-Sandberg
	@version - 2/22/19
	Medium
	Abstract class to create the outline of medium to be used later 

	*/
	int year;
	String creator;
	String title;
	/*
	 * Constructor that creates a Medium 
	 * @param year - the year when it was created
	 * @param creator- the person who created the media
	 * @param title - name of the media
	 */
	
	
	public Medium(int year, String creator, String title) {
		this.year = year;
		this.creator = creator;
		this.title = title;
	}
	
	/*
	 * overrides toString to output necessary information
	 * @return string
	 * 
	 */
	
	public String toString() {
		
		return "The movie " + title + " was made in " + year + " by " + creator;  
		
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
		Medium md = (Medium) obj;
		return year == md.year && creator.equals(md.creator) && title.equals(md.title);
		//Professor pf = (Professor) obj;
		//return officeLocation.equals(pf.officeLocation);
	}
	
	/*
	 * creates a unique hash number
	 * @return int
	 */
	
	@Override
	public int hashCode() {
		//small prime number hash
		int hash = 7;
		hash = 13 * hash +year;
		hash = 21 * hash + creator.hashCode();
		hash = 3 * hash + title.hashCode();
		return hash;
		//everything thats used in equality test shoudl show up in hashcode test
		
	}
	
	/*
	 * @return int
	 * getter for year variable
	 */
	final public int getYear() {
		return year;
	}
	/*
	 * 
	 * setter for year variable
	 */
	final public void setYear(int year) {
		this.year = year;
	}
	/*
	 * @return String
	 * getter for creator variable
	 */
	final public String getCreator() {
		return creator;
	}
	
	/*
	 * 
	 * Setter for creator variable
	 */
	final public void setCreator(String creator) {
		this.creator = creator;
	}
	
	/*
	 * @return String
	 * getter for title variable
	 */
	final public String getTitle() {
		return title;
	}
	/*
	 * setter for title variable
	 */
	final public void setTitle(String title) {
		this.title = title;
	}
	
	
}
