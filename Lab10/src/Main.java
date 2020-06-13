

public class Main {

	public static void main(String[] args) {
		recursivePrint(1,4);

	}

	public static void recursivePrint(int currentlvl, int maxlvl) {
		int mlvl = maxlvl;
		int clvl =currentlvl;
		

		
		String spc = new String(new char[clvl-1]).replace("", " ");
		
		
		if( clvl<mlvl) {
			System.out.println(spc+"This was written by call number " + clvl );
			//clvl++;
			recursivePrint(clvl+1,mlvl);
			
		}
		
		if (clvl==mlvl) {
			System.out.println(spc+"This was written by call number " + clvl);
		}
		System.out.println(spc+"This was ALSO written by call number " + clvl);
		
		//test if max is >= base
		
		//print out the base level
		
		//call 
		
		
	}
	
}
