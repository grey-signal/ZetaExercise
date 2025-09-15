package tech.zeta.exercise.sept8.D1;

/*
Sorted Contact List: Create a contact list application that stores names and phone numbers in a TreeMap.
 Allow the user to add, remove, and search for contacts. The list should always be sorted alphabetically by name.
 */

import java.util.Scanner;
import java.util.TreeMap;

public class SortedContactList {

    public static void main(String[] args) {

        String choice, name, contact;
        TreeMap<String, String > contactList =  new TreeMap<>();
        Scanner input = new Scanner(System.in);

        while(true){

            System.out.println("Enter 'a' to add a new contact, 'r' to remove and 's' to search a contact");
            System.out.println("Enter 'q' to quit");

            choice = input.nextLine();

            if(choice.equals("q") || choice.equals("Q")) break;

            if(choice.equals("a") || choice.equals("A")) {
                System.out.print("Enter the name to add: ");
                name = input.nextLine();
                System.out.print("Enter the contact number to add: ");
                contact = input.nextLine();
                contactList.put(name, contact);
                System.out.println("Name added successfully :)");
            }
            else if(choice.equals("r") || choice.equals("R")) {
                System.out.print("Enter the name to remove: ");
                name = input.nextLine();
                name = contactList.remove(name);
                if(name != null) System.out.println("Name removed successfully" );
                else System.out.println("No such contact exists");
            }
            else if(choice.equals("s") || choice.equals("S")) {
                System.out.print("Enter the name to search: ");
                name = input.nextLine();
                contact = contactList.get(name);
                if(contact != null) System.out.printf("%s number is: %s%n", name, contact);
                else System.out.println("No such contact exists");
            }
            else System.out.println("Invalid Option. Try Again :(");

        }
    }

}
