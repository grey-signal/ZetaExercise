package tech.zeta.exercise.sept8.A1;

//       1. Create a program that stores a list of student names using an ArrayList.
//       Add at least 5 student names to the list. Then, print the list of student names.

import tech.zeta.exercise.sept8.Util;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentNames {

    public static void displayAll(ArrayList<String> studentNames){
        System.out.println("The students are: ");
        for(String studentName : studentNames){
            System.out.print(studentName + " ");
        }
    }

    public static void main(String[] args) {

        String name;
        ArrayList<String> studentNames = new ArrayList<>();

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the names of the students: ");
        System.out.println("Enter 'q' to stop entering");

        while(true){
            name = input.nextLine();
            name.toLowerCase();
            if(name.equals("q")) break;
            studentNames.add(name);
        }

        Util.display(studentNames);
//        displayAll(studentNames);

        input.close();
    }


}
