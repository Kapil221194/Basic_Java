package com.day16;

import java.util.Scanner;

public class MissingNumber {

	public static void main(String[] args) {

		System.out.print("Enter the number :");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int r=0,sum=0;
		while(num>0) {
			r=num%10;
			sum=sum+r;
			num=num/10;
		}
		//System.out.println(sum);
		System.out.print("Re-enter same the number :");
		int num1=sc.nextInt();
		int r1=0,sum1=0;
		while(num1>0) {
			r1=num1%10;
			sum1=sum1+r1;
			num1=num1/10;
		}
		//System.out.println(sum1);
		if((sum-sum1)>0) {
			System.out.println("Missing number is "+(sum-sum1));
		}else {
			System.out.println("Please try again.");
		}
}

}
