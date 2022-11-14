package com.day32;

import java.util.Scanner;

public class CountNoOfWordFromString {

	public static void countWord(String s)
	{
		int count=0;
		String[] words = s.split("\\s");
		for (String w : words) {
			//System.out.println(w);
			count++;
		}
		System.out.println("Words in string are "+count);
	}
	
	public static void main(String[] args) {

		System.out.println("Enter a string :");
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		
		countWord(str);
	}

}
