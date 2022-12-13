package com.exception1711;

import java.io.FileNotFoundException;
import java.io.IOException;

class ExceptionRule2 {

	// Rule 2- If parent declare any exception

	public void run() throws IOException {

	}

}

public class OverridingExceptionRule2 {

	// rule 2.1- child may not declare exception
//	public void run() {
//
//	}
	// rule 2.2- child may declare same exception or
	//			 child can declare child exception of (parent methods) parent exception
//	public void run() throws IOException
//	{
//		
//	}
//	public void run() throws FileNotFoundException
//	{
//		
//	}
	// rule 2.3- child can't able to declare parent exception of parent class method's exception
//	@Override
//	public void run() throws Exception
//	{
//		
//	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
