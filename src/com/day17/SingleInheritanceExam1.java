package com.day17;


class Account1{
	
	int ac_num = 12345;
	String ac_type = "Saving";
	int amount = 10000;
	void Show() {
		System.out.println(ac_num +" "+ac_type+" "+amount);
	}
}
class Deposit extends Account1{
	
	void Credited(int d) {
		System.out.println("Amount "+(amount + d));
	}
	
}

public class SingleInheritanceExam1 {

	public static void main(String[] args) {

		Deposit d=new Deposit();
		d.Show();
		d.Credited(1000);
	}

}
