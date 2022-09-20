package com.day16;

 class Engine{
	
	String eng_type;
	String fuel;
	Engine(String eng_type, String fuel){
		this.eng_type=eng_type;
		this.fuel=fuel;
	}
	public void Show() {
		System.out.println("Engine type :"+eng_type+"\n"+"Fuel type :"+fuel);
	}
}
public class Car {
	int model_no;
	String name;
	int price;
	Engine eng;
	Car(int model_no, String name, int price, Engine eng){
		this.model_no=model_no;
		this.name=name;
		this.price=price;
		this.eng=eng;
	}
	public void show() {
		System.out.println("Model Number :"+model_no+"\n"+"name :"+name+"\n"+"Price :"+price);
		eng.Show();
	}
	
	public static void main(String[] args) {
		Engine e=new Engine("V8","Petrol");
		Car c=new Car(2211, "Aventador", 125000, e);
		c.show();
	}

}
