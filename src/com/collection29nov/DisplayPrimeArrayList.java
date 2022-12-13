package com.collection29nov;

import java.util.*;

public class DisplayPrimeArrayList {

	public static void main(String[] args) {

		ArrayList<Integer> al=new ArrayList();
		al.add(5);
		al.add(7);
		al.add(10);
		al.add(11);
		al.add(13);
		al.add(25);
		
		
		for(int i=0;i<al.size();i++)
		{
			int count=0;
			for(int j=1;j<=al.get(i);j++)
			{
				if(al.get(i)%j==0)
				{
					count++;
					//System.out.println(al.get(i));
				}
				//System.out.println(count);
			}
			if(count==2)
			{
				System.out.println(al.get(i));
			}
		}
	}

}
