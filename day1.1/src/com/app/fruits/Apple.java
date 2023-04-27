package com.app.fruits;

public class Apple extends Fruit {

	
public Apple(String name, double weight, String color) {
		super(name, weight, color);
		// TODO Auto-generated constructor stub
	}

//Apple : should return  "sweet n sour"
	@Override
	public String taste() {
	
		return "sweet n sour";
	}
	
	// In Apple : public void jam() {Display name of the fruit + a mesg  making jam!}
	
	public void jam() {
		System.out.println("Name =" + getName());
		System.out.println("making a jam");
		
		
	}


}
