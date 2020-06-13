
public class Movie {

	String name;
	String director;
	int year;
	int length;
	String formatedinfo;
	
	public Movie (String name1, String name2, int year1, int length1){
		this.name = name1;
		this.director = name2;
		this.year = year1;
		this.length = length1;
	}
	
	void setdirector(String directorinput) {
		this.director = directorinput;
	}
	
	void setname(String nameinput) {
		this.name = nameinput;
	}
	
	void setyear(int yearinput) {
		this.year = yearinput;
	}
	
	void setlength(int lengthinput) {
		this.length = lengthinput;
	}
	
		String getname () {
		return this.name;	
		}
	
		String getdirector () {
			return this.director;	
			}
		
		int getyear () {
			return this.year;	
			}
		
		int getlength () {
			return this.length;	
			}
		
		public String toString () {
			this.formatedinfo = this.name +", "+ this.director +", " + this.year +", " + this.length;
			
			return this.formatedinfo;
		}
	}

