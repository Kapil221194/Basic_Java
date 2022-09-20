package com.day5;

import java.util.Scanner;

public class PrintTable {

	public static void main(String[] args) {

		System.out.println("Enter number : ");
		Scanner sc = new Scanner(System.in);
		int num=sc.nextInt();
		for(int i=1;i<=10;i++) {
			int table=num*i;
			System.out.println(table);
		}
	}

}
