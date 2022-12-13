package com.collection29nov;

import java.util.ArrayList;

public class MethodDemo {

	public static void main(String[] args) {

		ArrayList<String> al=new ArrayList();
		al.add("pune");
		al.add("nagpur");
		al.add("mumbai");
		al.add("delhi");
		al.add("chennai");
		System.out.println(al);
		
		ArrayList<String> al1=new ArrayList();
		al1.add("pune");
		al1.add("goa");
		al1.add("nashik");
		System.out.println(al1);
		
//		al1.addAll(al);				//it will join one list to another.
//		System.out.println(al1);
		
//		al1.addAll(0, al);
//		System.out.println( al1);   //it add list1 element at index 0. 
		
//		al1.removeAll(al);			// it will delete all element of list1 from list2 and also same element as list1
//		System.out.println(al1);
		
		al1.retainAll(al);			//it will return same element of both lists
		System.out.println(al1);
		
	}

}
