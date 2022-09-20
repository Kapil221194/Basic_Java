package com.day11OOPS;

public class Student {
	
	String student_name;
	int student_id;
	int sub1, sub2,sub3;
	
	public void AcceptStudentDetails(String sname, int sid, int m1, int m2, int m3) {
		
		student_name=sname;
		student_id=sid;
		sub1=m1;
		sub2=m2;
		sub3=m3;
	}
	
	public void Display() {
		
		System.out.println("Student Name :"+student_name+"\n"+"Student ID :"+student_id+"\n"+"Math :"+sub1+"\n"+"Science :"+sub2+"\n"+"English :"+sub3);
		
	}
	
	public void PercentageCalculator() {
		float per=((sub1+sub2+sub3)*100)/300;
		System.out.println("Student Percentage are :"+per);
	}
	
	public static void main(String[]args) {
		
		Student s1=new Student();
		s1.AcceptStudentDetails("Rahul", 11, 75,80,85);
		//System.out.println("Student Name :"+s1.student_name+"\n"+"Student ID :"+s1.student_id+"\n"+"Math :"+s1.sub1+"\n"+"Science :"+s1.sub2+"\n"+"English :"+s1.sub3);
		s1.Display();
		s1.PercentageCalculator();
		}

}
