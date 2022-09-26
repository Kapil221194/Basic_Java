package com.day22Array;

import java.util.Scanner;

public class CountAndAvgOfOddElement {
	
	public static void CountAndAverage()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array length :");
		int ar=sc.nextInt();
		int[] num= new int[ar];
		System.out.println("Enter array elements :");
		for(int i=0;i<num.length;i++)
		{
			num[i]=sc.nextInt();
		}
		int count=0;
		int sum=0;
		for(int i=0;i<num.length;i++)
		{
			if(num[i]%2 != 0) 
			{
				count++;
				sum=sum+num[i];
			}
		}
		System.out.println("Odd element in array are "+count);
		System.out.println("average="+((float)sum/(float)count));
	}

	public static void main(String[] args) {
		CountAndAverage();
	}

}
