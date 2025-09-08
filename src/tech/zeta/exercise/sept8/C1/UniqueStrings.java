package tech.zeta.exercise.sept8.C1;

/*
      1. Duplicate Removal: Given a list of strings,
      use a HashSet to remove all duplicate strings and print the unique strings.
*/

import tech.zeta.exercise.sept8.Util;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class UniqueStrings {

    public static List<String> generateStrings() {
        List<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Apple");
        list.add("Cherry");
        list.add("Banana");
        list.add("Date");
        return list;
    }

    public static void main(String[] args) {

        List<String> duplicateStrings = generateStrings();

        System.out.println("Original List: ");
        Util.display(duplicateStrings);

        Util.LineBreak();

        Set<String> uniqueStrings = new HashSet<>(duplicateStrings);
        System.out.println("Unique strings are: ");
        Util.display(uniqueStrings);
    }
}
