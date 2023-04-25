package com.app.org;

public class Manager extends Employee {

	/*
	 * 1.2 Mgr state ---id,name,basic,deptId , perfBonus Add suitable constructor
	 * Methods ----1. get mgr details : override toString (inherited from Emp class)
	 * 1. compute net salary (formula: basic+perfBonus) -- override computeNetSalary
	 * 2. get performance bonus. --add a new method to return bonus.(getter)
	 */

	private double perfBonus;

	public double getPerfBonus() {
		return perfBonus;
	}

	public Manager(int id, String name, int deptId, double salary, double perfBonus) {
		super(id, name, deptId, salary);
		this.perfBonus = perfBonus;
	}

	
	public int getId() {
		return super.getId();
	}
	
	@Override
	public String toString() {
		return  super.toString()+" perfBonus= " + perfBonus;
	}
	
	@Override
	
	public double computeNetSalary() {
		return super.computeNetSalary()+perfBonus;
	}
	
	
	
	
	

}
