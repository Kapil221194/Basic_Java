package com.day6;

public class DisplayNoBetn1To30SkipDivBy2Or3Or9 {

	public static void main(String[] args) {
		
		int i=1;
		while(i<=30) {
			if(i%2==0 || i%3==0 || i%9==0) {
				i++;	
				continue;
			}
			System.out.println(i);
			i++;
		}
	}

}
