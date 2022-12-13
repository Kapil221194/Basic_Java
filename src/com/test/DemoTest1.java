package com.test;

import java.util.Scanner;

//take string from user "my name is kapil shende"
//output= reverse each word of string and sort it by length of each word

public class DemoTest1 {

	public static void reverseWord(String s)
	{
		String reverse="";
		String [] words=s.split(" ");
		for(int i=0;i<words.length;i++)
		{
			String rev="";
			String word=words[i];
			for(int j=0;j<word.length();j++)
			{
				rev=word.charAt(j)+rev;
			}
			reverse= reverse +" "+rev;
		}
		System.out.println("Reverse string : " +reverse);
		System.out.println();
		
		for(int j=0;j<words.length;j++)
		{
			String temp="";
			for(int k=j+1;k<words.length;k++)
			{
				if(words[j].length()>words[k].length())
				{
					temp=words[j];
					words[j]=words[k];
					words[k]=temp;
				}
			}
		}
		for(int l=0;l<words.length;l++)
		{
			System.out.print(words[l]+" ");
		}
		
	}
	
	
	
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter string :");
	
		String str= sc.nextLine();
		reverseWord(str);
	}

}
