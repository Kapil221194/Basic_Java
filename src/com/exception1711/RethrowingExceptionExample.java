package com.exception1711;

public class RethrowingExceptionExample {

	int count = 0;

	public void m1() {
		count++;
		try {
			try {
				count++;
				try {
					count++;
					throw new Exception();
				} catch (Exception e) {
					count++;
					throw e;
				}
			} catch (Exception e) {
				count++;
				throw e;
			}
		} catch (Exception e) {
			System.out.println("count = " + count);
		}
	}

	public static void main(String[] args) {

		RethrowingExceptionExample r = new RethrowingExceptionExample();
		r.m1();
	}

}
