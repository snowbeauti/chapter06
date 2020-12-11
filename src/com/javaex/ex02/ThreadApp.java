package com.javaex.ex02;

public class ThreadApp {

	public static void main(String[] args) throws Exception {
		
		//준비
		Thread thread1 = new DigitThread();
		Thread thread2 = new UpperThread();
		Thread thread3 = new LowerThread();
		
		//스레드 실행 
		thread1.start();
		thread2.start();
		thread3.start();
		
		

		for (char ch = 'a'; ch <= 'z'; ch++) {
			Thread.sleep(1000);
		}

	}
}
