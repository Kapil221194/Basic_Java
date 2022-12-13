//Using HashMap

package com.collection8dec;
import java.util.*;

public class Employee1 {
	
	int id;
	String name;
	int salary;
	
	Employee1(int id, String name,int salary)
	{
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	
	public String toString()
	{
		return id+" "+name+" "+salary;
	}

	public int hashCode()
	{
		return id;
	}
	
	public boolean equals(Object o)
	{
		Employee1 e=(Employee1)o;
		if(this.id==e.id)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public static void main(String[] args) {

		HashMap<Employee1, String> hm=new HashMap();
		hm.put(new Employee1(1, "Rahul", 5000), "HR");
		hm.put(new Employee1(2, "Shital", 6000), "admin");
		hm.put(new Employee1(3, "Suyog", 7000), "sales");
		hm.put(new Employee1(1, "Rahul", 5000), "production");//it will add same key with different value, 
															  //if we override override hashCode() and equals()
															  //then it will replace the element
		
		for(Map.Entry<Employee1, String> m:hm.entrySet())
		{
			System.out.println(m.getKey()+" "+m.getValue());
		}
		
	}

}
