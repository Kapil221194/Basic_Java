package com.day27;

import java.util.Arrays;
import java.util.Scanner;

public class TwoDimensionArrayExample {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		//int num=sc.nextInt();
		
		//initilisation and declaration with fix size and element.
		int ar[][]= {{1,2,3},{4,5,6},{7,8,9}};
		
		System.out.println("initilisation and declaration with fix size and element.");
		for(int i=0;i<ar.length;i++)
		{
			for(int j=0;j<ar[i].length;j++)
			{
				System.out.print(ar[i][j]+" ");
			}
			System.out.println();
		}
		
		
		//initilisation and declaration with fix size and add element in each position.
		int arr[][]=new int[3][3];
		arr[0][0]=9;
		arr[0][1]=8;
		arr[0][2]=7;
		arr[1][0]=6;
		arr[1][1]=5;
		arr[1][2]=4;
		arr[2][0]=3;
		arr[2][1]=2;
		arr[2][2]=1;
		
		System.out.println("initilisation and declaration with fix size and add element in each position.");
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
		
		//take input from user.
		System.out.println("Enter range of row :");
		int num1=sc.nextInt();
		System.out.println("Enter range of colomn :");
		int num2=sc.nextInt();
		int arra[][]=new int [num1][num2];
		
		System.out.println("Enter array element :");
		for(int i=0;i<arra.length;i++)
		{
			for(int j=0;j<arra[i].length;j++)
			{
				arra[i][j]=sc.nextInt();
			}
		}
		System.out.println("take input from user. :");
		for(int i=0;i<arra.length;i++)
		{
			for(int j=0;j<arra[i].length;j++)
			{
				System.out.print(arra[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}
