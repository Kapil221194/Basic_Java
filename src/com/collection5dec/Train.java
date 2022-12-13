package com.collection5dec;
import java.util.*;

public class Train implements Comparable<Train>{

	int train_no;
	String train_name;
	int no_of_seat;
	
	Train(int train_no, String train_name, int no_of_seat)
	{
		this.train_no=train_no;
		this.train_name=train_name;
		this.no_of_seat=no_of_seat;
	}
	
	public String toString()
	{
		return train_no+" "+train_name+" "+no_of_seat+"\n";
	}
	
	public int compareTo(Train t)
	{
		if(this.no_of_seat==t.no_of_seat)
		{
			return this.train_no-t.train_no;
		}
		else 
		{
			return this.no_of_seat-t.no_of_seat;
		}
		
	}
	
	
	public static void main(String[] args) {

		ArrayList<Train> al=new ArrayList();
		al.add(new Train(123,"nagpur exp", 12));
		al.add(new Train(345,"rajdhani exp", 9));
		al.add(new Train(678,"ajani sp", 12));
		al.add(new Train(901,"garibrath", 2));
		System.out.println(al);
		
		Collections.sort(al);
		System.out.println(al);
	}

}
