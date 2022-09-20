package com.day8;

import java.util.Scanner;

public class DisariumNumber {

	public static void main(String[] args) {

		System.out.println("Enter Number :");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int org_num=num;
		int r, r2, sum=0,count=0;
		while(num>0) {
			r=num%10;
			count++;
			num=num/10;
		}
		num=org_num;
		for(int i=count;i>=1;i--) {
			r2=num%10;
			sum=sum+(int)Math.pow(r2,i);
			num=num/10;
		}
		if(sum==org_num) {
			System.out.println("Disarium Number");
		}else {
			System.out.println("Not a Disarium Number");
		}
	}

}
