package com.collection29nov;

import java.util.*;

public class FailFastDemo {

	public static void main(String[] args) {

		ArrayList<String> al = new ArrayList();
		al.add("pune");
		al.add("nagpur");
		al.add("mumbai");
		al.add("delhi");
		al.add("chennai");
		System.out.println(al);

		Iterator<String> itr = al.iterator();
		while (itr.hasNext()) {
			String s = itr.next();
			if (s.equals("delhi")) {
				itr.remove();
				// al.remove(s); // it give error concurrent modification.
			}
		}
		System.out.println(al);
	}

}
