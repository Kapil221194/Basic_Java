package com.day12OOPS;

public class StudentDetails {
	
	int student_id;
	public String student_name;
	private int maths_1,maths_2,maths_3;
	protected int student_batch;
	
	void acceptStudentDetails(int id, String sname,int b, int m1,int m2,int m3) {
		student_id=id;
		student_name=sname;
		maths_1=m1;
		maths_2=m2;
		maths_3=m3;
		student_batch=b;
	}
	private void displayStudentMarks() {
		System.out.println("Marks in Maths :"+maths_1);
		System.out.println("Marks in Science :"+maths_2);
		System.out.println("Marks in English :"+maths_3);
	}
	public void displayStudentDetails() {
		System.out.println("Student Id :"+student_id);
		System.out.println("Student name :"+student_name);
		System.out.println("Student Batch :"+student_batch);
		percentageCalculator();
	}
	protected void percentageCalculator() {
		float per=((maths_1+maths_2+maths_3)*100)/300;
		System.out.println("Student Percentage :"+per);
	}
	public static void main(String []args) {
		StudentDetails s=new StudentDetails();
		s.acceptStudentDetails(22, "Bittu", 2016, 75, 85, 80);
		s.displayStudentDetails();
		s.displayStudentMarks();
		s.percentageCalculator();
		System.out.println();
		System.out.println(s.maths_1+" "+s.maths_2+" "+s.maths_3);
		System.out.println(s.student_name);
		System.out.println(s.student_id);
		System.out.println(s.student_batch);
	}
}
