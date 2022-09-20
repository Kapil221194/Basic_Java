package com.day3;

import java.util.Scanner;

public class AlphabateOrDigitOrSpChar {

	public static void main(String[] args) {

		System.out.println("Enter character : ");
		Scanner sc = new Scanner(System.in);
		char ch =sc.next().charAt(0);
		if((ch>='a' && ch<='z' )||(ch>='A' && ch<='Z')) {
			System.out.println("Enter character is Alphabate");
		}else if((ch>='0' &&ch<='9')){
			System.out.println("Enter character is Number");
		}else {
			System.out.println("Enter character is Special character");
		}
	}

}
