package com.collectionMap7dec;

import java.util.*;

public class HashMapDemo {

	public static void main(String[] args) {

		HashMap<Integer, String> m=new HashMap();
		m.put(10, "Dell");
		m.put(20, "Lenovo");
		m.put(30, "HP");
		m.put(40, "Aser");
		m.put(50, "Asus");
		System.out.println(m);
		
		System.out.println(m.get(40));
		m.put(40, "Razor");
		System.out.println(m);
		
		m.put(null,  null);     //null key value alway comes at first position.
		System.out.println(m);
		
		m.put(null, "wipro");   // if key value is same then using equal method old element of key get replaced with new. 
		System.out.println(m);
		
//		m.clear();				//clear all entry for hashmap.
//		System.out.println(m);
		
		System.out.println(m.keySet()); //it will return all key values
		System.out.println(m.values()); //it will return all element values
	
		System.out.println("\nDisplay using enhance for loop ");
		for(Map.Entry<Integer, String> hm:m.entrySet())
		{
			System.out.println(hm.getKey() +" "+hm.getValue());
		}
	
		System.out.println("\nDisplay using Iterator ");
		Set s=m.entrySet();
		Iterator<Map.Entry<Integer, String>> itr=s.iterator();
			while(itr.hasNext())
			{
				Map.Entry<Integer, String> hm=itr.next();
				System.out.println(hm.getKey()+" "+hm.getValue());
			}
		
			System.out.println("\nDisplay using Iterator type 2 ");
			Set s1=m.keySet();
			Iterator<Integer>it=s1.iterator();
			while(it.hasNext())
			{
				Integer key=it.next();
				System.out.println(key +" "+m.get(key));
			}
			
	}

}
