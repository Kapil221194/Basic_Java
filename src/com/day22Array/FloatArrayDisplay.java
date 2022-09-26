package com.day22Array;

import java.util.Scanner;

public class FloatArrayDisplay {

	public static void main(String[] args) {

		float arr[]=new float[4];
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter array element :");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextFloat();
		}
		for(int i=0;i<arr.length;i++) 
		{
			System.out.println("Traditional for:"+arr[i]+" ");
		}
		for(float f:arr) {
			System.out.println("Enhance for:"+f+" ");
		}
	}

}
