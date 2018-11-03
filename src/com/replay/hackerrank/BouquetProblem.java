package com.replay.hackerrank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Amit PREMI on 23-Sep-18.
 */
public class BouquetProblem {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        // BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int p = Integer.parseInt(bufferedReader.readLine().trim());

        int q = Integer.parseInt(bufferedReader.readLine().trim());

        String s = bufferedReader.readLine();

        int result = Result.flowerBouquets(p, q, s);

        System.out.println(String.valueOf(result));
        //bufferedWriter.write(String.valueOf(result));
        //bufferedWriter.newLine();

        bufferedReader.close();
        // bufferedWriter.close();
    }

    static class Result {
        /*
         * Complete the 'flowerBouquets' function below.
         *
         * The function is expected to return an INTEGER.
         * The function accepts following parameters:
         *  1. INTEGER p
         *  2. INTEGER q
         *  3. STRING s
         */

        static int flowerBouquets(int p, int q, String s) {
            // Write your code here
            int flower[] = new int[s.length()];

            for (int i = 0; i < s.length(); i++) {
                flower[i] = Integer.valueOf(s.substring(i, i + 1));
            }

            int typeRose = 0;
            ArrayList<String> bouquetListP = new ArrayList<>();
            HashMap<String, String[]> bouquetMapP = new HashMap<>();
            //All possible ROSE Bouquet
            for (int j = 0; j < (flower.length - 2); j++) {
                if (flower[j] == flower[j + 1] && flower[j + 1] == flower[j + 2] && flower[j] == typeRose) {
                    bouquetListP.add(String.valueOf(j));
                    bouquetListP.add(String.valueOf(j + 1));
                    bouquetListP.add(String.valueOf(j + 2));

                    bouquetMapP.put(String.valueOf(j), new String[]{String.valueOf(j), String.valueOf(j + 1), String.valueOf(j + 2)});
                }
            }

            ArrayList<String> bouquetListQ = new ArrayList<>();
            HashMap<String, String> bouquetMapQ = new HashMap<>();
            //All possible COSMOS Bouquet
            for (int j = 0; j < (flower.length - 1); j++) {
                if (flower[j] != flower[j + 1]) {
                    bouquetListQ.add(String.valueOf(j));
                    bouquetListQ.add(String.valueOf(j + 1));

                    bouquetMapQ.put(String.valueOf(j), String.valueOf(j + 1));
                }
            }

            System.out.println("Bouquet ListPPP: " + bouquetListP.size() + " :: " + bouquetListP.toString());
            System.out.println("Bouquet ListQQQ: " + bouquetListQ.size() + " :: " + bouquetListQ.toString());

            //If price of P > Q then P combination takes priority & vice-versa
            //Finding the best Bouquet combination to get the MAXIMUM return
            int maxBouquetCost = 0;
            if (p > q) {
                maxBouquetCost = (int) Math.floor((bouquetListP.size() / 3)) * p;

                System.out.println("Bouquet ListPPP MAX PRICE: " + (int) Math.floor((bouquetListP.size() / 3)) + " :: " + maxBouquetCost);
                for (String item : bouquetListP) {
                    if (bouquetMapQ.containsKey(item) || bouquetMapQ.containsValue(item)) {
                        bouquetMapQ.remove(item);
                    }
                }
                System.out.println("Bouquet ListQQQ MAX PRICE: " + (int) Math.floor((bouquetMapQ.size() / 2)) + " :: " + (int) Math.floor((bouquetMapQ.size() / 2)) * q);
                maxBouquetCost = maxBouquetCost + (int) Math.floor((bouquetMapQ.size() / 2)) * q;
            } else {
                for (int i = 0; i < bouquetListQ.size(); i++) {
                    if (i > 0 && i < (bouquetListQ.size() - 1) && bouquetListQ.get(i).equals(bouquetListQ.get(i + 1))) {
                        if (bouquetListP.contains(bouquetListQ.get(i - 1))) {
                            bouquetListQ.remove(i - 1);
                            bouquetListQ.remove(i);
                        } else if (i + 2 < bouquetListQ.size() && bouquetListP.contains(bouquetListQ.get(i + 2))) {
                            bouquetListQ.remove(i + 1);
                            bouquetListQ.remove(i + 2);
                        }
                    }
                }

                System.out.println("Bouquet ListQQQ AFTER: " + bouquetListQ.size() + " :: " + bouquetListQ.toString());

                maxBouquetCost = (int) Math.floor(bouquetListQ.size() / 2) * q;
                for (String sameQItem : bouquetListQ) {
                    String mapKey = null;
                    for (Map.Entry<String, String[]> entry : bouquetMapP.entrySet()) {
                        for (int j = 0; j < entry.getValue().length; j++) {
                            if (sameQItem.equalsIgnoreCase(entry.getValue()[j])) {
                                mapKey = entry.getKey();
                            }
                        }
                    }

                    if (mapKey != null) {
                        bouquetMapP.remove(mapKey);
                    }
                }

                System.out.println("Bouquet ListPPP AFTER: " + bouquetMapP.size() + " :: " + bouquetMapP.toString());
                maxBouquetCost = maxBouquetCost + bouquetMapP.size() * p;
            }

            System.out.println("BouquetMAX Cost: " + maxBouquetCost);
            return maxBouquetCost;
        }
    }
}
