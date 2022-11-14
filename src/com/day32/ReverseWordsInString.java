package com.day32;

import java.util.Scanner;

public class ReverseWordsInString {

	public static String reverseWords(String s)
	{
		String reverse=" ";
		String sp[]=s.split(" ");
		for(int i=0;i<sp.length;i++)
		{
			String word=sp[i];
			String rev=" ";
			for(int j=word.length()-1;j>=0;j--)
			{
				rev=rev+word.charAt(j);
			}
			reverse=reverse+rev;
		}
		
		return reverse;
	}
	
	public static void main(String[] args) {

		System.out.println("Enter a string :");
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		System.out.println(reverseWords(str));
	}

}
