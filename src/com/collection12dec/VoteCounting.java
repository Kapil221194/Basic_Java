package com.collection12dec;

import java.util.*;

public class VoteCounting {

	public static void main(String[] args) {

		HashMap<String, String> hm = new HashMap();
		hm.put("123", "AAP");
		hm.put("234", "AAP");
		hm.put("345", "BJP");
		hm.put("456", "NCP");
		hm.put("567", "AAP");
		hm.put("678", "BJP");
		hm.put("789", "NCP");

		System.out.println("Given votes");
		for(Map.Entry<String, String> m:hm.entrySet())
		{
			System.out.println(m.getKey()+" "+m.getValue());
		}

		TreeMap<String, Integer> tm = new TreeMap();
		
		for(Map.Entry<String, String> h:hm.entrySet())
		{
			Integer count=0;
			for(Map.Entry<String, String> h1:hm.entrySet())
			{
				if(h.getValue()==h1.getValue())
				{
					count++;
				}
			}
			if(!tm.containsValue(h.getValue()))
			{
				tm.put(h.getValue(), count);
			}
		}
		
		System.out.println("\nvote counted");
		
		for(Map.Entry<String, Integer> m:tm.entrySet())
		{
			System.out.println(m.getKey()+" "+m.getValue());
		}
	}

}
