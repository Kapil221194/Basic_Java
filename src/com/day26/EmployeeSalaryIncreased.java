package com.day26;

import java.util.Scanner;

class Employee
{
	int id;
	String name;
	float salary;
	
	public Employee(int id,String name,float salary)
	{
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	public String toString()
	{
		return id+" "+name+" "+salary;
	}
}


public class EmployeeSalaryIncreased {

	public static void main(String[] args) {

		Scanner sc=new Scanner (System.in);
		Employee emp[]=new Employee[3];
		for(int i=0;i<emp.length;i++)
		{
			System.out.print("Enter emp Id :");
			int empid=sc.nextInt();
			System.out.print("Enter emp name :");
			String empName=sc.next();
			System.out.print("Enter emp salary :");
			float sal=sc.nextFloat();
			emp[i]=new Employee(empid,empName,sal);
			
		}
		for (int j = 0; j < emp.length; j++) 
		{
			System.out.println(emp[j]);
		}
		
		for (int i = 0; i < emp.length; i++) 
		{
			if(emp[i].salary<15000)
			{
				float incSal = emp[i].salary+emp[i].salary*0.10f;
				emp[i].salary=incSal;
				System.out.println("\n"+emp[i]);
			}
		}
		
		
	}

}
