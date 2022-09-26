package com.APractice;

class test
{
	public static void Show()
	{
		System.out.println("Static show method");
	}
	public void Show1()
	{
		System.out.println("Show1 method");
	}
}

public class StaticTest {

	public static void main(String[] args) {

		test.Show();		//we can call static method directly in main using class name.
		test t=new test();  // to call non static method need to create object of class.
		t.Show1();
	}

}
