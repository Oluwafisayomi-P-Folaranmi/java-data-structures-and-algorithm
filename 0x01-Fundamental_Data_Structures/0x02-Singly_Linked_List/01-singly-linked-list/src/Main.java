import DSA.SinglyLinkedList;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println();
        System.out.println("--------------------------------------------------");

        SinglyLinkedList<Integer> s = new SinglyLinkedList<>();

        /** Adding an Element to the First Place **/
        System.out.println();
        s.addFirst(3);
        s.addFirst(5);
        s.addFirst(3);
        System.out.println(s);

    }
}
