package com.day9;

public class PrintLeftSideRATAlphabet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (char i ='A' ; i <= 'D'; i++) {
			for (char j = 'A'; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}

}
