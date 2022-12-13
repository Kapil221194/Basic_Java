package com.collection30nov;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListOfEmployee {
	
	int id;
	String name;
	int salary;
	
	ArrayListOfEmployee(int id, String name, int salary)
	{
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	
	public String toString()
	{
		return  "id = "+id+" name = "+name+" salary = "+salary+ "\n";
	}
	

	public static void main(String[] args) {

		ArrayList<ArrayListOfEmployee> al=new ArrayList<ArrayListOfEmployee>();
		al.add(new ArrayListOfEmployee(1, "Ram", 50000));
		al.add(new ArrayListOfEmployee(2, "Sita", 55000));
		al.add(new ArrayListOfEmployee(3, "Laxman", 60000));
		
		System.out.println("First way");
		System.out.println(al);
		
		System.out.println("\nsecond way");
		for(int i=0;i<al.size();i++)
		{
			System.out.println(al.get(i));
		}
		
		System.out.println("\nthird way");
		for(ArrayListOfEmployee emp:al)
		{
			System.out.println(emp);
		}
		
		System.out.println("\nforth way");
		Iterator<ArrayListOfEmployee> itr=al.iterator();
		while(itr.hasNext())
		{
			ArrayListOfEmployee emp=itr.next();
			System.out.println(emp);
		}
	}

}
