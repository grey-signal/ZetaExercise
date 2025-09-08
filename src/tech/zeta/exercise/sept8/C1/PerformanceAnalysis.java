package tech.zeta.exercise.sept8.C1;

/*
      4. Performance Test: Create two large sets (one HashSet and one TreeSet) with 1 million random integers.
      Measure the time it takes to add, remove, and check for the existence of elements in both sets.
      Analyze the performance differences.

 */

import tech.zeta.exercise.sept8.Util;

import java.util.*;

public class PerformanceAnalysis {

    static Random generator = new Random();
    static final int ENTRIES = 1000000;
    public static List<Integer> generateRandomIntegers(){

        List<Integer> randomLargeList = new ArrayList<>();

        for(int index = 0; index < ENTRIES; index++){
            randomLargeList.add(generator.nextInt());
        }
        return randomLargeList;
    }

    public static void main(String[] args) {

        List<Integer> randomList = generateRandomIntegers();

        Set<Integer> testHashSet = new HashSet<>();
        Set<Integer> testTreeSet = new TreeSet<>();

        long startTime = System.nanoTime();
        testHashSet.addAll(randomList);
        long endTime = System.nanoTime();

        System.out.println("Total time to add in Hashset: " + (endTime - startTime)/ENTRIES + "ms");

        startTime = System.nanoTime();
        testTreeSet.addAll(randomList);
        endTime = System.nanoTime();

        Util.LineBreak();

        System.out.println("Total time to add in Treeset: " + (endTime - startTime)/ENTRIES + "ms");

        Util.ParaBreak();

        System.out.println("Testing for look-up time in Hashset");
        startTime = System.nanoTime();
        for(int counter = 0; counter < 100; counter++){
            int element = generator.nextInt();
            testHashSet.contains(element);
        }
        endTime = System.nanoTime();
        System.out.println("Total time took for 100 random integers look-up: "+ (endTime - startTime));

        Util.LineBreak();

        System.out.println("Testing for look-up time in TreeSet...");
        startTime = System.nanoTime();
        for(int counter = 0; counter < 100; counter++){
            int element = generator.nextInt();
            testTreeSet.contains(element);
        }
        endTime = System.nanoTime();
        System.out.println("Total time took for 100 random integers look-up: "+ (endTime - startTime)/ENTRIES + "ms");

        Util.ParaBreak();

        System.out.println("Testing for removal time in Hashset...");
        startTime = System.nanoTime();
        for(int counter = 0; counter < 50; counter++){
            int element = generator.nextInt();
            testHashSet.remove(element);
        }
        endTime = System.nanoTime();
        System.out.println("Total time took for deletions in Hashset: "+ (endTime - startTime)/ENTRIES + "ms");

        Util.LineBreak();

        System.out.println("Testing for removal time in Treeset");
        startTime = System.nanoTime();
        for(int counter = 0; counter < 50; counter++){
            int element = generator.nextInt();
            testTreeSet.remove(element);
        }
        endTime = System.nanoTime();
        System.out.println("Total time took for deletion in TreeSet: "+ (endTime - startTime)/ENTRIES + "ms");

    }


}
