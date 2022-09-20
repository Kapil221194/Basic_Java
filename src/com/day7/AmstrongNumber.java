package com.day7;

import java.util.Scanner;

public class AmstrongNumber {

	public static void main(String[] args) {

		System.out.println("Enter number :");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int org_num=num;
		int temp;
		int sum=0;
		
		while(num>0) {
			temp=num%10;
			sum=sum+(temp*temp*temp);
			num=num/10;
		}
		System.out.println("sum ="+sum);
		if(org_num==sum) {
			System.out.println(org_num+" is Armstrong Number");
		}else {
			System.out.println(org_num+" is not Armstrong Number");
		}
	}

}
