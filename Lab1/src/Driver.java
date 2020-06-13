
public class Driver {

	public static void main(String[] args) {
	
	Movie goodmovie = new Movie("The Shinning","Stanley Kubrick",1980,144);
	
	//test getters and to string
	
	System.out.println(goodmovie.getdirector());
	
	System.out.println(goodmovie.getlength());
	
	System.out.println(goodmovie.getname());
	
	System.out.println(goodmovie.getyear());
	
	System.out.println(goodmovie.toString());
	
	// test setters 
	goodmovie.setdirector("Q-brick");
	goodmovie.setyear(1996);
	goodmovie.setname("That movie with the guy with the axe and the door");
	goodmovie.setlength(200);
	
	System.out.println(goodmovie.toString());
	
	

	}

}
