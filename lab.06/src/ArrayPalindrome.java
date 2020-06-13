
public class ArrayPalindrome {
	
	public  Stack<Character> first; 
	public  Stack<Character> second; 
	public  Stack<Character> third; 
	
	public ArrayPalindrome() {
		first = new ArrayStack<Character>();
		second = new ArrayStack<Character>();
		third = new ArrayStack<Character>();
}
	
	
	


	public boolean isPalindrome(String testcase) {  
		for (int i = 0; i < testcase.length(); i++) {
			this.first.push(testcase.charAt(i));
			this.second.push(testcase.charAt(i));
			
			
		}
		for (int i =0; i < testcase.length(); i++) {
			this.third.push(  second.pop()  ); 
						
		}
		
		for (int i = 0 ; i < testcase.length() ; i++) {
			if (first.peek() == third.peek()) {
				this.third.pop();
				this.first.pop();
				//way to avoid doing this for the whole word?
			} else if (first.peek() != third.peek()) {
				return false;
			}
	
		
		}
		
		return true;
		
	}

	


}

	
		
	
	

