package com.day6;

import java.util.Scanner;

public class Palindroma {

	public static void main(String[] args) {

		System.out.print("Enter number :");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int num1=num;
		int rev=0;
		while(num>0) {
			int r =num%10;
			rev=rev*10+r;
			num=num/10;
		}
		//System.out.println("Revers :"+rev);
		if(num1==rev) {
			System.out.println(num1 +" palidroma number");
		}else {
			System.out.println(num1 +" not palidroma number");
		}
	}

}
