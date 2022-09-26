package com.day22Array;

import java.util.Scanner;

public class DisplayAltEleOfArray {
	
	public static void AlternateElement()
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
		System.out.println("Alternate element of array are.");
		for(int i=0;i<num.length;i+=2) 
		{
			System.out.println(num[i]);
		}
	}

	public static void main(String[] args) {

		AlternateElement();
	}

}
