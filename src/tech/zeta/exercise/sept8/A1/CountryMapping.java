package tech.zeta.exercise.sept8.A1;

import tech.zeta.exercise.sept8.Util;

import java.util.HashMap;
import java.util.Scanner;

/*
      3. Create a program that stores a mapping of country codes to country names using a HashMap.
      Add at least 5 country codes and their corresponding country names to the map.
      Then, print the map.

 */
public class CountryMapping {

    public static void main(String[] args) {

        String countryCode;
        String countryName;
        HashMap<String, String> countryCodes = new HashMap<>();

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the country code, and then the name: ");
        System.out.println("Enter '0' to stop entering");
        while(true){

            System.out.print("Enter the country code: ");
            countryCode = input.nextLine();
            if(countryCode.equals("0")) break;
            System.out.print("Enter the country name: ");
            countryName = input.nextLine();
            countryCodes.put(countryCode, countryName);
        }

        Util.display(countryCodes.entrySet());

        input.close();
    }
}
