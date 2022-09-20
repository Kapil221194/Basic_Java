package com.day4;

import java.util.Scanner;

public class CalculateAreas {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("1.Area of Triangle \n2.Area of Rectangle \n3.Area of Square \n4.Area of Circle \n");
		System.out.println("Enter the choice");
		int choice=sc.nextInt();
		switch(choice) {
		case 1 :{
			System.out.println("Enter length : ");
			int length =sc.nextInt();
			System.out.println("Enter height : ");
			int height =sc.nextInt();
			double triangle=(0.5*length*height);
			System.out.println("Area of Triangle: "+triangle);
		}break;
		case 2 :{
			System.out.println("Enter length : ");
			int length =sc.nextInt();
			System.out.println("Enter height : ");
			int height =sc.nextInt();
			double rectangle=(length*height);
			System.out.println("Area of Rectangle: "+rectangle);
		}break;
		case 3 :{
			System.out.println("Enter length : ");
			int length =sc.nextInt();
			double square=(length*length);
			System.out.println("Area of Square: "+square);
		}break;
		case 4 :{
			System.out.println("Enter radius : ");
			int radius =sc.nextInt();
			double circle=(3.14*radius*radius);
			System.out.println("Area of Square: "+circle);
		}break;
		default:System.out.println("Please enter valid input");
		}
	}

}
