package com.javaex.ex02;

public class UpperThread extends Thread {

	public void run() {

		for (char A = 'A'; A <= 'Z' ; A++) {
			System.out.print(A);
		}
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
