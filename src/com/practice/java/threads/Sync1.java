package com.practice.java.threads;

public class Sync1 {

    private int count;

    public static void main(String args[]) {
        new Sync1().doWork();
    }

    private synchronized void countIncrement() {
        count++;
    }

    private void doWork() {
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10000; i++) {
                    countIncrement();
                }
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int j = 0; j < 10000; j++) {
                    countIncrement();
                }
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

        System.out.println("Count value: " + count);
    }

}
