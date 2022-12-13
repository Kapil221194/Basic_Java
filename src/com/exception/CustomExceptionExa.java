package com.exception;

import java.util.Scanner;

class BinaryException extends Throwable
{
	BinaryException( String s)
	{
		super(s);
	}
}
public class CustomExceptionExa {

	public static void checkNumber(int n) throws BinaryException
	{
		while(n>0)
		{
			int r=n%10;
			if(r>1 || r<0)
			{
				throw new BinaryException("Number is not binary");
			}
			else
			{
				System.out.println("Number is binary");
			}
			n=n/10;
			break;
		}
	}	
	public static void main(String[] args) {

		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n=sc.nextInt();
		try
		{
			checkNumber(n);
		}catch(BinaryException e)
		{
			System.out.println(e.getMessage());
		}
	}

}
