package tech.zeta.exercise.sept8.B1;

//       3. Implement a simple queue using a LinkedList.
//       The queue should have methods to enqueue (add an element to the end),
//       dequeue (remove an element from the beginning),
//       and peek (view the first element without removing it).

import tech.zeta.exercise.sept8.util.Util;

import java.util.LinkedList;
import java.util.Scanner;

public class EnqueDeque {
    public static void main(String[] args) {

        LinkedList<Integer> queue = new LinkedList<>();
        int element;
        String option;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the integer elements in the queue");
        System.out.println(" Enter 'q' to exit ");

        while(true){
            System.out.print("Enter 'a' to enqueue(add to last) or 'r' to dequeue(remove from beginning): ");
            option = input.nextLine();
            option.toLowerCase();
            if(option.equals("q")) break;

            if(option.equals("a")) {
                System.out.print("Enter the element: ");
                element = input.nextInt();
                queue.addLast(element);
            }
            else if (option.equals("r")) {
                queue.removeFirst();
                System.out.println("First element deleted");
            }
            input.nextLine();
        }

        Util.display(queue);
        input.close();
    }
}
