package edu.unca.csci202;
/**
 * 
 * @author CadeJustadsandberg
 *
 */
public class InventoryItem {
	int sku;
	String description;
	Double price;
	int quantity;
	
	
	int getsku(){
		return this.sku;
	}
	
	void setsku(int input1){
		this.sku=input1;
	}
	
	int getquantity(){
		return this.quantity;
	}
	
	void setquantity(int input2){
		this.quantity=input2;
	}
	
	
	String getdescription() {
		return this.description;
	}
	
	void setdescrpition(String input3) {
		this.description=input3;
	}
	
	double getprice() {
		return this.price;
	}
	
	void setprice(double input4) {
		this.price=input4;
	}
	
}
