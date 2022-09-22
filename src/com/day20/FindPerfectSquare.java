package com.day20;

class PerfectSquare {
	public void Find() {
		for (int i = 1; i <= 30; i++) {
			for (int j = 1; j <= 30; j++) {
				int sq = j * j;
				if (sq == i) {
					System.out.println(i);
				}
			}
		}
	}
}

public class FindPerfectSquare {

	public static void main(String[] args) {
		PerfectSquare p = new PerfectSquare();
		p.Find();
	}

}
