package com.replay.techgig.BasicDataType;

import java.util.Scanner;

/**
 * Created by Amit PREMI on 18-Sep-18.
 */
public class EvenOdd {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numb = sc.nextInt();

        /*if(numb % 2 == 0){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }*/

        if ((numb & 1) == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }
}
