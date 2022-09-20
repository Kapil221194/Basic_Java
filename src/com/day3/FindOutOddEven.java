package com.day3;

import java.util.Scanner;

public class FindOutOddEven {

	public static void main(String[] args) {

		System.out.println("Enter number : ");
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		if(n%2==0){
			System.out.println("Entered number even ");
		}else {
			System.out.println("Entered number odd ");
		}
	}

}
