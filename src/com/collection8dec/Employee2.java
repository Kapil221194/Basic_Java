//Using LinkedHashMap

package com.collection8dec;
import java.util.*;

public class Employee2 {
	
	int id;
	String name;
	int salary;
	
	public Employee2(int id, String name, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee2 [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	
	public int hashCode()
	{
		return id;
	}
	
	public boolean equals(Object o)
	{
		Employee2 e=(Employee2)o;
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

		LinkedHashMap<Employee2,String> lhm=new LinkedHashMap();
		lhm.put(new Employee2(1, "Rahul", 5000), "HR");
		lhm.put(new Employee2(2, "Shital", 6000), "admin");
		lhm.put(new Employee2(3, "Suyog", 7000), "sales");

		System.out.println(lhm+"\n");
		lhm.put(new Employee2(1, "Rahul", 5000), "production");
		
		for(Map.Entry<Employee2, String> m:lhm.entrySet())
		{
			System.out.println(m.getKey()+" "+m.getValue());
		}
	}

}
