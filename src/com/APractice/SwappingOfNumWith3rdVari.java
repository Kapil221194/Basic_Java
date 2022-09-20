package com.APractice;

import java.util.Scanner;

public class SwappingOfNumWith3rdVari {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.print("Enter two Numbers :");
		Scanner sc=new Scanner(System.in);
		int num1=sc.nextInt(), num2=sc.nextInt();
		
		System.out.println(num1+" "+num2);
		num1=num1+num2;
		num2=num1-num2;
		num1=num1-num2;
		System.out.println(num1+" "+num2);
	}

}
