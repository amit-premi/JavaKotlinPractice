package com.practice.java.threads;

import java.util.Scanner;

public class VolatileVar {

    public static void main(String[] args) {

        MyRunner myRunner = new MyRunner();
        Thread thread = new Thread(myRunner);

        System.out.println("Thread Start Call");
        thread.start();

        System.out.println("Please return to stop running thread");
        Scanner sc = new Scanner(System.in);
        sc.nextLine();

        myRunner.stopRunner();
        sc.close();
    }


    static class MyRunner implements Runnable {

        private volatile boolean stopFlag = true;
        int counter;

        @Override
        public void run() {
            while (stopFlag) {
                System.out.println("Thread Running: " + counter + " : " + stopFlag);
                counter++;
            }
        }

        private void stopRunner() {
            stopFlag = false;
            System.out.println("Stop Runner: " + stopFlag);
        }
    }
}
