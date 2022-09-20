package com.day17;

class Vehicle{
	
	String vehicle_name;
	String vehicle_type;
	int wheels;
	String fuel_type;
}
class Car extends Vehicle{
	Car(){
	vehicle_name = "Renault Duster";
	vehicle_type = "sedan";
	wheels = 4;
	fuel_type = "Petrol";
	}
	public void Show(){
		System.out.println(vehicle_name+" "+vehicle_type+" "+wheels+" "+fuel_type);
	}
}
class Bike extends Vehicle{
	Bike(){
		vehicle_name = "Yahama MT15";
		vehicle_type = "sports";
		wheels = 2;
		fuel_type = "Petrol";
	}
	public void Show(){
		System.out.println(vehicle_name+" "+vehicle_type+" "+wheels+" "+fuel_type);
	}
}

public class HierarchicalExample {

	public static void main(String[] args) {

	Car c=new Car();
	c.Show();
	Bike b=new Bike();
	b.Show();
	}

}
