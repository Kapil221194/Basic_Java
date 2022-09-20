package com.day6;

public class DisplayNumBetn1To20BreakIfNumDivBy3 {

	public static void main(String[] args) {

		int i=1;
		while(i<=20) {
			if(i%2==0) {
				if(i%3==0) {
					break;
				}
				System.out.println(i);
			}
			i++;
		}
	}

}
