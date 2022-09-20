package com.day16;

import java.util.Scanner;

public class PrintSeries0_3_8_15 {

	public static void main(String[] args) {

		System.out.print("Enter nth term :");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int x=0;
		for(int i=1;i<=n;i++) {
			x=(i*i)-1;
			System.out.print(x+",");
		}
	}

}
