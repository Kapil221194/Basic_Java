package com.exception1711;

import java.util.Scanner;

class ExceptionForSum extends Throwable {
	ExceptionForSum(String s) {
		super(s);
	}
}

public class SumOfThreeDigit {

	public static void sumOfDigit(String str) throws ExceptionForSum {
		int sum1 = 0, sum2 = 0;
		int z = str.length() - 1;
		for (int i = 0; i < str.length(); i++) {

			for (int j = i; j < 3; j++) {
				sum1 = sum1 + Character.getNumericValue(str.charAt(i));
				i++;
			}
			
		}
		for (int i = str.length()-1; i >str.length()-3 ; i--) {
			for (int j = i; j > str.length() - 4; j--) {
				sum2 = sum2 + Character.getNumericValue(str.charAt(i));
				i--;
			}
		}
		//System.out.println("sum1=" + sum1 + "\nsum2=" + sum2);
		
		if(sum1==sum2)
		{
			System.out.println("Valid number");
		}
		else
		{
			throw new ExceptionForSum("invalid number");
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the number");
		String str = sc.next();

		try {
			sumOfDigit(str);
		} catch (ExceptionForSum e) {
			System.out.println(e.getMessage());
		}
	}

}
