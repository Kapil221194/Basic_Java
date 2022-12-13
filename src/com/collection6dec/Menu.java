package com.collection6dec;
import java.util.*;

class MenuItem
{
	int id;
	String itemName;
	int price;
	
	public MenuItem(int id, String itemName, int price) {
		this.id = id;
		this.itemName = itemName;
		this.price = price;
	}
	@Override
	public String toString() {
		return "MenuItem [id=" + id + ", itemName=" + itemName + ", price=" + price + "]";
	}
}

public class Menu {
	
	int menuId;
	String typeOfMenu;
	MenuItem mi;
	
	public Menu(int menuId, String typeOfMenu, MenuItem mi) {
		super();
		this.menuId = menuId;
		this.typeOfMenu = typeOfMenu;
		this.mi = mi;
	}
	@Override
	public String toString() {
		return "menuId=" + menuId + " typeOfMenu=" + typeOfMenu + " mi=" + mi +"\n" ;
	}

	public static void main(String[] args) {

		ArrayList<Menu> al=new ArrayList();
		al.add(new Menu(1, "south indian",new MenuItem(11, "dosa", 20)));
		al.add(new Menu(1, "south indian",new MenuItem(12, "idali", 15)));
		al.add(new Menu(2, "Chanese",new MenuItem(21, "noodles", 40)));
		al.add(new Menu(2, "south indian",new MenuItem(11, "fried Rice", 50)));
		al.add(new Menu(3, "combo",new MenuItem(31, "veg thali", 100)));
		al.add(new Menu(3, "combo",new MenuItem(11, "non veg thali", 150)));
		
		
		System.out.println(al);
		
//		for(int i=1;i<=3;i++)
//		{
//			
//		}
		
	}

}
