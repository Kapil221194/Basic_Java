package com.day9;

import java.util.Scanner;

public class SumOfEvenDigitsFromNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.print("Enter the number");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int temp, sum=0;
		
		while(num>0) {
			temp=num%10;
			if(temp%2==0) {
				sum=sum+temp;
			}
			num=num/10;
		}
		System.out.println("Sum="+sum);
	}

}
