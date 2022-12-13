package com.exception;

public class NestedTryCatch {

	public static void main(String[] args) {

		try
		{
			try
			{
				int x=10;
				System.out.println(x/0);	
				
			}
			catch(NullPointerException e)
			{
				System.out.println("NullPointerException"+e.getMessage());
			}
			
//			if exception handler present in inner catch(), then don't to to outer catch() 
//			catch(ArithmeticException e)
//			{
//				System.out.println("ArithmeticException"+e.getMessage());
//			}
		
		}
		catch(Exception e)
		{
			//System.out.println(e);
			System.out.println("Exception"+e.getMessage());
		}
	}

}
