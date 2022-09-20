package com.day3;

import java.util.Scanner;

public class GreatestNumAmong3Numbers {

	public static void main(String[] args) {

		System.out.println("Enter the three number : ");
		Scanner sc = new Scanner(System.in);
		int n1 =sc.nextInt();
		int n2 =sc.nextInt();
		int n3 =sc.nextInt();
		if(n1>n2 && n1>n3) {
			System.out.println("Greatest number is: "+n1);
		}else if(n2>n3 && n2>n1) {
			System.out.println("Greatest number is: "+n2);
		}else {
			System.out.println("Greatest number is: "+n3);
		}
	}

}
