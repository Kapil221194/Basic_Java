package com.day25;

import java.util.Scanner;

class Student
{
	int StudId;
	String studName;
	int studMark;
	Student(int studId, String studName, int studMark)
	{
		this.StudId=studId;
		this.studName=studName;
		this.studMark=studMark;
	}
	public String toString() {
		return StudId+" "+studName+" "+studMark;
	}
	
}


public class ArrayOfStudent {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);

		System.out.println("Enter array range :");
		int n=sc.nextInt();
		Student s[]=new Student[n];
		
		System.out.println("Enter student Info :");
		for(int i=0;i<s.length;i++)
		{
			System.out.println("Enter student ID :");
			int sid=sc.nextInt();
			System.out.println("Enter student name :");
			String sname=sc.next();
			System.out.println("Enter student mark :");
			int mark=sc.nextInt();
		
			s[i]=new Student(sid, sname, mark);
		}
		for(Student st:s) {
			System.out.println(st);
		}
	}

}
