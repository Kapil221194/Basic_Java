package com.day22Array;
import java.util.Scanner;
public class SumOfArrayElement {
	
	public static void SumOfEle()
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
		int sum=0;
		for(int i=0;i<num.length;i++)
		{
			sum=sum+num[i];
		}
		System.out.println("Sum="+sum);
	}

	public static void main(String[] args) {

	SumOfEle();	
	}

}
