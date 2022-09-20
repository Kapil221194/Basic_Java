package com.day16;

class Pen{
	private int price;
	private String color;
	private String brand_name;
	
	public void setPrice(int price) {
		this.price=price;
	}
	public void setColor(String color) {
		this.color=color;
	}
	public void setBrandName(String brand_name) {
		this.brand_name=brand_name;
	}
	public int getPrice() {
		return price;
	}
	public String getColor() {
		return color;
	}
	public String getBrandName() {
		return brand_name;
	}
}

public class Bag {
	
	private String brand_name;
	private int price;
	private Pen p;
	
	public void setBrandName(String brand_name) {
		this.brand_name=brand_name;
	}
	public void setPrice(int price) {
		this.price=price;
	}
	public void setPen(Pen p) {
		this.p=p;
	}
	public String getBrandName() {
		return brand_name;
	}
	public int getPrice() {
		return price;
	}
	public Pen getPen() {
		return p;
	}
	public static void main(String[] args) {

		Bag b=new Bag();
		b.setBrandName("WildCraft");
		b.setPrice(1500);
		//b.setPen(new Pen());
		b.getPen().setBrandName("Cello");
		b.getPen().setColor("Blue");
		b.getPen().setPrice(20);
		
		System.out.println(b.getBrandName());
		System.out.println(b.getPrice());
		System.out.println(b.getPen().getBrandName());
		System.out.println(b.getPen().getColor());
		System.out.println(b.getPen().getPrice());
	
	}

}
