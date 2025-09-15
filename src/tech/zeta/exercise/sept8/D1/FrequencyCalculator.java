package tech.zeta.exercise.sept8.D1;

import tech.zeta.exercise.sept8.util.Util;

import java.util.HashMap;
import java.util.Scanner;

/*
      1. Word Frequency Counter: Write a program that reads a text file and counts the frequency of each word using a HashMap.
       Ignore case and punctuation.

 */
public class FrequencyCalculator {

    public static void main(String[] args) {

        HashMap<String, Integer> frequency = new HashMap<>();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your text here: ");
        String text = input.nextLine();

        text = text.toLowerCase().replaceAll("[^a-z0-9\\s]", "");

        String[] words = text.split("\\s+");

        for(String word: words){
            if (frequency.get(word) != null)
            frequency.put(word, 1);
            else{
                int value = frequency.get(word);
                frequency.put(word, ++value);
            }

        }

        Util.display(frequency.entrySet());
        input.close();
    }



}
