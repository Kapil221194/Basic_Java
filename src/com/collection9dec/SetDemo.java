package com.collection9dec;
import java.util.*;

public class SetDemo {

	public static void main(String[] args) {

		HashSet<String> hs=new HashSet();
		hs.add("pune");
		hs.add("mumbai");
		hs.add("nagpur");
		hs.add("delhi");
		System.out.println(hs);
		
		hs.add("pune");			// could not add duplicate elements.
		System.out.println(hs);
		System.out.println("\nDisplay using iterator");
		Iterator<String> itr=hs.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		System.out.println("\nDisplay using enhance for loop");
		for(String str:hs)
		{
			System.out.println(str);
		}
		
	}

}
