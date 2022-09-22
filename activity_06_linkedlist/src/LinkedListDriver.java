/*
 * CS2050 - Computer Science II - Fall 2022
 * Instructor: Thyago Mota
 * Description: Activity 06 - LinkedListDriver
 */

import java.util.Iterator;

public class LinkedListDriver {

    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<>();
        ll.add("Jose");
        ll.add("Maria");
        ll.add("Bob");
//        Iterator<String> it = ll.iterator();
//        while (it.hasNext()) {
//            String el = it.next();
//            System.out.println(el);
//        }

        for (String el: ll)
            System.out.println(el);

    }
}
