package com.day3;

import java.util.Scanner;

public class DivisibleBy {

	public static void main(String[] args) {

		//write code to check no. is divisible by 3 and 9.
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the number : ");
		int i=sc.nextInt();
		if(i%3==0 && i%9==0)
		{
			System.out.println("Number is divisible by 3 and 9");
		}else {
			System.out.println("Number is not divisible by 3 and 9");
		}
	}

}
