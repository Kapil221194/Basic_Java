package com.APractice;
import java.util.Scanner;

public class PrimeNum2And3 {

	public static void main(String[] args) {

		System.out.println("Enter a number");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		
		if(num%2==0 || num%3==0) {
			System.out.println(num +" is not prime number");
		}else {
			System.out.println(num +" is prime number");
		}
	}

}
