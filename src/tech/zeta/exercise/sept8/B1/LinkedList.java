package tech.zeta.exercise.sept8.B1;

 //     1. Create a LinkedList of strings representing a playlist of songs. Implement methods to add a song to the end of the playlist,
//     add a song to the beginning of the playlist, and remove a song from the playlist.


import tech.zeta.exercise.sept8.util.Util;

import java.util.Scanner;

public class LinkedList {

    public static void main(String[] args) {

        String song;
        String order;

        java.util.LinkedList<String> playlist = new java.util.LinkedList<>();

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the names of the songs ");
        System.out.println("Enter 'q' to stop entering");

        while(true){
            System.out.println("Enter the song name: ");
            song = input.nextLine();

            if(song.equals("q") || song.equals("Q")) break;
            System.out.print("Enter the 'first' or 'last', where you wanna add the song");

            order = input.nextLine();
            if(order.toLowerCase().equals("first")) playlist.addFirst(song);
            else if(order.toLowerCase().equals("last")) playlist.addLast(song);
            else System.out.println("Invalid choice, please try again :( ");
        }

        Util.display(playlist);

        while(true) {
            System.out.println("Enter 'r' to remove an element, and 'q' to exit");
            String option = input.nextLine();
            option.toLowerCase();
            if (option.equals("r")) {
                System.out.println("Enter the song name: ");
                String songName = input.nextLine();
                playlist.remove(songName);
            } else if (option.equals("q")) {
                break;
            }
        }

        Util.display(playlist);

        input.close();
    }

}
