package com.day9;

public class DIgitAndAlphabet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int i=1;i<=4;i++) {
			if(i%2==0) {
				char p='A';
				for(int j=1;j<=i;j++) {
					System.out.print(p);
					p++;
				}
			}else {
				for(int k=1;k<=i;k++) {
					System.out.print(k);
				}
			}
			System.out.println();
		}
	}

}
