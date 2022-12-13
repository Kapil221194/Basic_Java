package com.collection5dec;
import java.util.*;

class Student
{
	int stud_id;
	String stud_name;
	int stud_marks;
	
	Student(int stud_id, String stud_name, int stud_marks)
	{
		this.stud_id=stud_id;
		this.stud_name=stud_name;
		this.stud_marks=stud_marks;
	}
	public String toString()
	{
		return stud_id+" "+stud_name+" "+stud_marks;
	}
	
}
public class Course {
	
	int courseId;
	String courseName;
	Student stud;
	
	Course(int courseId, String courseName, Student stud)
	{
		this.courseId=courseId;
		this.courseName=courseName;
		this.stud=stud;
	}
	
	
	public String toString()
	{
		return courseId+" "+courseName+" "+stud;
	}
	

	public static void main(String[] args) {

		ArrayList<Course>al=new ArrayList();
		al.add(new Course(1, "English", (new Student(10, "Ram", 70))));
		al.add(new Course(2, "Maths", (new Student(20, "Siya", 60))));
		al.add(new Course(3, "Science", (new Student(30, "Shubham", 75))));
		al.add(new Course(4, "Physics", (new Student(40, "Dev", 65))));
		
		System.out.println(al);
	}

}
