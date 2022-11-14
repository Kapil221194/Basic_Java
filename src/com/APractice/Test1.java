	package com.APractice;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {

		Scanner sc =new Scanner (System.in);
		
		int ar[] = new int[5];
		System.out.println("Enter element :");
		for(int i=0; i<ar.length;i++)
		{
			ar[i]=sc.nextInt();
			
		}
		
		for(int i=0;i<ar.length;i++)
		{
			int c=0;
			for(int j=2; j<=ar[i];j++)
			{
				if(ar[i]%j==0)
				{
					//System.out.println(ar[i]);
					c++;
				}
				//System.out.println(ar[i]);
			}
			//System.out.println(ar[i]);
			
			if(c==1)
			{
				System.out.println(ar[i]);
			}
		}
		
	
	
	}
}