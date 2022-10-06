package com.day25;
import java.util.Scanner;
import java.util.Arrays;

public class ArrayReverse {
	
	public static void ReverseArray(int a[])
	{
		int j=a.length-1;
		for(int i=0;i<a.length/2;i++)
		{
			int temp=a[i];
			a[i]=a[j];
			a[j]=temp;
			j--;
		}
		System.out.println("reverse :"+Arrays.toString(a));
	}

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.print("Enter array range :");
		int num=sc.nextInt();
		int arr[]=new int[num];
		System.out.print("Enter array element :");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("input :"+Arrays.toString(arr));
		ReverseArray(arr);
	}

}
