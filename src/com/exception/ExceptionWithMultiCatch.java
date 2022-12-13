package com.exception;

public class ExceptionWithMultiCatch {

	public static void main(String[] args) {

		System.out.println("hiii");
		try
		{
			int a[]=new int[4];
			a[7]=2;								//exception occurs handle by catch block
			System.out.println(10/0);		
			System.out.println("try block");	
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		catch(NullPointerException e)
		{
			System.out.println(e);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
		}
		catch(Exception e)					//UNIVERSAL exception handler
		{
			System.out.println(e);
		}
		finally
		{
			System.out.println("finally block"); 
		}
		System.out.println("Bye");
	}

}
