package com.day28;

import java.util.Scanner;

public class AdditionOfRowColomn {
	
	public static void SumOfRow(int a[][])
	{
		for(int i=0;i<a.length;i++)
		{
			int sum=0;
			for(int j=0;j<a[i].length;j++)
			{
				sum=sum+a[i][j];
				System.out.print(a[i][j]+" ");
			}
			System.out.print(" "+ sum);
			System.out.println();
		}
		System.out.println();
	}
	
	
	
	public static void SumOfColomn(int a[][])
	{
		for(int i=0;i<a.length;i++)
		{
			int sum=0;
			for(int j=0;j<a[i].length;j++)
			{
				sum=sum+a[j][i];
				System.out.print(a[i][j]+" ");
			}
			System.out.print(" "+ sum);
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
		for(int i=0;i<ar.length;i++)
		{
			for(int j=0;j<ar[i].length;j++)
			{
				ar[i][j]=sc.nextInt();
			}
		}
		SumOfRow(ar);
		System.out.println();
		SumOfColomn(ar);
	}

}
