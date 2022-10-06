package com.day16;

class Address {

	private String city;
	private int pincode;

	public void setCity(String city) {
		this.city = city;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	public String getCity() {
		return city;
	}

	public int getPincode() {
		return pincode;
	}
}

public class Person {

	private int id;
	private String name;
	private Address adr;

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAddress(Address adr) {
		this.adr = adr;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public Address getAddress() {
		return adr;
	}

	public static void main(String[] args) {

		Person p = new Person();
		p.setId(22);
		p.setName("Rahul");
		// p.getAddress().setCity("Pune");
		// p.getAddress().setPincode(4422);
		System.out.println(p.getId() + " " + p.getName());
		// System.out.println(p.getAddress().getCity()+" "+p.getAddress().getPincode());
	}

}
