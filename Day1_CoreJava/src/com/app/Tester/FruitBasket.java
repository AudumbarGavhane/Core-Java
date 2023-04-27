package com.app.Tester;

import java.util.Scanner;

import com.app.fruits.*;

import static java.lang.System.*;

public class FruitBasket {

	public static void main(String[] args) {

		Scanner sc = new Scanner(in);
		System.out.println("Enter the no of items to choose...");
		Fruit[] basket = new Fruit[sc.nextInt()];

		int index = 0, choice;

		do {
			System.out.println("--------------Menu-----------");
			System.out.println("1.Add Mango");
			System.out.println("2.Add Orange");
			System.out.println("3.Add Apple");
			System.out.println("4.Display names of all fruits in the basket");
			System.out.println("5.Display name,color,weight, taste of all fresh fruits, in the basket");
			System.out.println("6.Mark a fruit in a basket, as stale(=not fresh)");
			System.out.println("7.Mark all sour fruits stale ");
			System.out.println("8.Invoke fruit specific functionality (pulp / juice / jam)");
			System.out.println("10.Exit");
			System.out.println("Enter choice....");
			choice = sc.nextInt();

			switch (choice) {

			case 1:

				if (index < basket.length) {
					System.out.println("Add Mango Details.");
					System.out.println("Name Weight Color ");
					basket[index++] = new Mango(sc.next(), sc.nextDouble(), sc.next());
				} else {
					System.out.println("Fruit Basket is Full!...");
				}

				break;
			case 2:

				if (index < basket.length) {
					System.out.println("Add Orange Details.");
					System.out.println("Name Weight Color");
					basket[index++] = new Orange(sc.next(), sc.nextDouble(), sc.next());
				} else {
					System.out.println("Fruit Basket is Full!...");
				}
				break;
			case 3:

				if (index < basket.length) {
					System.out.println("Add Apple Details.");
					System.out.println("Name Weight Color");
					basket[index++] = new Apple(sc.next(), sc.nextDouble(), sc.next());
				} else {
					System.out.println("Fruit Basket is Full!...");
				}
				break;
			case 4:// 4.Display names of all fruits in the basket")
				if (index != 0) {
					for (Fruit f : basket) {
						if (f != null) {
							System.out.println(f.getName());
						}
					}
				} else {
					System.out.println("Basket is empty!..");
				}
				break;
			case 5:// Display name,color,weight, taste of all fresh fruits, in the basket
				if (index != 0) {
					for (Fruit f : basket) {
						if (f != null) {

							if (f.isFresh() == true) {
								System.out.println(f);
								System.out.println(f.taste());

							}
						}
					}
				} else {
					System.out.println("Basket is empty!..");
				}

				break;
			case 6:/*
					 * 6. Mark a fruit in a basket , as stale(=not fresh) i/p : index o/p : error
					 * message (in case of invalid index) or mark it stale
					 */
				System.out.println("Enter index: ");
				int ind = sc.nextInt();
				if (ind < index) {

					basket[ind].setFresh(false);
					System.out.println("Marked it Stale!");

				} else {
					System.out.println("Index not found");

				}

				break;
			case 7:// 7.Mark all sour fruits stale
				if (index != 0) {
					for (Fruit f : basket) {
						if (f != null) {

							if (f.taste().equals("sour")) {

								f.setFresh(false);

							}
						}
					}
					System.out.println("All sour fruits are marked as stale..");
				} else {
					System.out.println("Basket is empty!..");
				}

				break;
			case 8:// 8.Invoke fruit specific functionality (pulp / juice / jam)
				System.out.println("Enter Index: ");
				int i = sc.nextInt();
				if (i < basket.length) {

					if (basket[i] != null) {

						if (basket[i] instanceof Mango) {
							((Mango) basket[i]).pulp();

						} else if (basket[i] instanceof Orange) {
							((Orange) basket[i]).juice();
						} else {
							((Apple) basket[i]).jam();
						}
						System.out.println();
					}

				} else {
					System.out.println("index not found!..");
				}
				break;
			case 10:
				System.out.println("Thanks for visiting us !!!");
				break;
			default:
				System.out.println("Enter the valid Entry...");
				break;
			}

		} while (choice != 10);

		sc.close();

	}

}
