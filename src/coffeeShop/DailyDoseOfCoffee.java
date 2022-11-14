package coffeeShop;

import java.util.Scanner;

abstract class customer {
	String cust_name;
	long cust_mob_no;

	abstract void Menu(int choice);

	customer(String cust_name, long cust_mob_no) {
		this.cust_name = cust_name;
		this.cust_mob_no = cust_mob_no;
	}

}

class menuOfCoffee extends customer {

	menuOfCoffee(String cname, long cmob_no) {
		super(cname, cmob_no);
	}

	// implementation of Menu().
	public void Menu(int choice) {

		
		switch (choice) {
		case 1:
			System.out.println("Black Hot coffee \n price : 50/-");
			break;
		case 2:
			System.out.println("Cappuccino \n price : 100/-");
			break;
		case 3:
			System.out.println("Latte with steamed milk \n price : 150/-");
			break;
		case 4:
			System.out.println("Iced coffee with cream and suger \n price : 125/-");
			break;
		case 5:
			System.out.println("Cold Blew with dark coffee and ice \n price : 125/-");
			break;
		default:
			System.out.println("Please check options.");

		}
		
	}
}

class billing {
	public void billCal(int choice, int quanty) {
		int bill_Amount = 0;
		if (choice == 1) {
			bill_Amount = 50 * quanty;
		} else if (choice == 2) {
			bill_Amount = 100 * quanty;
		} else if (choice == 3) {
			bill_Amount = 150 * quanty;
		} else if (choice == 4) {
			bill_Amount = 125 * quanty;
		} else if (choice == 5) {
			bill_Amount = 125 * quanty;
		}
		System.out.println("Bill Amount =" + bill_Amount);
	}
}

public class DailyDoseOfCoffee {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// take customer info
		System.out.println("Enter customer details.");
		System.out.print("Enter customer name :");
		String cname = sc.next();
		System.out.print("Enter customer mobile number :");
		long cmob_no = sc.nextLong();

		// Show menu
		System.out.println("1.Black Coffee \n2.Cappuccino \n3.Latte \n4.Iced Coffee \n5.Cold Blew\n");
		System.out.println("Enter the choice");
		int choice = sc.nextInt();
		menuOfCoffee m = new menuOfCoffee(cname, cmob_no); // calling constructor
		m.Menu(choice);

		// bill calculator
		System.out.println("Enter quantity :");
		int quantity = sc.nextInt();
		billing b = new billing();
		b.billCal(choice, quantity);
	}

}
