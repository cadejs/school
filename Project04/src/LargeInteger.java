/*
 * @author Cade Justad-Sandberg
 * @version 4/20/19
 * Project 04
 * Interface that extends comparable and is used to store numbers to large for longs or ints
 */

public interface LargeInteger extends Comparable<Object>  {
/*
 * Author Cade Justad-Sandberg
 * 4/19/19
 */

 default LargeInteger min(LargeInteger input) {
	//find if input or this is smaller
	return null;
}
public default LargeInteger max(LargeInteger input) {
	//find if input or this is bigger
	return null;
}

/*
 * @param LargeInteger 
 * @return LargeInteger
 * Adds a large integer and a LargerInteger
 */
default LargeInteger add(LargeInteger input) {
	return input;
}

/*
 * @param LargeInteger 
 * @return LargeInteger
 * Subtracts a large integer from the LargerInteger
 */
public default LargeInteger subtract(LargeInteger input) {
	return input;
	
}

/*
 * @return LargerInteger of the negative value
 * will return either remove or add negative sign to change value
 */
public default LargeInteger negate() {
	//returns negative
	return null;
}

/*
 * @returns LargeInteger
 * outputs the absolute value of a LargeInteger
 */
public default LargeInteger abs() {
	//returns abs
	return null;
}
public default int signum() {
	//returns 0 if is 0, 1 if positive and -1 if negative
	return 0;
}
}
