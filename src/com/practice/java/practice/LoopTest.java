package com.practice.java.practice;

public class LoopTest {

	public static void main(String[] args) {

		Thread threadFor =  new Thread(new Runnable() {
			@Override
			public void run() {
				long startTime = System.currentTimeMillis();

				for(int i= 0; i<1000000000; i++) {

				}

				long stopTime = System.currentTimeMillis();
				System.out.println("Time Taken to execute FOR loop: "+ (stopTime - startTime));				
			}
		});

		Thread threadWhile =  new Thread(new Runnable() {
			@Override
			public void run() {
				long startT = System.currentTimeMillis();

				int j = 0;
				do{
					j++;
				}while(j<1000000000);

				long stopT = System.currentTimeMillis();
				System.out.println("Time Taken to execute WHILE loop: "+ (stopT - startT));
			}
		});

		threadFor.start();
		threadWhile.start();		
	}
}
