package com.day7;

import java.util.Scanner;

public class NumIsBinaryOrNot {

	public static void main(String[] args) {

		System.out.print("Enter a number:");
		Scanner sc =new Scanner(System.in);
		int num=sc.nextInt();
		int r;
		while(num>0) {
			r=num%10;
			
			if(r==1 ||r==0) {
				System.out.println("Number is binary");
				break;
			}else {
				System.out.println("Number is not binary");
				//break;
			}
			num=num/10;
		}
	}

}
