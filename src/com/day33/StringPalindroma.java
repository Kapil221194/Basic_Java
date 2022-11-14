package com.day33;

import java.util.Scanner;

public class StringPalindroma {
	
	public static void checkString(String str) {
		
		StringBuffer sb=new StringBuffer(str);
		sb.reverse();
		String s=sb.toString();
		if(str.equals(s)) {
			System.out.println("Palindrome");
		}else {
			System.out.println("Not Palindrome");
		}
	}
	
	
	public static void main(String []args)
	{
		System.out.println("Enter the String :");
		Scanner sc = new Scanner(System.in);
		String st = sc.next();
		checkString(st);
	}

}
