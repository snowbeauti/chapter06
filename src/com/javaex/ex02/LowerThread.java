package com.javaex.ex02;

public class LowerThread extends Thread {
	

	public void run() {

		for (char a = 'a'; a <= 'z'; a++) {
			System.out.print(a);
		}
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	}

