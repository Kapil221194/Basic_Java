package com.collection29nov;

import java.util.ArrayList;

public class SortArrayList {

	public static void main(String[] args) {

		ArrayList<Integer> al = new ArrayList();
		al.add(5);
		al.add(10);
		al.add(1);
		al.add(7);
		al.add(13);
		al.add(12);

		System.out.println(al);

		for (int i = 0; i < al.size(); i++) {
			for (int j = i + 1; j < al.size(); j++) {
				Integer temp = 0;
				if (al.get(i) > al.get(j)) {
					temp = al.get(i);
					al.set(i, al.get(j));
					al.set(j, temp);
				}
			}
		}
		System.out.println(al);

	}

}
