package com.app.fruits;

public class Mango extends Fruit {

	public Mango(String name, double weight, String color) {
		super(name, weight, color);
	}
	// Mango : should return "sweet"

	@Override
	public String taste() {
		return "sweet";
	}

	// In Mango : public void pulp() {Display name n color of the fruit + a mesg
	// creating pulp!}
	public void pulp() {
		System.out.println("Name=" + getName());
		System.out.println("Color=" + getColor());
		System.out.println("creating pulp");

	}
}
