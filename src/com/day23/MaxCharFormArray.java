package com.day23;

import java.util.Scanner;

public class MaxCharFormArray {
	
	public static char  MaxChar(char []a)
	{
		char max=a[0];
		for(int i=0;i<a.length;i++)
		{
			if (max<a[i])
			{
				max=a[i];
			}
		}
		return max;
	}
	public static char  MinChar(char []a)
	{
		char min=a[0];
		for(int i=0;i<a.length;i++)
		{
			if (min>a[i])
			{
				min=a[i];
			}
		}
		return min;
	}

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Array size :");
		int num=sc.nextInt();
		char []a=new char [num];
		System.out.println("Enter Array element :");
		for(int i=0; i<a.length;i++)
		{
			a[i]=sc.next().charAt(0);
		}
		
		System.out.println("Max char form array is :"+MaxChar(a));
		System.out.println("Min char form array is :"+MinChar(a));
	}

}
