
public class MediumDriver {

	public static void main(String[] args) {
		/**
		@author - Cade Justad-Sandberg
		@version - 2/22/19
		Media Class Heirarchy
		Driver program to create instance of Media classes and test their methods
		*/
		
		
		Time t1 = new Time(1,30,45);
		Time t2 = new Time(0,3,30);
		Time t3 = new Time(0,2,10);
		
		Video v1 = new Video(1996,"freddy", "bugslife", t1,1000);
		AudioMedium am1 = new AudioMedium(2012, "music maker","songtime",t2);
		AudioMedium am2 = new AudioMedium(2010, "music ","eagles",t3);
		Print p1 = new Print(2012,"book writer","booky",345);
		Print p2 = new Print(2012,"book writer","booky",345);
		Print p3 = new Print(1000,"big book writer","booky book",250);
		

		
		Medium[] ArrayList = new Medium[7];
		
		ArrayList[0] = v1;
		ArrayList[1] = am1;
		ArrayList[2] = p1;
		ArrayList[3] = p1;
		ArrayList[4] = am2;
		ArrayList[5] = p2;
		ArrayList[6] = p3;
		
	

	
	System.out.println("This is the for each loop requested");
		
	for (Medium Medium: ArrayList) {
		if ((Medium.getClass()  == v1.getClass())) {
			
			System.out.println(Medium.toString());
			System.out.println(Medium.hashCode());
			System.out.println("");
		}
			if (Medium.getClass() == am1.getClass()) {
				
				System.out.println(Medium.toString());
				System.out.println(Medium.hashCode());
				System.out.println("");
					}
			if (Medium.getClass() == p1.getClass()) {
				
				System.out.println(Medium.toString());
				System.out.println(Medium.hashCode());
				System.out.println("");
			}
			if(Medium.equals(Medium)) {
				 System.out.println("Medium of title "+ Medium.title + "'s  .equals() method works");
				 System.out.println("");
			 }
			
	}
	
	
	}

}
