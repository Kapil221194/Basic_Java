package com.day6;

import java.util.Scanner;

public class SpyNumber {

	public static void main(String[] args) {

		System.out.print("Enter Number: ");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int num1=num;
		int sum=0, mul=1;
		while(num>0) {
			int temp=num%10;
			sum=sum+temp;
			mul=mul*temp;
			num=num/10;
		}
		System.out.println("Sum : "+sum);
		System.out.println("Multiplication : "+mul);
		if(sum==mul) {
			System.out.println(num1 +" is spy number.");
		}else {
			System.out.println(num1 +" is not spy number.");
		}
	}

}
