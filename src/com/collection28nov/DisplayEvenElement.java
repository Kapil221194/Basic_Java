package com.collection28nov;
import java.util.*;

public class DisplayEvenElement {
	
	public static void main(String [] args)
	{
	
		ArrayList<Integer> intList=new ArrayList();
		intList.add(22);
		intList.add(33);
		intList.add(44);
		intList.add(55);
		intList.add(66);
		intList.add(77);
		intList.add(88);
		intList.add(99);
		
		for(int i=0;i<intList.size();i++)
		{
			if(i%2==0)
			System.out.println(intList.get(i));
		}
		
	}

}
