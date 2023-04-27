package com.app.fruits;
/*2. Solve this
5.1 Can you arrange Fruit,Apple,Orange,Mango in inheritance hierarchy ?
Use tight encapsulation.

5.2 Properties (instance variables)  : color : String , weight : double , name:String, fresh : boolean

5.3 Add suitable constructors.

5.4 Override  toString correctly to return state of all fruits (return only  : name ,color , weight )

5.5 Add a taste() method : public String taste()

For Fruit : Can you identify taste of any general fruit ?
So will you add a taste() with this definition : returns "no specific taste" OR can u apply abstraction?

Apple : should return  "sweet n sour"
Mango : should return  "sweet"
Orange : should return  "sour"

5.6 Add specific functionality , in the sub classes
In Mango : public void pulp() {Display name n color of the fruit + a mesg  creating  pulp!}
In Orange : public void juice() {Display name n weight of the fruit + a mesg extracting juice!}
In Apple : public void jam() {Display name of the fruit + a mesg  making jam!}


5.7 Add all of above classes under the package "com.app.fruits"
5.8 Create java application FruitBasket , with main method , as a tester , in com.app.tester package.
5.9 Prompt user for the basket size n create suitable data structure

5.10 Supply options
1. Add Mango
2. Add Orange
3. Add Apple
NOTE : You will be adding a fresh fruit in the basket , in all of above options.

4. Display names of all fruits in the basket.

5. Display name,color,weight , taste of all fresh fruits , in the basket.


6. Mark a fruit in a basket , as stale(=not fresh)
i/p : index 
o/p : error message (in case of invalid index) or mark it stale

7. Mark all sour fruits stale 
Hint : Use equals() method of the String class.

8. Invoke fruit specific functionality (pulp / juice / jam)
i/p : index
Invoke correct functionality (pulp / juice / jam)

10. Exit */
public abstract class Fruit {
  
	//5.2 Properties (instance variables)  : color : String , weight : double , name:String, fresh : boolean
	
	private String color;
	private double weight;
	private String name;
	private boolean fresh=true;
	
	
	
	
	public Fruit(String name, double weight, String color) {
		
		super();
		this.color = color;
		this.weight = weight;
		this.name = name;
	}

	
	// 5.4 Override  toString correctly to return state of all fruits (return only  : name ,color , weight )
	@Override
	public String toString() {
		return "Fruit [color=" + color + ", weight=" + weight + ", name=" + name +  "]";
	}


	public double getWeight() {
		return weight;
	}


	public void setWeight(double weight) {
		this.weight = weight;
	}


	public boolean isFresh() {
		return fresh;
	}


	public void setFresh(boolean fresh) {
		this.fresh = fresh;
	}


	public String getColor() {
		return color;
	}


	public String getName() {
		return name;
	}
	// 5.5 Add a taste() method : public String taste()
	public abstract String taste();   // abstract method
	
}




































