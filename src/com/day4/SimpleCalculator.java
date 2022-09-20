package com.day4;

import java.util.Scanner;

public class SimpleCalculator {

	public static void main(String[] args) {

		System.out.println("Enter two numbers :");
		Scanner sc=new Scanner(System.in);
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		System.out.println("1.+ \n2.- \n3.* \n4./");
		System.out.println("Select the operator :");
		char ch=sc.next().charAt(0);
		switch (ch) {
		case '+':{
			int sum=num1+num2;
			System.out.println("Addtition of numbers is "+sum);
		}break;
		case '-':{
			int sub=num1-num2;
			System.out.println("Substraction of numbers is "+sub);
		}break;
		case '*':{
			int mul=num1*num2;
			System.out.println("Multiplication of numbers is "+mul);
		}break;
		case '/':{
			float div=num1/num2;
			System.out.println("Division of numbers is "+div);
		}break;
		default:System.out.println("Please try again");
		}
	}

}
