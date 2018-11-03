package com.practice.java.common;

public class ThreadTest {

    public static void main(String[] args) {

        OddNumber oddNumber = new ThreadTest().new OddNumber();
        Thread tOdd = new Thread(oddNumber);
        tOdd.start();

        EvenNumber evenNumber = new ThreadTest().new EvenNumber();
        Thread tEven = new Thread(evenNumber);
        tEven.start();
    }

    private class OddNumber implements Runnable {
        int oddNumb = 1;

        @Override
        public void run() {
            try {
                while (oddNumb < 200) {
                    System.out.println(oddNumb);
                    oddNumb += 2;
                    Thread.sleep(50);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private class EvenNumber implements Runnable {
        int evenNumb = 2;

        @Override
        public void run() {
            try {
                while (evenNumb <= 200) {
                    System.out.println(evenNumb);
                    evenNumb += 2;
                    Thread.sleep(50);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
