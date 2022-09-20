package com.day16;

import java.util.Scanner;

public class PrintSeries1_8_27 {

	public static void main(String[] args) {

		System.out.print("Enter nth term :");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int c=0;
		for(int i=1;i<=n;i++) {
			c=i*i*i;
			System.out.print(c+",");
		}
	}

}
