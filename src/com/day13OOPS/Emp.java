package com.day13OOPS;

public class Emp {

	int emp_id;
	String emp_name;
	float emp_salary;
	
	Emp(int emp_id, String emp_name, float emp_salary){
		this.emp_id=emp_id;
		this.emp_name=emp_name;
		this.emp_salary=emp_salary;
	}
	void Display() {
		System.out.println(emp_id+" "+emp_name+" "+emp_salary);
	}
	
	public static void main(String[] args) {
		
		Emp e=new Emp(1, "Rahul", 75000);
		e.Display();
		Emp e1=new Emp(2, "Riya", 70000);
		e1.Display();
		Emp e2=new Emp(3, "Ravi", 70000);
		e2.Display();
	
	}

}
