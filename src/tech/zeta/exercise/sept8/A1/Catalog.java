package tech.zeta.exercise.sept8.A1;

import tech.zeta.exercise.sept8.util.Util;

import java.util.Scanner;
import java.util.TreeSet;

public class Catalog {
    public static void main(String[] args) {
        String title;
        String author;
        double price;
        TreeSet<Book> catalog = new TreeSet<>();

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the details of the books: ");
        System.out.println("Enter 'q' to stop entering");

        while(true){
            System.out.print("Enter the title of the book: ");
            title = input.nextLine();
            if(title.equals("q") || title.equals("Q")) break;
            System.out.print("Enter the author of the book: ");
            author = input.nextLine();
            System.out.print("Enter the price of the book: ");
            price = input.nextDouble();
            boolean added = catalog.add(new Book(title, author, price));
            if(!added){
                System.out.println("The book already exists :( Please enter another title");
            }
            input.nextLine();
        }

        Util.display(catalog);
    }
}
