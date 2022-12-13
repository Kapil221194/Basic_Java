package com.collection9dec;
import java.util.*;

public class SetDemo1 {

	public static void main(String[] args) {

		ArrayList<Integer> al=new ArrayList();
		al.add(12);
		al.add(10);
		al.add(12);
		al.add(8);
		al.add(6);
		al.add(6);
		System.out.println(al);
		
		HashSet<Integer> hs=new HashSet(al);	//convert arraylist into hashset and remove all duplicate element.
		System.out.println(hs);
		
		al.clear();				//clear old arraylist	
		al.addAll(hs);			//add hashset output into old arraylist
		System.out.println(hs);
	}

}
