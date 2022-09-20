package com.day12OOPS;

public class StudentDetailsCheck {

	public static void main(String[] args) {

		//calling variable and method of StudentDtails class.
		//private variable and methods are not visible in this class.
		
			StudentDetails sd=new StudentDetails();
			sd.acceptStudentDetails(22, "Bittu", 2016, 75, 85, 80);
			sd.displayStudentDetails();
			//sd.displayStudentMarks();
			sd.percentageCalculator();
			System.out.println();
			//System.out.println(sd.maths_1+" "+sd.maths_2+" "+sd.maths_3);
			System.out.println(sd.student_name);
			System.out.println(sd.student_id);
			System.out.println(sd.student_batch);
			
			Account ac=new Account();
			//ac.setAccountDetails(954588302, 100000, "Saving Account");
			ac.displayAccountDetails();
			System.out.println();
			ac.dipositAmount();
			//ac.withdrawaltAmount();
	}

}
