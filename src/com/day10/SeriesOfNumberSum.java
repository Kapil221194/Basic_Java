package com.day10;

public class SeriesOfNumberSum {

	public static void main(String[] args) {

		int num=3;
		int num1;
		System.out.println(num);
		for(int i=1;i<=10;i++) {
			num1=num+num;
			num=num1;
			System.out.println(num1);
		}
		
	}

}
