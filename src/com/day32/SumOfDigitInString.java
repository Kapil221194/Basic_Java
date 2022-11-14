package com.day32;

import java.util.Scanner;

public class SumOfDigitInString {
	
	public static void digitSum(String str)
	{
		int sum=0;
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(ch>='0' && ch<='9')
			{
				System.out.println(ch);
				int x=Character.getNumericValue(ch);
				sum=sum+x;
			}
		}
		System.out.println("Sum ="+sum);
	}
	public static void digitAvg(String str)
	{
		int sum=0;
		int count=0;
		float avg=0;
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(ch>='0' && ch<='9')
			{
				//System.out.println(ch);
				count++;
				int x=Character.getNumericValue(ch);
				sum=sum+x;
			}
			avg=(float)sum/(float)count;
		}
		System.out.println("Average ="+avg);
	}

	public static void main(String[] args) {

		System.out.println("Enter a string :");
		Scanner sc = new Scanner(System.in);
		String st = sc.next();
		digitSum(st);
		digitAvg(st);
	}

}
