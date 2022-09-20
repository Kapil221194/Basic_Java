package com.day10;

import java.util.Scanner;

public class FindNumIsAutoMorphic {

	public static void main(String[] args) {

		System.out.print("Enter Number: ");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int org_num=num;
		int sq=num*num;
		int r,count=0, sqr;
		
			while (num > 0)
	        {
	            r=num/10;
	            count++;
	            break;
	        }
			int pow=(int)Math.pow(10, count);
	        sqr= sq%pow;
	        if(sqr==org_num)
	        {
	            System.out.println("Automorphic Number");
	        }
	        else
	        {
	            System.out.println("Not Automorphic Number");
	        }
	}

}
