package com.APractice;

import java.util.Scanner;

public class PracCountCharFromString {

	public static void countChar(String s) {
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			count++;
		}
		System.out.println("count is " + count);
	}

	public static void countWord(String s) {
		String[] str = s.split(" ");
		int count = 0;
		for (int i = 0; i < str.length; i++) {
			count++;
		}
		System.out.println("count is " + count);
	}

	public static void reverseString(String s) {
		String str = "";
		for (int i = 0; i < s.length(); i++) {
			str = s.charAt(i) + str;
		}
		System.out.println("Reverse string is " + str);
	}

	public static void reverseWord(String s) {
		String str = "";
		String[] str1 = s.split(" ");
		for (int i = 0; i < str1.length; i++) {
			String word = str1[i];
			String str2 = "";
			for (int j = 0; j < word.length(); j++) {
				str2 = word.charAt(j) + str2;
			}
			str = str + " " + str2;
		}
		System.out.println("Reverse words are " + str);
	}

	public static void exceptFirstLast(String s) {
		String reverse = "";
		String[] word = s.split(" ");
		for (int i = 0; i < word.length; i++) {
			
			if (i != 0 && i != word.length - 1) {
			String w = word[i];
			String rev = "";
				for (int j =w.length()-1 ; j >=0 ; j--) {
					rev = rev +w.charAt(j);
				}
				reverse = reverse + rev;
			}
		}
		System.out.println("Reverse words are \n"+word[0] +" "+ reverse+" "+word[word.length-1]);
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String :");
		// String str =sc.next();
		String str1 = sc.nextLine();

		// countChar(str);
		// countWord(str1);
		// reverseString(str1);
		// reverseWord(str1);
		exceptFirstLast(str1);
	}

}
