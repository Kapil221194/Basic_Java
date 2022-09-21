package com.day19;

class Car{
	
	public static String car_name="Duster";
	public static void Show() {
		System.out.println(car_name);
	}
}
class Menufechurer extends Car
{
	String menufechurer_name="Renault";
/*	@Override
	public void Show() {
		System.out.println(car_name+" "+menufechurer_name);
	}*/
	public void Show(String menufechurer_name) {
		System.out.println(car_name+" "+this.menufechurer_name);
	}
	
}





public class OverloadStaticTypeMethod {

	public static void main(String[] args) {

		//Car c=new Car();
		//c.Show();
		Menufechurer m=new Menufechurer();
		m.Show();
	}

}
