package com.app.fruits;

public class Orange extends Fruit {

	
	  public Orange(String name, double weight, String color) {
		super(name, weight, color);
		// TODO Auto-generated constructor stub
	}
	// Orange : should return  "sour"
	@Override
	public String taste() {
		
		return "sour";
	}
	// In Orange 
	public void juice() {
	//	Display name n weight of the fruit + a mesg extracting juice!
		System.out.println("Name=" +getName()+ " Weight="+getWeight());
		System.out.println("extracting juice");
		
		}
  
}
