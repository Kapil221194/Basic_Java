package com.day33;

import java.util.Scanner;

public class AcceptLetterReturnValue {

	public static void returnValue(String str[], char ch)
	{
		if(Character.isUpperCase(ch))
		{
			ch=Character.toLowerCase(ch);
		}
		if(ch=='a'||ch=='b'||ch=='c'||ch=='d'||ch=='e')
		{
			for(int i=0;i<str.length;i++)
			{
				if(str[i].charAt(0)==ch)
				{
					for(int j=0;j<str[i].length();j++)
					{
						if(str[j].charAt(j)>='0' && str[j].charAt(j)<='9')
						{
							int x=Character.getNumericValue(str[i].charAt(j));
							System.out.println(x);
						}
					}
				}
			}
		}
		else {
			System.out.println("Character is not present.");
		}
	}
	
	public static void main(String[] args) {

		String st[]= {"a+4", "b+5", "c+6", "d+7","e+8"};
		System.out.println("Enter character :");
		Scanner sc=new Scanner(System.in);
		char in=sc.next().charAt(0);
		returnValue(st,in);
		
	}

}
