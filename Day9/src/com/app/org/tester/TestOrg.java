package com.app.org.tester;

import java.util.Arrays;
import java.util.Scanner;

import com.app.org.*;

public class TestOrg {

	public static void main(String[] args) {

		/*
		 * Organize classes in inheritance hierarchy.
		 * 
		 * Write TestOrganization in "tester" package. Create suitable array to store
		 * organization details. Provide following options
		 * 
		 * 1. Hire Manager I/P : all manager details
		 * 
		 * 2. Hire Worker I/P : all worker details
		 * 
		 * 3. Display information of all employees(toString) & display net salary (by
		 * invoking computeNetSal),
		 * 
		 * 4. Exit
		 */

		Scanner sc = new Scanner(System.in);
		Employee[] emp = new Employee[5];
		int choice = 0;
		int index = 0;
		do {

			System.out.println("------------Menu-------------");
			System.out.println("1. Hire Manager");
			System.out.println("2.Hire Worker  ");
			System.out.println("3.Display information of all employees");
			System.out.println("4.Exit");
			System.out.println("Enter choice: ");
			choice = sc.nextInt();

			switch (choice) {
			case 1:
				System.out.println("Enter the manager details: ");
				System.out.print("Enter id: ");
				int id = sc.nextInt();
				for (int i = 0; i < emp.length; i++) {

					if (emp[i]==null||emp[i].getId() != id) {
						if (index < emp.length) {
							System.out.print("Enter name: ");
							String name = sc.next();
							System.out.print("Enter deptId: ");
							int deptId = sc.nextInt();
							System.out.print("Enter Salary: ");
							double salary = sc.nextDouble();
							System.out.print("Enter perfBonus: ");
							double perfBonus = sc.nextDouble();
							emp[index] = new Manager(id, name, deptId, salary, perfBonus);
							index++;
							break;
						} else {
							System.out.println("Array is full....");

						}
					} else
						System.out.println("Duplicate id is not allowed....");
					break;
				}
				break;
			case 2:
				System.out.println("Enter the worker details: ");
				System.out.print("Enter id: ");
				int id1 = sc.nextInt();
				for (int i = 0; i < emp.length; i++) {

					if (emp[i]==null||emp[i].getId() != id1) {
						if (index < emp.length) {
							System.out.print("Enter name: ");
							String name = sc.next();
							System.out.print("Enter deptId: ");
							int deptId = sc.nextInt();
							System.out.print("Enter Salary: ");
							double salary = sc.nextDouble();
							System.out.print("Enter hourlyRate: ");
							double hourlyRate = sc.nextDouble();
							System.out.print("Enter hoursWorked: ");
							int hoursWorked = sc.nextInt();
							emp[index] = new Worker(id1, name, deptId, salary, hoursWorked, hourlyRate);
							index++;
							break;
						} else {
							System.out.println("Array is full....");

						}
					} else
						System.out.println("Duplicate id is not allowed....");
					break;
				}
				break;
			case 3:
				System.out.println("Display Employee Details: ");
				for (Employee em : emp) {
					if (em != null) {
						System.out.print(em);
						System.out.println(" Net Salary: "+em.computeNetSalary());
					}
				}
				break;
			case 4:
				System.out.println("Hiring is closed...");
				break;
			default:
				System.out.println("Enter valid choice !!!");
				break;
			}

		} while (choice != 4);

	}

}
