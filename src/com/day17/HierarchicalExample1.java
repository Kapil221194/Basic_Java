package com.day17;

class College{
	
	String college_name;
}
class Department extends College{
	String dept_name;
	String year;
	public void getDeptDetails() {
		college_name= "MIT";
		dept_name="Electronics";
		year="Final";
	}
	public void Show() {
		System.out.println(college_name+" "+dept_name+" "+year);
	}
}
class Laboratory extends College{
	String lab_name;
	int Stud_Strenght;
	public void getLabDetails() {
		college_name= "MIT";
		lab_name="EMF";
		Stud_Strenght = 20;
	}
	public void Show() {
		System.out.println(college_name+" "+lab_name+" "+Stud_Strenght);
	}
}



public class HierarchicalExample1 {

	public static void main(String[] args) {

		Department d=new Department();
		d.getDeptDetails();
		d.Show();
		Laboratory l=new Laboratory();
		l.getLabDetails();
		l.Show();
		
		
	}

}
