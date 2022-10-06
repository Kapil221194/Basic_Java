package com.day26;

import java.util.Arrays;
import java.util.Scanner;

public class CalculateAvg {
	
	public static void Average(int a[])
	{
		int count=0, sum=0; float avg=0;
		for(int i=0;i<a.length;i++)
		{
			if(i%2!=0)
			{
				count++;
				sum=sum+a[i];
			}
			avg=(float)sum/(float)count;
		}
		System.out.println("Average of odd index element :"+avg);
	}

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array range :");
		int num=sc.nextInt();
		int arr[]=new int[num];
		System.out.println("Enter array element :");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println(Arrays.toString(arr));
		Average(arr);
	
	}

}
