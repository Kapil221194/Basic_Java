package com.day11OOPS;

public class Vehicle {
	
	int model_no;
	String vehicle_name;
	int price;
	
	public static void main(String [] args) {
	
		Vehicle v=new Vehicle();
		v.model_no=221194;
		v.vehicle_name="Lambo";
		v.price=100000;
		
		System.out.println("model no="+v.model_no+"\n"+"vehicle name="+v.vehicle_name+"\n"+"price="+v.price);
		
	}

}
