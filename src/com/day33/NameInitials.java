package com.day33;

import java.util.Scanner;

public class NameInitials {
	
	public static void nameCase(String str)
	{
		String word=" ";
		char ch=' ';
		String sword []=str.split(" ");
		for(int i=0;i<sword.length;i++)
		{
			if(i!=sword.length-1)
			{
				 ch =sword[i].charAt(0);
				System.out.print(ch+". ");
			}
		}
		System.out.print(sword[sword.length-1]);
	}

	public static void main(String[] args) {

		System.out.println("Enter the String :");
		Scanner sc=new Scanner(System.in);
		String st=sc.nextLine();
		
		nameCase(st);
	}

}
