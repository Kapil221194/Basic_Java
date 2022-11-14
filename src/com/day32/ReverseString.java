package com.day32;

import java.util.Scanner;

public class ReverseString {
	
	public static String reverse(String s)
	{
		String s1=" ";
		for(int i=0;i<s.length();i++)
		{
			s1=s.charAt(i)+s1;
		}
		return s1;
	}
	public static String reverse1(String s)
	{
		String s1=" ";
		for(int i=s.length()-1;i>=0;i--)
		{
			s1=s1+s.charAt(i);
		}
		return s1;
	}
	public static String reverse2(String s)
	{
		String s1=" ";
		char ch[]=s.toCharArray();
		for(int i=ch.length-1;i>=0;i--)
		{
			s1=s1+ch[i];
		}
		
		return s1;
	}
	
	public static void main(String[] args) {

		System.out.println("Enter a string :");
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		System.out.println(reverse(str));
		System.out.println(reverse1(str));
		System.out.println(reverse2(str));
	}

}
