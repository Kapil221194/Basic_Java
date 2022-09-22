package com.day20;

abstract class Smart_Phone {
	abstract void Show();

	Smart_Phone() {
		System.out.println("Nokia Express Music");
	}

}

class Nokia extends Smart_Phone {
	Nokia() {
		super();
	}

	@Override
	void Show() {
		System.out.println("COnnecting People");
	}

}

public class AbstactAndSuperExample {

	public static void main(String[] args) {

		Nokia n = new Nokia();
		n.Show();

	}

}
