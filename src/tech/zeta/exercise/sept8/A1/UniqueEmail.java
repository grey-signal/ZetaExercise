package tech.zeta.exercise.sept8.A1;

import tech.zeta.exercise.sept8.util.Util;

import java.util.HashSet;
import java.util.Scanner;

//       2. Create a program that stores a set of unique email addresses using a HashSet.
//       Add at least 5 email addresses to the set. Ensure that there are no duplicate email addresses in the set.
//       Then, print the set of email addresses.
public class UniqueEmail {

    public static void main(String[] args) {

        String email;
        HashSet<String> emails = new HashSet<>();

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the emails: ");
        System.out.println("Enter 'q' to stop entering");

        while(true){

            email = input.nextLine();

            if (email.equals("q") || email.equals("Q")) break;

            boolean added = emails.add(email);
            if(!added) {
                System.out.println("This email address is already present :(");
                System.out.println("Please try another email...");
            }
        }

        Util.display(emails);
        input.close();
    }
}
