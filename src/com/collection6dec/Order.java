package com.collection6dec;
import java.util.*;

public class Order {
	
	int orderId;
	String custName;
	String address;
	int price;
	
	Order(int orderId, String custName, String address, int price)
	{
		this.orderId=orderId;
		this.custName=custName;
		this.address=address;
		this.price=price;
	}
	
	public String toString()
	{
		return orderId+" "+custName+" "+address+" "+price;
	}

	public static void main(String[] args) {

		Scanner sc =new Scanner(System.in);
		ArrayList<Order> al=new ArrayList();
		for(int i=1;i<=3;i++)
		{
			System.out.println("Enter order id : ");
			int orderid=sc.nextInt();
			System.out.println("Enter customer name :");
			String custName=sc.next();
			System.out.println("Enter price : ");
			int price=sc.nextInt();
			System.out.println("Enter address :");
			String addr=sc.next();
			
			
			Order o=new Order(orderid,custName,addr,price);
			al.add(o);
			
			
		}
		System.out.println(al);
		
		Collections.sort(al,new ComparePrice());
		System.out.println(al);
		Collections.sort(al,new CompareAddress());
		System.out.println(al);
	}

}

class ComparePrice implements Comparator<Order>
{
	public int compare(Order o1, Order o2)
	{
		return o1.price-o2.price;
	}
}
class CompareAddress implements Comparator<Order>
{
	
	public int compare(Order o1, Order o2)
	{
		Order or1=(Order) o1;
		Order or2=(Order) o2;
		return or1.address.compareTo(or2.address);
	}
}