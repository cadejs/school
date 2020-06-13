
public class Driver {

	public static void main(String[] args) {
	ArrayLargeInteger cade = new ArrayLargeInteger("12345");
	ArrayLargeInteger test = new ArrayLargeInteger("-12345");
	ArrayLargeInteger abstest = new ArrayLargeInteger("-123");
	ArrayLargeInteger zerotest = new ArrayLargeInteger("0");

	test.toString();
	test.negate();
	test.toString();

	
	System.out.println(abstest.abs());
	abstest.abs();
	abstest.toString();
	
	}

}
