package com.day22Array;

import java.util.Scanner;

public class PrintCharReverse {

	public static void CharArray()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array length :");
		int ar=sc.nextInt();
		char[] ch= new char[ar];
		System.out.println("Enter array elements :");
		for(int i=0;i<ch.length;i++)
		{
			ch[i]=sc.next().charAt(0);
		}
		System.out.println("Array element in reverse order");
		for(int i=(ch.length-1);i>=0;i--)
		{
			System.out.println(ch[i]);
		}
	}
	
	public static void main(String[] args) {

		CharArray();
	}

}
