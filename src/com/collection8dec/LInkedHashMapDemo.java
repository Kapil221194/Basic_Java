package com.collection8dec;
import java.util.*;

public class LInkedHashMapDemo {

	public static void main(String[] args) {

		LinkedHashMap<Integer, String> lhm=new LinkedHashMap();
		lhm.put(1, "abc");
		lhm.put(2, "def");
		lhm.put(3, "ghi");
		lhm.put(4, "jkl");
		lhm.put(5, "mno");
		
		System.out.println(lhm);
		
		for(Map.Entry<Integer, String> m:lhm.entrySet())
		{
			System.out.println(m.getKey()+" "+m.getValue());
		}
	}

}
