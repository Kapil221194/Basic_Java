package com.day32;

import java.util.Scanner;

public class ReverseStringExceptFirstLast {

	public static void revStringWord(String str) {
		//String s1 = " ";
	

		String reverse=" ";
		String sp[]=str.split(" ");
		for(int i=0;i<sp.length;i++)
		{
			if(i!=0 && i!=sp.length-1) {
			String word=sp[i];
			String rev=" ";
			for(int j=word.length()-1;j>=0;j--)
			{
				rev=rev+word.charAt(j);
			}
			reverse=reverse+rev;
		}
		}
		System.out.println(sp[0]+reverse+" "+sp[sp.length-1]);
	
	
	
	}
	public static void main(String[] args) {

		System.out.println("Enter a string :");
		Scanner sc = new Scanner(System.in);
		String st = sc.nextLine();

		revStringWord(st);
	}

}
