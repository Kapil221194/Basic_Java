package com.collection30nov;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListOfStudent {
	
	int stud_id;
	String stud_name;
	int marks;
	
	ArrayListOfStudent(int stud_id, String stud_name, int marks)
	{
		this.stud_id=stud_id;
		this.stud_name=stud_name;
		this.marks=marks;
	}
	
	public String toString()
	{
		return "stud id : "+stud_id+" stud name : "+stud_name+" marks : "+marks +"\n";
	}

	public static void main(String[] args) {

		ArrayList<ArrayListOfStudent> al=new ArrayList<ArrayListOfStudent>();
		al.add(new ArrayListOfStudent(1, "Ram", 55));
		al.add(new ArrayListOfStudent(2, "Sita", 60));
		al.add(new ArrayListOfStudent(3, "Laxman", 65));
		al.add(new ArrayListOfStudent(4, "Rahul", 70));
		
		System.out.println("All student data\n"+al+"\n");
		
		System.out.println("student with >60 marks");
		Iterator<ArrayListOfStudent> itr=al.iterator();
		while(itr.hasNext())
		{
			ArrayListOfStudent stud=itr.next();
			if(stud.marks>60)
			System.out.println(stud);
		}
	}

}
