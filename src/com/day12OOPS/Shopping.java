package com.day12OOPS;

public class Shopping {
	
	String purches_item;
	int quantity;
	double price_per_item;
	
	public void acceptShoppingDetails(String purches,int q,float price) {
		purches_item=purches;
		quantity=q;
		price_per_item=price;
	}
	
	public void billCalculator() {
			float bill=(float) (quantity*price_per_item);
			System.out.println("Toalt Bill is :"+bill);
	}
	
	public void displayShoppingDetail() {
		if(quantity>0) {
		System.out.println("Purches item :"+purches_item+"\n"+"Quantity :"+quantity+"\n"+"Price of item :"+price_per_item);
		billCalculator();
		}else {
			System.out.println("Error");
		}
	}
	
	
	public static void main(String[]Args) {
		
		Shopping s= new Shopping();
		s.acceptShoppingDetails("Soap", 2, 25.50f);
		//s.billCalculator();
		s.displayShoppingDetail();
		//System.out.println(s.purches_item);
	}

}
