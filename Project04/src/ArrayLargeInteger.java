import java.util.*;

/*
 * @author Cade Justad-Sandberg
 * @version 4/20/19
 * Project 04
 * Class that implements LargeInteger through the use of Arrrays
 */


public class ArrayLargeInteger implements LargeInteger {

	
	ArrayList<String> array = new ArrayList<String>();
	ArrayList<String> zero = new ArrayList<String>(Arrays.asList("0"));
	ArrayList<String> one = new ArrayList<String>(Arrays.asList("1"));	
	ArrayList<String> ten = new ArrayList<String>(Arrays.asList("10"));
		
	/*
	 * @param the initial number as a string to be stored
	 * the constructor for ArrayLargeInteger
	 */
	ArrayLargeInteger(String string){
		//String[] str = string.split(", ");
		for(int i=0; i<string.length();i++ ) {
			//System.out.println(string.charAt(i));
			//array.add(string.charAt(i));
			//System.out.println(string.substring(i,i+1));
			array.add(string.substring(i,i+1));
			//array.add(str[i]);
		}
		
	}
	
	/*
	 * 1 if positive 0 if 0 and -1 if negative
	 * @return int 1 if positive 0 if 0 and -1 if negative
	 */
	public int Signum() {
		if(array.get(0).contains("-")) {
			//System.out.println("- case worked");
			return -1;
		}
		if(this.array.equals(zero)) {
			return 0;
		}
		//System.out.println(array.get(0).contains("-"));
		return 1;
	}
	
	/*
	 * this method will output the absolute value
	 * @return LargeInteger
	 */
	public LargeInteger abs() {
		if(this.Signum()==0||this.Signum()==1) {
			return this;
		}
		
		ArrayLargeInteger output = new ArrayLargeInteger(array.toString());
		for (int i = output.array.size()-1; i>=0;i--) {
			if(output.array.get(i).equals(",")|| output.array.get(i).equals("[")||output.array.get(i).equals("]")||output.array.get(i).equals(" ")) {
				output.array.remove(i);
			}
		}
		output.negate();
		return output; 
	}
	
	/*
	 * returns the opposite signed version of the number
	 * @return largeinteger
	 */
	public LargeInteger negate() {
		if(this.Signum()==-1) {

			array.remove("-");
			ArrayLargeInteger output = new ArrayLargeInteger(array.toString());
			for (int i = output.array.size()-1; i>=0;i--) {
				if(output.array.get(i).equals(",")|| output.array.get(i).equals("[")||output.array.get(i).equals("]")||output.array.get(i).equals(" ")) {
					output.array.remove(i);
				}
			}
			return output;
		}
		if (this.Signum()==0) {
			return new ArrayLargeInteger(array.toString());	
		}
		array.add(0, "-");
		ArrayLargeInteger output = new ArrayLargeInteger(array.toString());
		for (int i = output.array.size()-1; i>=0;i--) {
			if(output.array.get(i).equals(",")|| output.array.get(i).equals("[")||output.array.get(i).equals("]")||output.array.get(i).equals(" ")) {
				output.array.remove(i);
			}
		}
		return output;
	}
	
	
	public LargeInteger max(LargeInteger input) {
		//take care of differences in signs
		if (input.signum()>this.Signum()) {
			return input;
		} if (input.signum()<this.Signum()) {
			return this;
		}
		//now for the rest
		//dealing with negative numbers
		if(this.Signum()==-1) {
			
		}
		return input;
	}
	
	
	public LargeInteger subtract(LargeInteger input) {
		//create new ArrayList from LargeInteger
		ArrayLargeInteger inputarray = new ArrayLargeInteger(input.toString());
		ArrayLargeInteger workingarray = new ArrayLargeInteger(this.array.toString());
		//finding max size to iterate through
		int maxsize = inputarray.array.size()> workingarray.array.size() ? inputarray.array.size(): workingarray.array.size();
		//append zeros onto fron of each array to make them same length
		
		
		
		if (input.equals(zero)) {
			return this;
		}
		//deal with negative cases
		if (input.signum()==-1) {
			//if input is negative  no code here
			if(this.signum()==-1) {
				//input and this negative
				
			}
			//code for if only input is negative
			//run the add method here
		}
		if(this.signum()==-1) {
			//if this is - 
			//run normal subtraction
			
		}
	//if both positive
		
		for (int i = maxsize; i>=0;i--) {
			
		}
		
	
	}
	
	
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}
	public boolean equals(Object o) {
		return true;
	}
	
	/*
	 * @return a string displaying the number stored
	 * a toString method 
	 */
	public String toString() {
		//System.out.println(array.toString());
		
		StringBuilder sb = new StringBuilder("");
		for(int i=0; i<array.size();i++ ) {
			sb.append((array.get(i)));
			//System.out.println(array.get(i));
			
			
		}
		System.out.println(sb.toString());
		return sb.toString();
		//return array.toString();		
	}
	
	

}
