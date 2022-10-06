package com.day25;

import java.util.Arrays;
import java.util.Scanner;

class Employee
{
	int empId;
	String empName;
	float empSal;
	Employee(int empId, String empName, float empSal)
	{
		this.empId=empId;
		this.empName=empName;
		this.empSal=empSal;
	}
	public String toString() {
		return empId+" "+empName+" "+empSal;
	}
}

public class ArrayOfEmployee {

	public static void main(String[] args) {

		Employee emp[]=new Employee[3];
		emp[0]=new Employee(1, "A", 75000);
		emp[1]=new Employee(2, "B", 65000);
		emp[2]=new Employee(3, "C", 55000);

		System.out.println("Using toString method \n"+Arrays.toString(emp)+"\n");
		System.out.println("using object of array ");
		for(int i=0;i<emp.length;i++)
		{
			System.out.println(emp[i].empId+" "+emp[i].empName+" "+emp[i].empSal);
		}
	}
}
