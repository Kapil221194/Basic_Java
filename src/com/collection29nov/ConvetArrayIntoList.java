package com.collection29nov;
import java.util.*;

import java.util.Arrays;

public class ConvetArrayIntoList {

	public static void main(String[] args) {

		String [] ar= {"red", "blue","black","green"};
		System.out.println("Array is \n"+Arrays.toString(ar));
		
		ArrayList<String> al=new ArrayList(Arrays.asList(ar));
		System.out.println("Arraylist is \n"+al);
		
		ArrayList<String> al1=new ArrayList(Arrays.asList());
		Collections.addAll(al1, ar);
		System.out.println("Arraylist is \n"+al1);
		
		ArrayList<String> al2=new ArrayList(Arrays.asList());
		for(int i=0;i<ar.length;i++)
		{
			al2.add(ar[i]);
		}
		System.out.println("Arraylist is \n"+al2);
		
//		methods of arraylist
		
//		System.out.println("Arraylist size is "+al.size());
//		System.out.println("Arraylist after removing index 1 ");
//		al.remove(1);
//		System.out.println(al);
//		System.out.println("Arraylist after removing value green ");
//		al.remove("green");
//		System.out.println(al);
//		System.out.println("is collection empty : "+al.isEmpty());
//		System.out.println("is collection contain red : "+al.contains("red"));
//		//al.clear();  //it will clear the collection.
		
		
		
	}

}
