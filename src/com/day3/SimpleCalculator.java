package com.day3;

import java.util.Scanner;

public class SimpleCalculator {

	public static void main(String[] args) {

		System.out.println("Enter two numbers :");
		Scanner sc=new Scanner(System.in);
		int num1= sc.nextInt();
		int num2= sc.nextInt();
		System.out.println("1 Addition \n2 Substraction \n3 Multiplication \n4 Division \n5 Mod");
		System.out.println("Select Operation :");
		int opt=sc.nextInt();
		if(opt==1) {
			int sum=num1+num2;
			System.out.println("Addition is : "+sum);
		}else if(opt==2) {
			int sub=num1-num2;
			System.out.println("Substraction is : "+sub);
		}else if(opt==3) {
			int mul=num1*num2;
			System.out.println("MUltiplication is : "+mul);
		}else if(opt==4) {
			float div=num1/num2;
			System.out.println("Division is : "+div);
		}else if(opt==5) {
			float mod=num1%num2;
			System.out.println("Mod is : "+mod);
		}else {
			System.out.println("Invalid input ");
		}
	}

}
