package com.exception1711;

//import java.sql.SQLException;

class ExceptionRule1
{
	// rule 1 - if parent does not declare any exception
	public void run()
	{
		
	}
}

public class OverridingExceptionRule1 extends ExceptionRule1 {
	
	//Then child will not allow to declare any exception 
	//including checked type exception
	//except unchecked type exception.
	@Override
	public void run() throws NullPointerException
	{
		
	}

	//checked type exception not allowed
//	@Override
//	public void run() throws SQLException
//	{
//		
//	}
	
	public static void main(String[] args) {

	}

}
