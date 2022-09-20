package com.APractice;

import java.util.Scanner;

public class AgeOfTwoFrnd {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.print("Enter age of first person :");
		int age1=sc.nextInt();
		System.out.print("Enter age of second person :");
		int age2=sc.nextInt();
		int n = 0;
		if(age1>age2) {
			n=1;
		}else if(age2>age1){
			n=2;
		}else if(age2==age1){
			n=3;
		}
		
		switch(n) {
		case 1: System.out.print("Hi");
		break;
		case 2: System.out.print("Hello");
		break;
		case 3: System.out.print("Hi Hello");
		break;
		default:System.out.print("Please try again");
		}
	}

}
