package com.day19;

class Books
{
	final String book_name="Loard Budhha";
	final void Show()
	{
		System.out.println(book_name);
	}
}
class Writter extends Books
{
	String auther_name ;
	
/*	@Override
	 void Show() {										//final method of super class can't be override in sub class
		System.out.println(book_name+"\n"+auther_name);
	} 
*/	
	void Show(String auther_name) {							// show method can't overload by compiler because final method declare in super class
		this.auther_name="Dr.B.R.AMbedkar";
		System.out.println(book_name+"\n"+this.auther_name);
	}
	
}

public class OverloadFinalTypeMethod {

	public static void main(String[] args) {

		Writter w= new Writter();
		w.Show();
	}

}
