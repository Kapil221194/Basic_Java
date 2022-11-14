package com.day33;

import java.util.Scanner;

public class FrequencyOfChara {

	public static void check_freq(String str) {
		char[] ch = str.toCharArray();
		int[] freq = new int[str.length()];
		for (int i = 0; i < str.length(); i++) {
			boolean isVisited = false;
			for (int k = i - 1; k >= 0; k--) {
				if (ch[i] == ch[k]) {
					isVisited = true;
					break;
				}
			}

			if (isVisited == false) {
				freq[i] = 1;
				for (int j = i + 1; j < str.length(); j++) {
					if (ch[i] == ch[j]) {
						freq[i]++;
					}
				}
			}
		}
		for (int i = 0; i < freq.length; i++) {
			if (freq[i] > 0)
				System.out.println(ch[i] + " " + freq[i]);
		}
	}

	public static void main(String[] args) {

		System.out.println("Enter the string :");
		Scanner sc = new Scanner(System.in);
		String st = sc.next();

		check_freq(st);
	}

}
