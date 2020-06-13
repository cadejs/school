
public class LinkedDriver {

	public static void main(String[] args) {
		LinkedPalindrome test1 = new LinkedPalindrome();
        System.out.println(test1.isPalindrome("hh"));
        System.out.println(test1.isPalindrome("howdy"));
        System.out.println(test1.isPalindrome("hoooooh"));
        System.out.println(test1.isPalindrome("asjfgkj"));
        System.out.println(test1.isPalindrome(""));
	}

}
