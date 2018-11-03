package com.practice.java.threads;

/**
 * Created by Amit PREMI on 29-Oct-18.
 */
public class TestClass {

    public static void main(String[] args) {

        ThreadTest test = new ThreadTest();
        test.start();

        Thread thread = new Thread(new ThreadRunnable());
        thread.start();
    }
}
