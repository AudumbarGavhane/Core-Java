package com.Geometry;
import java.util.Scanner;

public class TestPoint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("enter first point");
		Point2D p1=new Point2D(sc.nextDouble(),sc.nextDouble());
	System.out.println(	p1.getDetails());
		 
	
	
	System.out.println("enter 2nd point");
	Point2D p2=new Point2D(sc.nextDouble(),sc.nextDouble());
	System.out.println(p2.getDetails());
	
	System.out.println("checking equality");
	boolean temp =p1.isEqual(p2);
	System.out.println(temp);
			
	
	
	System.out.println("cal distance");
	double distance=p1.calDistance(p2);
	System.out.println(distance);

	}	
	

}
