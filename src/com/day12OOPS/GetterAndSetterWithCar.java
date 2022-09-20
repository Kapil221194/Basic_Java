package com.day12OOPS;

public class GetterAndSetterWithCar {
	
	private int model_no;
	private String name;
	private float price;
	private float speed;
	
	public void setModelNum(int m) {
		model_no=m;
	}
	public void setName(String n) {
		name=n;
	}
	public void setPrice(float price) {
		this.price=price;
	}
	public void setSpeed(float speed) {
		this.speed=speed;
	}
	public int getModelNum() {
		return model_no;
	}
	public String getName() {
		return name;
	}
	public float getPrice() {
		return price;
	}
	public float getSpeed() {
		return speed;
	}
	public static void main(String[]args) {
		
		GetterAndSetterWithCar gs= new GetterAndSetterWithCar();
		gs.setModelNum(221194);
		gs.setName("Lamborghini");
		gs.setPrice(1200000);
		gs.setSpeed(350);
		System.out.println("Cars model number :"+gs.getModelNum());
		System.out.println("Cars name :"+gs.getName());
		System.out.println("Cars price :"+gs.getPrice());
		System.out.println("Cars speed :"+gs.getSpeed());
	}
}
