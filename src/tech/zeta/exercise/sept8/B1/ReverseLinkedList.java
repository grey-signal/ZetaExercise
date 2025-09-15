package tech.zeta.exercise.sept8.B1;

import tech.zeta.exercise.sept8.util.Util;

import java.util.LinkedList;

public class ReverseLinkedList {

    public static void reverseList(LinkedList<Integer> list){
        for(int initialIndex = 0, lastIndex = list.size() -1; initialIndex < lastIndex; initialIndex++, lastIndex--){
            int temp = list.get(initialIndex);
            list.set(initialIndex, list.get(lastIndex));
            list.set(lastIndex, temp);
        }
    }

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();

        for(int counter = 0; counter < 10; counter++){
            list.add(counter);
        }

        System.out.println("The list is: ");
        Util.display(list);

        reverseList(list);
        System.out.println("The list after reversal is: ");
        Util.display(list);

    }
}
