package com.collection8dec;
import java.util.*;

public class Employee {
	
	int id;
	String name;
	int salary;
	String deptName;

	public Employee(int id, String name, int salary, String deptName) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.deptName = deptName;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", deptName=" + deptName + "]";
	}

	public static void main(String[] args) {

		ArrayList<Employee> al=new ArrayList();
		al.add(new Employee(1, "Rahul", 50000, "HR"));
		al.add(new Employee(2, "Riya", 55000, "sales"));
		al.add(new Employee(3, "Nitin", 60000, "sales"));
		al.add(new Employee(4, "Shital", 65000, "HR"));
		al.add(new Employee(5, "Poonam", 70000, "Admin"));
		
		for(Employee e:al)
		{
			System.out.println(e);
		}
		
		HashMap<String, Employee > hm=new HashMap();
		
		
		for(Map.Entry<String, Employee> m:hm.entrySet())
		{
			System.out.println(m.getKey()+" "+m.getValue());
		}
		
		
		
	}

}
