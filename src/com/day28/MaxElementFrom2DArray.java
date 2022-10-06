package com.day28;

import java.util.Scanner;

public class MaxElementFrom2DArray {

	public static void MaxOfRow(int a[][]) 
	{
		System.out.println("Max Of Row");
		for(int i=0;i<a.length;i++)
		{
			int max=a[0][i];
			for(int j=0;j<a[i].length;j++)
			{
				if(a[i][j]>max)
				{
					max=a[i][j];
				}
				System.out.print(a[i][j]+" ");
			}
			System.out.print(" "+ max);
			System.out.println();
		}
	}
	public static void MaxOfColomn(int a[][]) 
	{
		System.out.println("Max Of Colomn");
		for(int i=0;i<a.length;i++)
		{
			int max=a[0][i];
			for(int j=0;j<a[i].length;j++)
			{
				if(a[j][i]>max)
				{
					max=a[j][i];
				}
				System.out.print(a[i][j]+" ");
			}
			System.out.print(" "+ max);
			System.out.println();
		}
	}
	
	
	public static void main(String[] args) {

		Scanner sc =new Scanner(System.in);
		System.out.print("Enter row range :");
		int n1=sc.nextInt();
		System.out.print("Enter colomn range :");
		int n2=sc.nextInt();
		int ar[][]=new int[n1][n2];
		System.out.print("Enter elements :");
		for(int i=0;i<ar.length;i++)
		{
			for(int j=0;j<ar[i].length;j++)
			{
				ar[i][j]=sc.nextInt();
			}
		}
		//calling method
		MaxOfRow(ar);
		MaxOfColomn(ar);
	}

}
