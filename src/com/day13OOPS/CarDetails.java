package com.day13OOPS;
//this with instance variable,constructor chaining, avoiding shadowing.
public class CarDetails {
	
	int model_no;
	String car_name;
	float price;
	float gst;
	
	CarDetails(int model_no, String car_name, float price){
		this.model_no=model_no;
		this.car_name=car_name;
		this.price=price;
	}
	CarDetails(){
		this(2211, "Aventador", 125000);
		this.Display();
		gst=(float) (price*0.125);
		System.out.println("GST on price :"+gst);
	}
	public void Display() {
		System.out.println(model_no+" "+car_name+" "+price);
	}

	public static void main(String[] args) {
		CarDetails c=new CarDetails();
		
		
	}

}
