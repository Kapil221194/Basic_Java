package com.day22Array;

import java.util.Scanner;

public class ReplaceElement {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array length :");
		int ar=sc.nextInt();
		char[] ch= new char[ar];
		System.out.println("Enter array elements :");
		for(int i=0;i<ch.length;i++)
		{
			ch[i]=sc.next().charAt(0);
		}
//		for(int i=0;i<ch.length;i++)
//		{
//			System.out.println(ch[i]);
//		}
		System.out.println("Alternate array elements :");
		for(int i=0;i<ch.length;i++)
		{
			ch[i]=(char) (ch[i]+2);
			System.out.println(ch[i]);
		}
	}

}
