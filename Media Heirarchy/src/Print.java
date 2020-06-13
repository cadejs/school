
public class Print extends Medium{
	/**
	@author - Cade Justad-Sandberg
	@version - 2/22/19
	Print
	Class extends Medium to create template for storing print medium information

	*/
	int pages;
	
	/*
	 * Constructor that creates a Print class
	 * @param year - the year when it was created
	 * @param creator- the person who created the media
	 * @param title - name of the media
	 * @param pages - number of pages
	 */
	
	public Print(int year, String creator, String title, int pages) {
		super(year, creator, title);
		this.pages = pages;
	}
	/*
	 * overrides toString to output necessary information
	 * @return string
	 * 
	 */
public String toString() {
		
		return super.toString() + " and it has " + pages + " pages";  
		
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
		Print pr = (Print) obj;
		return pages == pr.pages;
	}
	
	/*
	 * creates a unique hash number
	 * @return int
	 */
	@Override
	public int hashCode() {
		int hash = 3;
		hash = 5 * hash + super.hashCode() + pages;
		return hash;
		
	}
	
}
