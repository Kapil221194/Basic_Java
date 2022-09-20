package com.day14;

import java.util.Scanner;

public class NumberFrequency {

	public static void main(String[] args) {

		System.out.print("Enter the number: ");
		Scanner sc=new Scanner(System.in);
		long num=sc.nextLong();
		long temp=num;
		long f=0;
		for(long i=num;i>0;i=i/10) {
			long r1=i%10;
			f=0;
			boolean flag=false;
			for(long k=i/10;k>0;k=k/10) {
				long r=k%10;
				if(r==r1) {
					flag=true;
					break;
				}
			}
			if(flag==false) {
				for(long j=temp;j>0;j=j/10) {
					long r2=j%10;
					if(r1==r2) {
						f++;
					}
				}
				if(f>0)
					System.out.println(r1+"Frequency is "+f);
			}
		}
	}

}
