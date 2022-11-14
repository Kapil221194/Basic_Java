package com.day33;

import java.util.Scanner;

public class SortStringBasedOnLength {

	public static void sort_length(String str) {
		String[] s = str.split("\\s");
		for (int i = 0; i < s.length; i++) {
			for (int j = i + 1; j < s.length; j++) {
				if (s[i].length() > s[j].length()) {
					String temp = s[i];
					s[i] = s[j];
					s[j] = temp;
				}
				else if(s[i].length()==s[j].length())
				{
					String temp1 = s[i];
					s[i] = s[j];
					s[j] = temp1;
				}
			
			}
			System.out.println(s[i]);
		}
		
	}

	public static void main(String[] args) {

		System.out.println("Enter the String :");
		Scanner sc = new Scanner(System.in);
		String st = sc.nextLine();
		sort_length(st);
	}

}
