package com.collection5dec;

import java.util.*;

public class Car implements Comparable<Car> {
	
	int modelNo;
	String name;
	int price;
	
	Car(int modelNo, String name, int price)
	{
		this.modelNo=modelNo;
		this.name=name;
		this.price=price;
	}
	
	public String toString()
	{
		return modelNo+" "+name+" "+price;
	}
	
	public int compareTo(Car c)
	{
		if(this.price>c.price)
		{
			return 1;
		}
		else if(this.price<c.price)
		{
			return -1;
		}
		else
		{
			return 0;
		}
	}

	public static void main(String[] args) {

		ArrayList<Car> al=new ArrayList();
		al.add(new Car(11, "Honda", 850000));
		al.add(new Car(22, "Renault", 750000));
		al.add(new Car(33, "Mahindra", 800000));
		al.add(new Car(44, "Tata", 700000));
		System.out.println(al);
		
		Collections.sort(al);
		System.out.println(al);
	}

}
