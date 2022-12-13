package com.collection8dec;

import java.util.*;

public class TreeMapDemo {

	public static void main(String[] args) {

		// TreeMap<Integer, String> tm=new TreeMap();
		TreeMap<Integer, String> tm = new TreeMap(new MyComp());
		tm.put(10, "a");
		tm.put(20, "s");
		tm.put(30, "d");
		tm.put(40, "w");

		System.out.println(tm);

		for (Map.Entry<Integer, String> m : tm.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}

		System.out.println(tm.firstEntry()); // return first keys element
		System.out.println(tm.ceilingEntry(35)); // return previous keys elements of given value
		System.out.println(tm.floorEntry(35)); // return next keys elements of given value
		System.out.println(tm.subMap(30, 20));
		System.out.println(tm.subMap(30, true, 20, true));
		System.out.println(tm.descendingKeySet());
		System.out.println(tm.headMap(20, true));

	}

}

class MyComp implements Comparator<Integer> {
	public int compare(Integer i1, Integer i2) {
		return i2 - i1;
	}
}