package com.day26;

import java.util.Arrays;
import java.util.Scanner;

public class AlternateElement {
	
	public static void Alternate(int a[])
	{
		for(int i=0;i<a.length;i+=2)
		{
			System.out.println(a[i]);
		}
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
		Alternate(arr);
	}

}
