package com.day3;

import java.util.Scanner;

public class DaysInMonth {

	public static void main(String[] args) {

		System.out.println("Enter months :");
		Scanner sc=new Scanner(System.in);
		int m=sc.nextInt();
		if(m==1||m==3||m==5||m==7||m==8||m==10||m==12) {
			System.out.println("No of days are 31");
		}else if(m==4||m==6||m==9||m==11) {
			System.out.println("No of days are 30");
		}else if (m==2){
			System.out.println("No of days are 28");
		}else {
			System.out.println("Please enter valid input");
		}
	}

}
