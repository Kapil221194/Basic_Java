package com.day16;

class Department{
	
	 int dept_id;
	 String dept_name;
	 Department(int dept_id, String dept_name){
		 this.dept_id=dept_id;
		 this.dept_name=dept_name;
	 }
	 public void Display() {
		 System.out.println(dept_id+" "+dept_name);
	 }
}

public class Employee {

	 int emp_id;
	 String emp_name;
	 int emp_salary;
	 Department dept;
	
	  Employee(int emp_id, String emp_name, int emp_salary, Department dept){
		this.emp_id=emp_id;
		this.emp_name=emp_name;
		this.emp_salary=emp_salary;
		this.dept=dept;
	 }
	 public void Display() {
		 System.out.println(emp_id+" "+emp_name+" "+emp_salary);
		 dept.Display();
	 }
	
	public static void main(String[] args) {
		Department d=new Department(22, "Customer_Support");
		Employee e=new Employee(1, "Ravi",72500,d);
		e.Display();
	}

}
