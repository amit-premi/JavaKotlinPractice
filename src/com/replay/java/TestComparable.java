package com.replay.java;

import org.jetbrains.annotations.NotNull;

/**
 * Created by Amit PREMI on 30-Oct-18.
 */
public class TestComparable implements Comparable<TestComparable> {

    int yearPublish;
    int amount;

    @Override
    public int compareTo(@NotNull TestComparable o) {
        return this.yearPublish - o.yearPublish;
    }
}
