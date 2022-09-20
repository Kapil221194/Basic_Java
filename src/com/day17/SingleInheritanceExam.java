package com.day17;

class Account{
	
	int ac_num = 12345;
	String ac_type = "Saving";
	int amount = 10000;
	void Show() {
		System.out.println(ac_num +" "+ac_type+" "+amount);
	}
}
class Withdrawl extends Account{
	
	void Deduction(int d) {
		System.out.println("Amount "+(amount - d));
	}
	
}

public class SingleInheritanceExam {

	public static void main(String[] args) {

		Withdrawl w=new Withdrawl();
		w.Show();
		w.Deduction(500);
		
	}

}
