package com.collection5dec;
import java.util.*;

class Department1
{
	int did;
	String dname;
	public Department1(int did, String dname) {
		
		this.did = did;
		this.dname = dname;
	}
	@Override
	public String toString() {
		return did+" " +dname+" ";
	}
}

public class Employee1 {

	int id;
	String name;
	int salary;
	Department1 dept;
	public Employee1(int id, String name, int salary, Department1 dept) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.dept = dept;
	}
	@Override
	public String toString() {
		return  id+" "+name+" "+salary+" " +dept+" \n";
	}

	public static void main(String[] args) {
		
		ArrayList<Employee1> al=new ArrayList();
		Scanner sc=new Scanner(System.in);
		for(int i=1;i<=3;i++)
		{
			System.out.println("Enter emp id ");
			int empid=sc.nextInt();
			System.out.println("Enter emp name :");
			String empname=sc.next();
			System.out.println("Enter emp salary :");
			int empsal=sc.nextInt();
			System.out.println("Enter Department id :");
			int deptid=sc.nextInt();
			System.out.println("Enter department name :");
			String deptname=sc.next();
			
			Employee1 e=new Employee1(empid,empname,empsal, new Department1(deptid,deptname));
			al.add(e);
		}
		System.out.println(al);
	}

}
