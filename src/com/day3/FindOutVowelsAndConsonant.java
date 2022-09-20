package com.day3;

import java.util.Scanner;

public class FindOutVowelsAndConsonant {

	public static void main(String[] args) {

		System.out.println("Enter the Character : ");
		Scanner sc = new Scanner(System.in);
		char i =sc.next().charAt(0);
		if(i=='a'|| i=='A' ){
			System.out.println("Vowel");
		}else if(i=='e'|| i=='E'){
			System.out.println("Vowel");
		}else if(i=='i'|| i=='I'){
			System.out.println("Vowel");
		}else if(i=='o'|| i=='O'){
			System.out.println("Vowel");
		}else if(i=='u'|| i=='U'){
			System.out.println("Vowel");
		}else {
			System.out.println("Consonant");
		}
	}

}
