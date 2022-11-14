package com.day33;

import java.util.Scanner;

public class StringToggleCase {

	public static String convert_text(String str)
	{
		String word=" ";
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)>='a' && str.charAt(i)<='z')
			{
				word=word+((char)(str.charAt(i)-32));
			}else if(str.charAt(i)>='A' && str.charAt(i)<='Z')
			{
				word=word+((char)(str.charAt(i)+32));
			}else
			{
				word=word+str.charAt(i);
			}
		}
		return word;
	}
	
	public static void main(String[] args) {

		System.out.println("Enter the String :");
		Scanner sc=new Scanner(System.in);
		String st=sc.nextLine();
		
		System.out.println(convert_text(st));
	}

}
