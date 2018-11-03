package com.replay.java;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Amit PREMI on 20-Jul-18.
 */
public class SimplyTest {

    private static int hourglassSum(int[][] input) {

        List<Integer> resultList = new ArrayList<>();

        for (int y = 0; y < 4; y++) {
            for (int x = 0; x < 4; x++) {

                int sumTemp = 0;
                for (int j = y; j < y + 3; j++) {
                    for (int i = x; i < x + 3; i++) {

                        if (j == y + 1) {
                            if (i == x + 1) {
                                System.out.println("Values j & i:   " + "(" + j + " , " + i + ")" + "  =  " + input[j][i]);
                                sumTemp = sumTemp + input[j][i];
                            }
                        } else {
                            System.out.println("Values j & i:   " + "(" + j + " , " + i + ")" + "  =  " + input[j][i]);
                            sumTemp = sumTemp + input[j][i];
                        }
                    }
                }
                resultList.add(sumTemp);
            }
        }

        int result = -1000;
        for (int temp : resultList) {
            if (result < temp) {
                result = temp;
            }
        }
        return result;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        // BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int[][] arr = new int[6][6];

        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }

        int result = hourglassSum(arr);

        System.out.println(String.valueOf(result));

        /*bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();
        bufferedWriter.close();*/

        scanner.close();
    }
}
