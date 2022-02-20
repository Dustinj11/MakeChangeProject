package makechange;

import java.util.Scanner;

public class CashRegister {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("What is the price of you item: ");
		double price = input.nextDouble();
// USER 1 COMPLETE
		System.out.println("How much money did the customer give: ");
		double cash = input.nextDouble();
		input.close();
// USER 2 COMPLETE
		if (cash < price) {
			System.out.println("ERROR | Not enough money.");
		} else if (cash == price) {
			System.out.println("No change needed. ");
		} else {
			System.out.println("Customer needs change. ");
		}
// USER 3 COMPLETE

		double cashBack = cash - price;
//		System.out.println(cashBack);

		double penny = 0;
		double nickel = 0;
		double dime = 0;
		double quarter = 0;
		int oneDollar = 1;
		int fiveDollar = 5;
		int tenDollar = 10;
		int twentyDollar = 20;

		if (cashBack >= 20) {
			twentyDollar = (int) (cashBack / 20);
			cashBack = cashBack % 20;
			
				if (twentyDollar != 0) {
					System.out.println(" twenty dollars: " + twentyDollar);
				}
		}
//
			if (cashBack >= 10) {
				tenDollar = (int) (cashBack / 10);
				cashBack = cashBack % 10;
		
				if (tenDollar != 0) {
					System.out.println("ten dollars: " + tenDollar);
				}
			}
		
//				
			if (cashBack >= 5) {
				fiveDollar = (int) (cashBack / 5);
				cashBack = cashBack % 5;
					
				if (fiveDollar != 0) {
					System.out.println("five dollars: " + fiveDollar);
				}
			}
//					
			if (cashBack >= 1) {
				oneDollar = (int) (cashBack / 1);
				cashBack = cashBack % 1;

				if (oneDollar != 0) {
					System.out.println("dollars: " + oneDollar);
				}
			}
							
			if (cashBack >= 0.25) {
				quarter = (int) (cashBack / 0.25);
				cashBack = cashBack % 0.25;
							
				if (quarter != 0) {
					System.out.println("quarters: " + quarter);
				}
			}
//							
//					
			if (cashBack >= 0.10) {
				dime = (int) (cashBack / 0.10);
				cashBack = cashBack % 0.10;
				
				if (dime != 0) {
					System.out.println("dimes: " + dime);
				}
			}
			
			if (cashBack >= 0.05) {
				nickel = (int) (cashBack / 0.05);
				cashBack = cashBack % 0.05;
				
				if (nickel != 0.05) {
					System.out.println("nickels: " + nickel);
				}
			}
			if (cashBack >= 0.01) {
				penny = (int) (cashBack / 0.01);
				cashBack = cashBack % 0.01;
				
				if (penny != 0) {
					System.out.println("pennies: " + penny);
				}
			}
					

	}
}
