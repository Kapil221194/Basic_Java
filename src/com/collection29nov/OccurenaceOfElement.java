package com.collection29nov;
import java.util.*;

public class OccurenaceOfElement {

	public static void occurence(ArrayList<String> al)
	{
		for(int i=0;i<al.size();i++)
		{
			int count=1;
			for(int j=i+1;j<al.size();j++)
			{
				if(al.get(i).equals(al.get(j)))
				{
					count++;
					al.remove(j);
					j--;
				}
			}
			System.out.println(al.get(i)+" " +count);
		}
	}
	
	public static void main(String[] args) {

		ArrayList<String> al=new ArrayList();
		al.add("pune");
		al.add("nagpur");
		al.add("mumbai");
		al.add("delhi");
		al.add("chennai");
		al.add("pune");
		al.add("nagpur");
		al.add("mumbai");
		al.add("pune");
		al.add("nagpur");
		al.add("pune");
		System.out.println(al);
		
		occurence(al);
	}

}
