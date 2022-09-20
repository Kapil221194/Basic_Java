package com.day7;

public class SumOfPrimeNum1To20 {

	public static void main(String[] args) {

		int i=1;
		int sum=0;
		while(i<=20) {
			if(i%2!=0 && i%3!=0) {
				System.out.println(i);
				sum=sum+i;
			}
			i++;
		}
		System.out.println("sum="+sum);
	}

}
