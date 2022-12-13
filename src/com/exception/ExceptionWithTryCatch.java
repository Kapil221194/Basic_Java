package com.exception;

public class ExceptionWithTryCatch {

	public static void main(String[] args) {

		System.out.println("hiii");
		try
		{
			System.out.println(10/2);		//executed
			System.out.println(10/0);		//exception occurs and give handle to catch block
			System.out.println("try block");	//not going to execute if exception occurs at previous line
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
			System.out.println("catch block"); //if exception is not thrown then catch() will not execute.
		}
		System.out.println("Bye");
	}

}
