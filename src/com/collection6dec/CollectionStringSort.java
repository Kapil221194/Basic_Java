package com.collection6dec;
import java.util.*;

public class CollectionStringSort {

	public static void main(String[] args) {

		ArrayList<String> al=new ArrayList();
		al.add("pune");
		al.add("mumbai");
		al.add("nagpur");
		al.add("banglore");
		al.add("Chennai");
		al.add("delhi");
		System.out.println(al);

		Collections.sort(al, Collections.reverseOrder());
		System.out.println(al);
	}

}
