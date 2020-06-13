package lab09;

public class Main {

	public static void main(String[] args) {
		recerusivePrint(1,4);

	}

	public static recersivePrint(int currentlvl, int maxlvl) {
		int mlvl = maxlvl;
		int clvl =currentlvl;
		
		while( clvl<mlvl) {
			System.out.println("Current Level: " + clvl );
			clvl++;
			recersivePrint(clvl,mlvl)
			
		}
		System.out.println("Current Level: " + clvl);
		
		//test if max is >= base
		
		//print out the base level
		
		//call 
		
		
	}
	
}
