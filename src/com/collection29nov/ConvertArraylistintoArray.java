package com.collection29nov;
import java.util.*;

public class ConvertArraylistintoArray {

	public static void main(String[] args) {

		ArrayList<Integer> al= new ArrayList();
		al.add(12);
		al.add(24);
		al.add(6);
		al.add(3);
		al.add(9);
		System.out.println("ArrayList is \n"+al);
		
		al.add(1, 36);
		System.out.println("ArrayList after adding 36 at indes 1 \n"+al);
		//it will add 36 at index 1 and shift element
		
		al.set(4, 4);
		System.out.println("ArrayList after replacing 4 at indes 4 \n"+al);
		//it will replace 4 with element at index 4
		
		Object[] ar=al.toArray();
		System.out.println("After converting arraylist into array \n"+Arrays.toString(ar));
		
		Integer [] ar1=al.toArray(new Integer[al.size()]);
		System.out.println("After converting arraylist into array");
		for(Integer i:ar1)
		{
			System.out.println(i);
		}
		
		Integer []ar2=new Integer[al.size()];
		for(int i=0; i<al.size();i++)
		{
			ar2[i]=al.get(i);
		}
		System.out.println("After converting arraylist into array\n"+Arrays.toString(ar2));
		
		
	}

}
