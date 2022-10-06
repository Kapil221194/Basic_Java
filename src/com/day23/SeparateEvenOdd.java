package com.day23;

import java.util.Scanner;

public class SeparateEvenOdd {
	
	public static void SortEvenOdd(int[] a)
	{
		System.out.println("Even element of array are : ");
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			{
				System.out.println(a[i]);
			}
		}
		System.out.println("Odd element of array are : ");
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2!=0)
			{
				System.out.println(a[i]);
			}
		}
		
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array length :");
		int num = sc.nextInt();
		int ar[] = new int[num];
		System.out.println("Enter array elements:");
		for (int i = 0; i < ar.length; i++) {
			ar[i] = sc.nextInt();
		}
		SortEvenOdd(ar);
	}

}
