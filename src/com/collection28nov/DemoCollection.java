package com.collection28nov;

import java.util.*;

public class DemoCollection {

	public static void main(String[] args) {

		ArrayList <String> str=new ArrayList <String>();
		str.add("pune");
		str.add("mumbai");
		str.add("nagpur");
		str.add("bangluru");
		str.add("chennai");
		
		System.out.println("1st way to display :"+str);
		
		System.out.println("2nd way to display :");
		for(int i=0;i<str.size();i++)
		{
			System.out.println(str.get(i));
		}
		
		System.out.println("3rd way to display :");
		for(String s:str)
		{
			System.out.println(s);
		}
		
		System.out.println("Display element using iterator :");
		Iterator<String> itr=str.iterator();
		while(itr.hasNext())
		{
			String s=itr.next();
			System.out.println(s);
		}
		
	}

}
