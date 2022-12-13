package com.collection12dec;
import java.util.*;

class Student
{
	int sid;
	int totalMarks;
	public Student(int sid, int totalMarks) {
		super();
		this.sid = sid;
		this.totalMarks = totalMarks;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", totalMarks=" + totalMarks + "]";
	}
	
}

class Test
{
	int tid;
	int sid;
	int marks;
	public Test(int tid, int sid, int marks) {
		super();
		this.tid = tid;
		this.sid = sid;
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Test [tid=" + tid + ", sid=" + sid + ", marks=" + marks + "]";
	}
	
}

public class StudentTest {

	public static void main(String[] args) {

		ArrayList<Test> al=new ArrayList();
		al.add(new Test(1, 11, 80));
		al.add(new Test(2, 11, 75));
		al.add(new Test(3, 22, 85));
		al.add(new Test(1, 22, 75));
		al.add(new Test(2, 33, 80));
		
		TreeSet<Student> ts= new TreeSet(new MyComp());
		
		Iterator<Test> itr=al.iterator();
		while(itr.hasNext())
		{
			int totalMarks=0;
			Test t1=itr.next();
			Iterator<Test> itr1=al.iterator();
			while(itr1.hasNext())
			{
				Test t2=itr1.next();
				if(t2.sid==t1.sid)
				{
					totalMarks=totalMarks+t2.marks;
				}
				
			}
			Student s=new Student(t1.sid, totalMarks);
			if(!ts.contains(s))
			{
				ts.add(s);
			}
		}
		for(Student t:ts)
		{
			System.out.println(t+"\n");	
		}
		
	}

}
class MyComp implements Comparator<Student>
{

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		return o2.totalMarks-o1.totalMarks;
	}
	
}