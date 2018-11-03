package com.practice.java.common;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/*HackerLand National Bank has a simple policy for warning clients about possible fraudulent account activity. 
If the amount spent by a client on a particular day is greater than or equal to  the client's median spending for the last n days, 
they send the client a notification about potential fraud. The bank doesn't send the client any notifications until they 
have at least d prior days of transaction data.

Given the value of  and a client's total daily expenditures for a period of  days, find and print the number of times the 
client will receive a notification over all  days.
Constraints

Output Format:-
Print an integer denoting the total number of times the client receives a notification over a period of n days.*/

public class NotificationTest {

    public static void main(String[] args) {

        boolean validFlag = false;
        int tranDay = 0;
        int priorDay = 0;
        ArrayList<Integer> transList = new ArrayList<Integer>();

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter days of transaction & prior days");

        while (validFlag == false) {
            tranDay = sc.nextInt();
            if (tranDay < 1 || tranDay > 2 * Math.pow(10, 5)) {
                validFlag = false;
            } else {
                validFlag = true;
            }
        }

        validFlag = false;
        while (validFlag == false) {
            priorDay = sc.nextInt();
            if (priorDay < 1 || priorDay > tranDay) {
                validFlag = false;
            } else {
                validFlag = true;
            }
        }
        System.out.println("Days of Transaction & prior days: " + tranDay + " " + priorDay);

        int n = 0;
        int temp;
        while (n < tranDay) {
            temp = sc.nextInt();
            if (temp < 0 || temp > 200) {
            } else {
                transList.add(temp);
                n++;
            }
        }

        //System.out.println("Total transactions done: "+transList.toString());
        for (Integer val : transList) {
            System.out.print(val + " ");
        }
        System.out.println("");

        n = 0;
        int diff = priorDay;
        int countNotify = 0;
        List<Integer> tempList;
        if (priorDay == tranDay) {
            System.out.println("Total number of notifaction: " + 0);
        }
        while (priorDay != tranDay) {
            tempList = new ArrayList<Integer>(transList.subList(n, priorDay));
            Collections.sort(tempList);

            if (diff % 2 == 0) {
                if (2 * (tempList.get(diff / 2) + tempList.get((diff / 2) + 1)) <= transList.get(priorDay)) {
                    countNotify++;
                }
            } else {
                if (2 * tempList.get((int) Math.ceil(diff / 2)) <= transList.get(priorDay)) {
                    countNotify++;
                }
            }
            n++;
            priorDay++;
        }

        System.out.println("Total Number of Notifications: " + countNotify);

        sc.close();
    }
}
