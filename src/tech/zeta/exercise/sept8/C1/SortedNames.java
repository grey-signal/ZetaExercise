package tech.zeta.exercise.sept8.C1;

import tech.zeta.exercise.sept8.util.Util;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class SortedNames {

    public static List<String> generateNames() {
        List<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");
        names.add("Allen");
        names.add("Diana");
        names.add("Berg");
        names.add("Eve");
        return names;
    }

    public static void main(String[] args) {

        List<String> unsortedNames = generateNames();
        TreeSet<String> sortedNames = new TreeSet<>(unsortedNames);

        System.out.println("Unsorted Names: ");
        Util.display(unsortedNames);

        Util.LineBreak();

        System.out.println("Sorted Names: ");
        Util.display(sortedNames);

    }
}
