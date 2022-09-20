package com.day6;

import java.util.Scanner;

public class AverageOfdigitsInNum {

	public static void main(String[] args) {

		System.out.println("Enter the number :");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int count=0;
		int sum=0;
		while(num>0) {
			count=count+1;
			int temp=num%10;
			sum=sum+temp;
			num=num/10;
		}
		System.out.println("count : "+count);
		System.out.println("sum : "+sum);
		double avg= sum/count;
		System.out.println("avarage : "+avg);
	}

}
