package com.day10;

public class PrintAddPrimeToNum {

	public static void main(String[] args) {

		System.out.println("1");
		for(int i=1;i<=10;i++) {
			int num=1 + ((i * (i + 1)) / 2);
			System.out.println(num);
		}
	}

}
