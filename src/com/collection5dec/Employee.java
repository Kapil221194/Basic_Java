package com.collection5dec;
import java.util.*;

class Department
{
	int did;
	String dname;
	String city;
	
	Department(int did, String dname, String city)
	{
		this.did=did;
		this.dname=dname;
		this.city=city;
	}
	public String toString()
	{
		return did+" "+dname+" "+city;
	}
}

public class Employee {
	
	int empid;
	String empname;
	int salary;
	Department dept;
	
	Employee(int empid, String empname, int salary, Department dept)
	{
		this.empid=empid;
		this.empname=empname;
		this.salary=salary;
		this.dept=dept;
	}
	public String toString()
	{
		return empid+" "+empname+" "+salary+" "+dept+"\n";
	}

	public static void main(String[] args) {

		ArrayList<Employee> al=new ArrayList();
		al.add(new Employee(1,"riya",65000 ,(new Department(10,"Sales", "pune"))));
		al.add(new Employee(2,"siya",65000 ,(new Department(20,"admin", "pune"))));
		al.add(new Employee(3,"ram",65000 ,(new Department(10,"Sales", "mumbai"))));
		al.add(new Employee(4,"laxman",65000 ,(new Department(20,"admin", "mumbai"))));
		
		System.out.println(al);
		
		
	}
}
