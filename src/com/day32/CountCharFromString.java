package com.day32;

import java.util.Scanner;

public class CountCharFromString {

	public static void countChar(String s)
	{
		int count=0;
		for(int i=0;i<s.length();i++)
		{
			count++;
		}
		System.out.println(count);
	}
	
	public static void main(String[] args) {

		System.out.println("Enter a string :");
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		
		countChar(str);
	}

}
