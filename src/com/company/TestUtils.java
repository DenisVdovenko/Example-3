package com.company;

import java.util.Collection;
import java.util.List;

public class TestUtils {

    public static int ITERATION_COUNT = 100_000;

    public static long testAddToCollection(Collection<Integer> collection) {
        long startTime = System.currentTimeMillis();

        for (int i = 0; i < ITERATION_COUNT; i++) {
            collection.add(i);
        }

        long endTime = System.currentTimeMillis();
        return endTime - startTime;
    }

    public static long testAddToTheBeginning(List<Integer> collection) {
        long startTime = System.currentTimeMillis();

        for (int i = 0; i < ITERATION_COUNT; i++) {
            collection.add(0, i);
        }

        long endTime = System.currentTimeMillis();
        return endTime - startTime;
    }

    public static long testAddToTheEnd(List<Integer> collection) {
        long startTime = System.currentTimeMillis();

        for (int i = 0; i < ITERATION_COUNT; i++) {
            collection.add(collection.size(), i);
        }

        long endTime = System.currentTimeMillis();
        return endTime - startTime;
    }

    public static long testContains(Collection<Integer> collection) {
        long startTime = System.currentTimeMillis();

        for (Integer i: collection) {
            collection.contains(i);;
        }

        long endTime = System.currentTimeMillis();
        return endTime - startTime;
    }

}
