package com.replay.java;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Amit PREMI on 13-Oct-18.
 */
public class IteratorEnumerator {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        Iterator<String> itr = list.iterator();
        while (itr.hasNext()) {
            String valueStr = itr.next();
        }
    }
}
