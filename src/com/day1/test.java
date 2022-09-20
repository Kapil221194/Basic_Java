package com.day1;

public class test {

	public static void main(String[] args) {

		int m=0;
		int n;
		for(n=1;n<=10;n++) {
			m=m+m+1;
			System.out.println(m);
		}
		System.out.println();
		int l=17;
		if(l%3==0 && l%5==0) {
			System.out.println(l+" "+ "Number is divisible by 3 and 5");
		}else {
			System.out.println(l+" "+ "Number is not divisible by 3 and 5");
		}
	}

}
