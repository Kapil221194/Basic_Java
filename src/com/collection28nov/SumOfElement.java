package com.collection28nov;

import java.util.ArrayList;

public class SumOfElement {

	public static void main(String[] args) {

		ArrayList<Integer> intList=new ArrayList();
		intList.add(12);
		intList.add(15);
		intList.add(10);
		intList.add(8);
		intList.add(12);
		intList.add(99);
		
		int sum=0;
		for(int i=0;i<intList.size();i++)
		{
			sum=sum+intList.get(i);
			
		}
		System.out.println("Sum of all elements is "+sum);
	}

}
