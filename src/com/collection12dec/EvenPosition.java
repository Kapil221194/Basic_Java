package com.collection12dec;

import java.util.*;

public class EvenPosition {

	public static void main(String[] args) {

		ArrayList<Integer> al=new ArrayList();
		al.add(22);
		al.add(33);
		al.add(44);
		al.add(55);
		al.add(66);
		al.add(77);
		al.add(88);
		al.add(99);
		al.add(111);
		
		System.out.println(al);
		System.out.println("\neven position elements");
		Iterator<Integer> itr=al.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
			if(itr.hasNext())
			{
				itr.next();
			}
		}
		
		System.out.println("\nodd position elements");
		Iterator<Integer> itr1=al.iterator();
		while(itr1.hasNext())
		{
			itr1.next();
			if(itr1.hasNext())
			{
				System.out.println(itr1.next());
			}
		}
	}

}
