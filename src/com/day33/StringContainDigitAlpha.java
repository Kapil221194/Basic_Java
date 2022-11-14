package com.day33;

import java.util.Scanner;

public class StringContainDigitAlpha {

	public static void checkString(String str)
	{
		int sum1=0, sum2=0, x=str.length()-1;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)>='a' ||str.charAt(i)>='z'||str.charAt(i)>='A'||str.charAt(i)>='Z')
			{
				System.out.println("Error");
				break;
			}
			else if(str.charAt(i)>='0' || str.charAt(i)>='9')
			{
				System.out.println(str.charAt(i));
				
				for(int j=0;j<3;j++)
				{
					sum1=sum1+str.charAt(i);
				}
				for(int k=x;k>x-3;k--)
				{
					sum2=sum2+str.charAt(i);
				}
			}
		}
		//System.out.println("sum "+sum1);
		//System.out.println("sum "+ sum2);
		if(sum1==sum2)
		{
			System.out.println("Valid String");
		}else
		{
			System.out.println("Invalid String");
		}
	}
	
	public static void main(String[] args) {

		System.out.println("Enter the String :");
		Scanner sc = new Scanner(System.in);
		String st = sc.next();
	
		checkString(st);
	}

}
