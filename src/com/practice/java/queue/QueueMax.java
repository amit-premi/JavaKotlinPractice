package com.practice.java.queue;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Random;
import java.util.Scanner;

public class QueueMax {

    private static volatile boolean runFlag = true;

    public static void main(String[] args) {

        Thread queueThread = new Thread((new QueueMax()).new QueueMaxRunner());
        queueThread.start();

        System.out.println("Press enter to Stop execution");
        Scanner sc = new Scanner(System.in);
        sc.nextLine();
        runFlag = false;

        sc.close();
    }

    private class QueueMaxRunner implements Runnable {
        Comparator<Integer> comparator = new NumbComparator();
        PriorityQueue<Integer> queuePipe = new PriorityQueue<Integer>(comparator);

        @Override
        public void run() {
            while (runFlag) {

                if (queuePipe.size() <= 101) {
                    Random rand = new Random();

                    int numbAdd = rand.nextInt(1000000);
                    queuePipe.offer(numbAdd);

                    System.out.println("Item Added: " + numbAdd);

                    if (queuePipe.size() > 100) {
                        int numbRemove = queuePipe.poll();
                        System.out.println("Item removed: " + numbRemove);
                    }
                }
            }

            System.out.println("\nQueue items: " + queuePipe.toString());
            System.out.println("Queue Size: " + queuePipe.size());

            System.out.print("Item left in queue were: ");
            while (queuePipe.size() != 0) {
                int numbRemove = queuePipe.poll();
                System.out.print(numbRemove + ", ");
            }
        }

        ;
    }

    //Queue Comparator for Ascending order sorting
    private class NumbComparator implements Comparator<Integer> {
        @Override
        public int compare(Integer numb1, Integer numb2) {

            if (numb1 < numb2) {
                return -1;
            } else if (numb1 > numb2) {
                return 1;
            } else {
                return 0;
            }
        }
    }
}
