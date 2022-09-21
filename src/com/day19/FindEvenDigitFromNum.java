package com.day19;

import java.util.Scanner;

class SumOfEven
{
	public void Cal() 
	{
	System.out.print("Enter the number :");
	Scanner sc=new Scanner(System.in);
	int num=sc.nextInt();
	int r=0, sum=0;
	
	while(num>0) {
	r=num%10;
	if(r%2==0)
		sum=sum+r;
	num=num/10;
	}
	System.out.println("Sum of even digit from num ="+sum);
}
}


public class FindEvenDigitFromNum {

	public static void main(String[] args) {

		SumOfEven s=new SumOfEven();
		s.Cal();
	}

}
