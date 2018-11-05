package com.replay.java.common;

/**
 * Created by Amit PREMI on 04-Nov-18.
 */
public class SecondLargest {

    public static void main(String[] args){

        int intArray[] = {10, 30, 50, 25, 845, 1250, 750, 458};

        int largeInt = Integer.MIN_VALUE, secLargeInt = Integer.MIN_VALUE;
        for(int intValue : intArray){
            if(largeInt < intValue){
                secLargeInt = largeInt;
                largeInt = intValue;
            }else if(secLargeInt < intValue){
                secLargeInt = largeInt;
            }
        }

        System.out.print("Largest Number: "+largeInt);
        System.out.print("Second Largest Number: "+secLargeInt);
    }
}
