package com.APractice;

import java.util.Scanner;

public class PrimeNum {

	public static void main(String[] args) {

		/*
		System.out.println("Enter the Number :");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int i=2;
		while(num>0) {
			if(num%i==0) {
				System.out.println("Number is not prime");
				break;
			}else {
				System.out.println("Number is prime");
				break;
			}
		}*/
		System.out.println("Enter two Number :");
		Scanner sc=new Scanner(System.in);
		int num1=sc.nextInt();
		//int num2=sc.nextInt();
		int count=0;
		
		for(int i=1;i<=num1;i++) {
			if(num1%i==0) {
				count++;
			}
		}
		if(count==2) {
			System.out.println("Number is Prime");
		}else {
			System.out.println("Number is not Prime");
		}
	}

}
