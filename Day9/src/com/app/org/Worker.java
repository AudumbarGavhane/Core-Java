package com.app.org;

public class Worker extends Employee {
	
	/*1.3 Worker state  --id,name,basic,deptId,hoursWorked,hourlyRate
Methods : 
1. get worker details -- :  override toString. (inherited from Emp class)
2.  compute net salary (formula:  = basic+(hoursWorked*hourlyRate)
 --override computeNetSalary
3. get hrlyRate of the worker  -- add a new method to return hourly
 rate of a worker.(getter)*/
	
	private int hoursWorked;
	private double hourlyRate;
	
	public Worker(int id, String name, int deptId, double salary, int hoursWorked, double hourlyRate) {
		super(id, name, deptId, salary);
		this.hoursWorked = hoursWorked;
		this.hourlyRate = hourlyRate;
	}

	public int getId() {
		return super.getId();
	}
	
	@Override 
	public double computeNetSalary() {
		return super.computeNetSalary()+hoursWorked*hourlyRate;
	}


	@Override
	public String toString() {
		return super.toString()+" hoursWorked= " + hoursWorked + ", hourlyRate= " + hourlyRate;
	}


	public double getHourlyRate() {
		return hourlyRate;
	}
	
	
	
	
	

}
