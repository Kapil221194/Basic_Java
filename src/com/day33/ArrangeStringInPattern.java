package com.day33;

import java.util.Scanner;

public class ArrangeStringInPattern {

	public static void stringPattern(String str)
	{
		String word[]=str.split(" ");
		for(int i=0;i<word.length;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print(word[j] +" ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {

		System.out.println("Enter the String :");
		Scanner sc=new Scanner(System.in);
		String st=sc.nextLine();
		
		stringPattern(st);
	}

}
