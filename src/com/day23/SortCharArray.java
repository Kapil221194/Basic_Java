package com.day23;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class SortCharArray {

	public static void SortArray(char a[]) {
		char temp = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		System.out.println("Elements of array sorted in order: ");    
        for (int i = 0; i < a.length; i++) {     
            System.out.print(a[i] + " ");    
        }   
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Array size :");
		int num = sc.nextInt();
		char[] a = new char[num];
		System.out.println("Enter Array element :");
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.next().charAt(0);
		}
		SortArray(a);
	}

}
