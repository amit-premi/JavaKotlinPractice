package com.practice.java.threads;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Vector;

public class ConsumerProducer {

	private static final int ITEM_BUFFER = 10;
	/*private Vector<Integer> itemList = new Vector<Integer>();

	public void producerChain() throws InterruptedException {
		while(true) {
			Random ranProd = new Random();

			if(itemList.size() < 1000) {
				int itemAdd = ranProd.nextInt(100);
				itemList.add(itemAdd);
				System.out.println("Item's Produced: "+itemList.size() +"  Item Added: "+itemAdd);	
			}
		}
	}

	public void consumerChain() throws InterruptedException {
		while(true) {
			if(itemList.size() >= ITEM_BUFFER && itemList.get(0) != null) {
				int itemRem = itemList.remove(0);

				System.out.println("Item's Consumed: "+itemList.size() +"  Item Removed: "+itemRem);	
			}
		}
	}*/

	//Producer-Consumer problem using an ArrayList(i.e. not an synchronized object)
	final private List<Integer> itemList = new ArrayList<>();
	private void producerChain() throws InterruptedException {
		synchronized (itemList) {
			while(true) {
				Random ranPro = new Random();

				if(itemList.size() > ITEM_BUFFER) {
					itemList.wait();
					itemList.notify();



				}else{
					int itemAdd = ranPro.nextInt(1000);
					itemList.add(itemAdd);
					System.out.println("Item's Produced: "+itemList.size() +"  Item Added: "+itemAdd);			
				}	
			}
		}
	}

	private void consumerChain() throws InterruptedException {
		synchronized (itemList) {
			while(true) {
				if(itemList.size() >= ITEM_BUFFER && itemList.get(0) != null) {

					int valRem = itemList.remove(0);
					System.out.println("Item's Consumed: "+itemList.size() +"  Item Removed: "+valRem);

					itemList.notify();
					itemList.wait();
				}
			}
		}
	}
	public static void main(String args[]){
		ConsumerProducer consumerProducer = new ConsumerProducer();

		Thread threadProd = new Thread(new Runnable() {
			@Override
			public void run() {

				try {
					consumerProducer.producerChain();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});

		Thread threadCons = new Thread(new Runnable() {
			@Override
			public void run() {
				try {
					consumerProducer.consumerChain();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});

		System.out.println("Producer-Consumer process started...");
		threadProd.start();
		threadCons.start();
	}
}
