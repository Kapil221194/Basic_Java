package com.day11OOPS;

import com.day12OOPS.StudentDetails;

public class StudentDetailsCheck1 {

	public static void main(String[] args) {

		//calling variable and method of StudentDtails class.
		//private variable and methods are not visible in this class.
		//default variable and methods are not visible in this class.
		//protected variable and methods are not visible in this class.
		
		StudentDetails sdc=new StudentDetails();
		//sdc.acceptStudentDetails(22, "Bittu", 2016, 75, 85, 80);
		sdc.displayStudentDetails();
		//sdc.displayStudentMarks();
		//sdc.percentageCalculator();
		System.out.println();
		//System.out.println(sdc.maths_1+" "+sdc.maths_2+" "+sdc.maths_3);
		System.out.println(sdc.student_name);
		//System.out.println(sdc.student_id);
		//System.out.println(sdc.student_batch);
	}

}
