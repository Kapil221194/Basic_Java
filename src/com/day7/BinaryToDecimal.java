package com.day7;

import java.util.Scanner;

public class BinaryToDecimal {

	public static void main(String[] args) {

		System.out.println("Enter the nummber ");
		Scanner sc =new Scanner(System.in);
		int bin_num=sc.nextInt();
		int dec_num=0;
		int i=0,r;
		
		while(bin_num>0 ) {
			r =bin_num%10;
			dec_num=dec_num+(2*i)*r;
			bin_num=bin_num/10;
			i++;
		}
		System.out.println("Decimal num="+dec_num);
	}

}
