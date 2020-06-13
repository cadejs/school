package lab09;

public class City {

	
	
	private String cityname;
	private int population;
	
	City(String cityname, int population){
		this.cityname = cityname;
		this.population = population;
		
	}

	public String getCityname() {
		return cityname;
	}

	public int getPopulation() {
		return population;
	}
	
	
	
	public String toString() {
		return cityname + " has a population of " + population;
		
	}
	
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null) return false;
		if (getClass()!=obj.getClass() ) return false;
		City p = (City) obj;
		return population == p.population && cityname.equals(cityname);
		
	}
	
	public int hashCode() {
		int hash = 3;
		hash = 11 * hash +cityname.hashCode();
		hash = 11 * hash + population;
		return hash;
		
	}

	public static void main(String[] args) {
		
		City city1 = new City("asheville", 200000);
		City city11 = new City("asheville", 200000);
		City city2 = new City("town", 20);

		assert city1.cityname.equals("asheville") : "Expected asheville, got " + city1.cityname;
		assert city1.population == 200000 : "Expected 200000, got " + city1.getPopulation();
		assert city1.equals(city11) : "Expected true got " + city1.equals(city11);
		assert !city1.equals(city2) : "Expected false got " + city1.equals(city2);
		assert city1.hashCode() == city11.hashCode() : "Expected true got " + city1.equals(city11);
		assert city1.toString().equals(city11.toString()) : "Expected true got "+ city1.toString().equals(city11.toString());
		
		System.out.println("All good");
		
	}
	
}
