package com.day12OOPS;

import java.util.Scanner;

public class Account {
	
	private int account_no;
	private double balance;
	public String account_type;
	public double amount;
	
	private void setAccountDetails(int account_no,double balance,String account_type) {
		this.account_no=account_no;
		this.account_type=account_type;
		this.balance=balance;
	}
	public int getAccountNum() {
		return account_no;
	}
	public double getBalance() {
		return balance;
	}
	public void displayAccountDetails() {
		System.out.println("Account Number :"+account_no);
		System.out.println("Account Type :"+account_type);
		System.out.println("Account Balance :"+balance);
	}
	public void dipositAmount() {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the diposit ammount :");
		float num=sc.nextFloat();
		amount=num;
		balance = balance +amount;
		System.out.println("Balance is : "+balance);
	}
	private void withdrawaltAmount() {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the withdrawal ammount :");
		float num1=sc.nextFloat();
		amount=num1;
		balance = balance -amount;
		System.out.println("Balance is : "+balance);
	}
	public static void main(String [] args) {
		
		Account a=new Account();
		
		a.setAccountDetails(954588302, 100000, "Saving Account");
		a.displayAccountDetails();
		System.out.println();
		a.dipositAmount();
		a.withdrawaltAmount();
		
	}
}
