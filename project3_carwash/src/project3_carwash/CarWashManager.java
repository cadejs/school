package project3_carwash;
/**
@author - Cade Justad-Sandberg
@version - 3/29/19
CarWashManager
Driver for CarWash objects
*/
public class CarWashManager {

	public static void main(String[] args) {
		CarWash case1 = new CarWash(4);
		CarWash case2 = new CarWash(3);
		CarWash case3 = new CarWash(2);
		CarWash case4 = new CarWash(1);
		
		case1.run(10, .99);
		case1.printData();
		
		case2.run(1000, .99);
		case2.printData();
		case3.run(1600, .1);
		case3.printData();
		case4.run(500, .3);
		case4.printData();
	}

}
