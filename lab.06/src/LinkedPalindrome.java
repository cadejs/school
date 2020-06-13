
public class LinkedPalindrome {

	 
//same set up as array till 16
		public  Stack<Character> first; 
		public  Stack<Character> second; 
		public  Stack<Character> third; 
		
		public LinkedPalindrome() {
			first = new LinkedStack<Character>();
			second = new LinkedStack<Character>();
			third = new LinkedStack<Character>();
		}
		
		public boolean isPalindrome(String testcase) {
			for (int i = 0; i < testcase.length(); i++) {
				first.push(testcase.charAt(i));
				second.push(testcase.charAt(i));
				
				
			}
			for (int i =0; i < testcase.length(); i++) {
				third.push(  second.pop()  ); 
							
			}
			
			for (int i = 0 ; i < testcase.length() ; i++) {
				if (first.peek() == third.peek()) {
					third.pop();
					first.pop();
			} else if (first.peek() != third.peek()) {
					return false;
				}
		
			
			}
			
			return true;
			
		}
		
		
}	

