package com.practice.java.threads;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @author Amit PREMI
 *
 */
public class Sync2Processor {

	private Random random = new Random();
	private List<Integer> list1 = new ArrayList<>();
	private List<Integer> list2 = new ArrayList<>();

	final private Object objLock1 = new Object();
	final private Object objLock2 = new Object();


	private void stage1() {
		synchronized (objLock1) {
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			int x = random.nextInt(1000);
			list1.add(x);
			System.out.println("Stage1: "+x);
		}
	}

	private void stage2() {
		synchronized (objLock2) {
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			int y = random.nextInt(1000);
			list2.add(y);
			System.out.println("Stage2: "+y);	
		}
	}

	private void process() {
		for(int i=0; i<1000; i++) {
			stage1();
			stage2();
		}
	}

	private void mainProcess() {	
		long startTime = System.currentTimeMillis();

		Thread t1 = new Thread(new Runnable() {
			@Override
			public void run() {
				process();

			}
		});

		Thread t2 = new Thread(new Runnable() {
			@Override
			public void run() {
				process();
			}
		});

		t1.start();
		t2.start();

		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		long endTime = System.currentTimeMillis();

		System.out.println("Time taken: "+ (endTime - startTime));
		System.out.println("List1 size: "+list1.size());
		System.out.println("List2 size: "+list2.size());
	}

	public static void main(String... args) {
		new Sync2Processor().mainProcess();
	}
}
