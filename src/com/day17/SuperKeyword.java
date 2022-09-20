package com.day17;

class Movie{
	String movie_name="Avator";
	int year=2012;
	Movie(String movie_type, float rating){
		System.out.println("Movie Type :"+movie_type+"\n"+"Movie Rating :"+rating);
	}
	public void Sequel(String sequel_name) {
		System.out.println("Movie sequel name :"+sequel_name);
	}
}
class Catogary extends Movie{
	String movie_name="Mad Max";
	int year=2015;
	String movie_type="sci-fi";
	float rating=9.00f;
	
	void Show() {
		System.out.println("Movie name :"+movie_name+"\n"+"Movie release year :"+year);
		System.out.println("Movie Type :"+movie_type+"\n"+"Movie Rating :"+rating);
		System.out.println("Movie name (using super) :"+super.movie_name+"\n"+"Movie release year (using super) :"+super.year);
		System.out.println();
		super.Sequel("Avatar : The way of water");
	}
	Catogary(){
		super("Action", 8.8f);
		System.out.println();
	}
}

public class SuperKeyword {

	public static void main(String[] args) {

		Catogary c=new Catogary();
		c.Show();
	}

}
