package com.day26;

import java.util.Scanner;

class Car {
	int model_no;
	String model_name;
	long price;

	Car(int model_no, String model_name, long price) {
		this.model_no = model_no;
		this.model_name = model_name;
		this.price = price;
	}

	public String toString() {
		return model_no + " " + model_name + " " + price;
	}
}

public class ArrayOfObjectExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Car c[] = new Car[3];
		
		// using constructor and fix input
		
		c[0] = new Car(2211, "labmo", 1500000);
		c[1] = new Car(1401, "audi", 2500000);
		c[2] = new Car(2510, "jaguar", 7500000);
		for (int i = 0; i < c.length; i++) {
			System.out.println(c[i]);
		}

		// using constructor and user input

		System.out.println("using constructor and user input");

		for (int i = 0; i < c.length; i++) {
			System.out.print("Enter model no. :");
			int mno = sc.nextInt();
			System.out.print("Enter model name :");
			String mname = sc.next();
			System.out.print("Enter car price :");
			long cp = sc.nextLong();

			//Calling constructor
			c[i] = new Car(mno, mname, cp);
		}
		for (int j = 0; j < c.length; j++) {
			System.out.println(c[j]);
		}
	}

}
