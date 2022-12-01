/*
 * CS2050 - Computer Science II - Fall 2022
 * Instructor: Thyago Mota
 * Description: Activity 22 - BSTDriver class
 */

import java.util.Iterator;

public class BSTDriver {

    // TODO: create a binary tree and add the data elements to reproduce the tree described in the lecture about trees; don't forget to print your tree at the end
    public static void main(String[] args) {
        BST<Integer> bst = new BST<>();
        bst.add(7);
        bst.add(22);
        bst.add(24);
        bst.add(8);
        bst.add(70);
        bst.add(32);
        bst.add(16);
        bst.add(1);
        bst.add(75);
        bst.add(21);

        bst.remove(22);

        System.out.println(bst);


        BST<Integer> bst = new BST<>();
        bst.add(7); bst.add(22); bst.add(24); bst.add(8); bst.add(70);
        bst.add(52); bst.add(16); bst.add(1); bst.add(75); bst.add(21);
//        System.out.println(bst);

        Iterator<Integer> it = bst.iterator();
        for (int i = 0; i < 10; i++)
            System.out.println(it.next());

//        bst.remove(7);
//
//
//        System.out.println(bst);


        // TODO: search for a number
//        System.out.println(bst.search(16));
//        System.out.println(bst.search(99));

    }
}
