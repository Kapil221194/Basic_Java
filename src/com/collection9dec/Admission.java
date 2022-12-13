package com.collection9dec;
import java.util.*;

class Candidates implements Comparable<Candidates>
{
	int c_id;
	String c_name;
	int perc;
	
	public Candidates(int c_id, String c_name, int perc) {
		this.c_id = c_id;
		this.c_name = c_name;
		this.perc = perc;
	}
	public Candidates() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Admission [c_id=" + c_id + ", c_name=" + c_name + ", perc=" + perc + "]";
	}
	@Override
	public int compareTo(Candidates o) {
		return o.perc-this.perc;
	}

}

public class Admission {

	public static void main(String[] args) {

		PriorityQueue<Candidates> p=new PriorityQueue();
		p.add(new Candidates(1, "Ram", 67));
		p.add(new Candidates(5, "Suyog", 78));
		p.add(new Candidates(3, "Yogita", 55));
		p.add(new Candidates(2, "Poonam", 66));
		p.add(new Candidates(4, "Anup", 86));
		System.out.println(p);
		
		TreeSet<Candidates> ts=new TreeSet();
		
		while(!p.isEmpty())
		{
			ts.add(p.poll());
		}
		
		System.out.println("\n"+ts);
		
	}

}
