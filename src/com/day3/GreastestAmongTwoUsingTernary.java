package com.day3;

import java.util.Scanner;

public class GreastestAmongTwoUsingTernary {

	public static void main(String[] args) {

		System.out.println("Enter two number : ");
		Scanner sc = new Scanner(System.in);
		int n1 =sc.nextInt();
		int n2 =sc.nextInt();
		int max=(n1>n2)?n1:n2;
		System.out.println("Greatest number is : "+max);
	}

}
