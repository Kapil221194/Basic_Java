package com.day27;

import java.util.Scanner;

public class AdditionOfArray {
	
	public static void SumOfArray(int a[][],int b[][], int n1,int n2)
	{
		int c[][]=new int [n1][n2];
		
		for(int i=0;i<c.length;i++)
		{
			for(int j=0;j<c[i].length;j++)
			{
				c[i][j]=a[i][j]+b[i][j];
			}
		}
		System.out.println("Sum of arrays are :");
		for(int i=0;i<c.length;i++)
		{
			for(int j=0;j<c[i].length;j++)
			{
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}
		
		
	}

	public static void main(String[] args) {

		Scanner sc =new Scanner(System.in);
		System.out.println("Enter range of row ");
		int num=sc.nextInt();
		System.out.println("Enter range of colomn ");
		int num1=sc.nextInt();
		int ar[][]=new int [num][num1];
		System.out.println("Enter array elements ");
		for(int i=0;i<ar.length;i++)
		{
			for(int j=0;j<ar[i].length;j++)
			{
				ar[i][j]=sc.nextInt();
			}
		}
		int arr[][]=new int [num][num1];
		System.out.println("Enter array elements ");
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}
	
		SumOfArray(ar,arr,num,num1);
	}

}
