package com.day23;

import java.util.Scanner;

public class MinMaxElementFromArray {

	public static int MaxInt(int []ar)
	{
		int max=Integer.MIN_VALUE;
		
		for(int i=0;i<ar.length;i++)
		{
			if(max<ar[i])
			{
				max=ar[i];
			}
		}
		
		return max;
	}
	public static int MinInt(int []ar)
	{
		int min=Integer.MAX_VALUE;
		
		for(int i=0;i<ar.length;i++)
		{
			if(min>ar[i])
			{
				min=ar[i];
			}
		}
		
		return min;
	}
	
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array length :");
		int num=sc.nextInt();
		System.out.println("Enter array elements :");
		int ar[]=new int[num];
		for(int i=0;i<ar.length;i++)
		{
			ar[i]=sc.nextInt();
		}
		
		System.out.println("Max integer in array is "+MaxInt(ar));
		System.out.println("Min integer in array is "+MinInt(ar));
	}

}
