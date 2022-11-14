package com.APractice;

import java.util.Scanner;

class HomeAppliences
{
	int app_id;
	String app_name;
	int app_price;
	
	HomeAppliences(int app_id, String app_name, int app_price)
	{
		this.app_id=app_id;
		this.app_name=app_name;
		this.app_price=app_price;
	}
	
	public String toString()
	{
		return app_id+" "+app_name+" "+app_price+" ";
	}
	
	public static void getArray(HomeAppliences ha[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Applience id for details: ");
		int id=sc.nextInt();
		for(int i=0;i<ha.length;i++) 
		{
			if(ha[i].app_id==id)
			{
				System.out.println(ha[i]);
			}
		}
	}
	public static void getUpdate(HomeAppliences ha[]) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Applience id for update: ");
		int id=sc.nextInt();
		System.out.println("Enter Applience name for update: ");
		String str=sc.next();
		for(int i=0;i<ha.length;i++) 
		{
			if(ha[i].app_id==id)
			{
				ha[i].app_name=str;
			}
			System.out.println(ha[i]);
		}
	}
	public static void getDelete(HomeAppliences ha[]) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Applience id for delete: ");
		int id=sc.nextInt();
		for(int i=0;i<ha.length;i++) 
		{
			if(ha[i].app_id==id)
			{
				ha[i]=null;
				
			}
			System.out.println(ha[i]);
		}
	}
	
}

public class CrudDemo {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		HomeAppliences ha[]= new HomeAppliences[3];
		
		for(int i=0;i<ha.length;i++) 
		{
		System.out.println("Enter Applience id: ");
		int hid=sc.nextInt();	
		System.out.println("Enter Applience Name: ");
		String appname=sc.next();
		
		System.out.println("Enter Applience Price: ");
		int hprice=sc.nextInt();
		
		ha[i]=new HomeAppliences(hid,appname,hprice);
		}
		for(int j=0;j<3;j++)
		{
			System.out.println(ha[j]);
		}	
		
		HomeAppliences.getArray(ha);
		HomeAppliences.getUpdate(ha);
		HomeAppliences.getDelete(ha);
	}
	
	
	
	
}
