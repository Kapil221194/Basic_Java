package com.collection6dec;

import java.util.*;

public class Employee {
	
	int id;
	String name;
	double salary;

	public Employee(int id, String name, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public Employee() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

	public static void main(String[] args) {

		ArrayList<Employee> al=new ArrayList();
		al.add(new Employee(1, "Rahul", 10000));
		al.add(new Employee(2, "sham", 15000));
		al.add(new Employee(3, "kalam", 20000));
		al.add(new Employee(4, "vicky", 25000));
		System.out.println(al);
		
		Iterator<Employee> itr=al.iterator();
		while(itr.hasNext())
		{
			Employee e=itr.next();
			if(e.salary<=15000)
			{
				e.salary=e.salary+(15000*0.1);
			}
			
		}
		System.out.println("...............................");
		System.out.println(al);
	}

}
