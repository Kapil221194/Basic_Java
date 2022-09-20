package com.day17;

class ShoppingMall{
	String mall_name;
	float opening_time;
	float closing_time;
	String location;
}
class ShopType extends ShoppingMall{
	String shop_type;
}
class Shop extends ShopType{
	String shop_name;
	float rating;
	String shop_location;
	public void getShopDetails() {
		mall_name="Season Mall";
		opening_time= 8.30F;
		closing_time=12.00f;
		location="Pune";
		shop_type="Home Appliences";
		shop_name="Croma";
		rating=4.8f;
		shop_location="Ground floor";
	}
	public void ShopDetails() {
		System.out.println("Mall name :"+mall_name+"\n"+"Opening hour :"+opening_time+"0 am"+"\n"+"Closing hour :"+closing_time+"0 am"
				+"\n"+"Location :"+location+"\n"+"Shop type :"+shop_type+"\n"+"Shop name :"+shop_name+"\n"+"Rating :"+rating+"/5"+"\n"
				+"Shop Location :"+shop_location);
	}
}

public class MultiLevelExample1 {

	public static void main(String[] args) {

		Shop s=new Shop();
		s.getShopDetails();
		s.ShopDetails();
	}

}
