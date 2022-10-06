package com.APractice;

import java.util.Scanner;

// take char input from user, check char is upper case or lower case
public class DemoTest {

	public static void CheckInput(char a)
	{
		if(a>='a' && a<='z')
		{
			System.out.println("Char is lower case.");
		}else if(a>='A' && a<='Z')
		{
			System.out.println("Char is upper case.");
		}else
		{
			System.out.println("Please try again.");
		}
	}
	
	public static void main(String[] args) {

		System.out.println("Enter char :");
		Scanner sc=new Scanner(System.in);
		char ch=sc.next().charAt(0);
		
		CheckInput(ch);
		
	}

}
