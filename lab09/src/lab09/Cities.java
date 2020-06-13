package lab09;

public class Cities {

	int defaultsize = 10;
	City[] cities; //= new City[defaultsize];
	int size = 0;
	
	
	public Cities () {
		this.cities = new City[defaultsize];
	}
	
	public void addCity(City city) {
		cities[size] = city;
		this.size++;
	}
	
	public int findPopulation(String name) {
		for (City i: this.cities) {
			if(i.getCityname().equals(name)) {
				return i.getPopulation();
			}
		} return 0 ;  // no city
		
	}
	
	public City biggestPopulation() {
		City Cityreturn = cities[0]; 
		for (City i: this.cities) {
			if(i.getPopulation() > Cityreturn.getPopulation()) {
				Cityreturn = i;
			}
		} return Cityreturn ; 
		
	}
	public int totalPopulation() {
		int totalpop=0; 
		for (City i: this.cities) {
			totalpop = totalpop + i.getPopulation();
		} return totalpop ; 
		
	}
	
	public int avgPopulation() {
		int totalpop=0; 
		for (City i: this.cities) {
			totalpop = totalpop + i.getPopulation();
		} return totalpop / this.size; 
		
	}
	
	public String bound(int lower, int higher) {
		boolean test = false;
		StringBuilder sb = new StringBuilder("");	
		for (int i = 0; i<this.size; i++) {
			if (this.cities[i].getPopulation()>lower && this.cities[i].getPopulation()<higher) {
				test = true;
				sb.append(" ["+ this.cities[i].getCityname().toString()+ "]\n");
				
			}
		}
		if(test) {
			return sb.toString();
		}
		
		return "[]";
	}
	
	@Override
	public String toString(){
		if (size==0) {
			 return "[]";
		}
		StringBuilder sb = new StringBuilder("");	
		for (int i = 0; i<this.size; i++) {
			sb.append(" ["+this.cities[i].toString()+ "]\n");	
	}
return sb.toString();
	}
	
@Override
public boolean equals(Object obj) {
	if (this == obj) return true;
	if (obj == null) return false;
	if (getClass()!=obj.getClass() ) return false;
	Cities p = (Cities) obj;
	//int counter = 0;
	
	for (int i = 0; i<this.size; i++) {
		
		if (!this.cities[i].getCityname().equals(p.cities[i].getCityname()) && this.cities[i].getPopulation()!=p.cities[i].getPopulation()  ) {
			return false;
		}
		//counter++;
	}
	return true;
	
}


@Override
 public int hashCode() {
	int hash = 5;
	if (this.size==0) {
		return hash;
	}
	for(int i = 0; i<this.size; i++) {
		hash = this.cities[i].hashCode();
	}
	return hash;
	
}


	public static void main(String[] args) {
		//now for the testing make two identical arrays and one different one
		
		City city1 = new City("asheville", 200000);
		City city2 = new City("town", 20);

		Cities test1 = new Cities();
		Cities test11 = new Cities();
		Cities test3 = new Cities();
		Cities test4 = new Cities();
		
		test1.addCity(city1);
		test11.addCity(city1);
		test3.addCity(city2);
		test4.addCity(city1);
		test4.addCity(city2);

		
		//testing equals and add
		assert test1.equals(test11) : "Expected true, got " + test1.equals(test11);
		assert test1.equals(test3) : "Expected false, got " + test1.equals(test3);
		//testing find population
		assert test3.findPopulation("town")==20 : "Expected 20, got " + test3.findPopulation("town");
		//testing biggest population
		assert test4.biggestPopulation().equals(city1) : "Expected true, got " + test4.biggestPopulation() ;
		//testing total population
		assert test4.totalPopulation() == 200020 : "Expected 200020, got " + test4.totalPopulation();
		//testing average population
		assert test4.avgPopulation() == 200020/2 : "Expected 200020, got " + test4.avgPopulation();
		//testing bound function
		assert test4.bound(200, 1000000).equals("[asheville]") : "Expected [asheville], got "  + test4.bound(200, 1000000);
		//testing hash code
		assert test4.hashCode() == test4.hashCode() : "Expected 39228869, got "+ test4.hashCode();
		System.out.println("All good");

	}
	
	
}

