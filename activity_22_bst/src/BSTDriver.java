/*
 * CS2050 - Computer Science II - Fall 2022
 * Instructor: Thyago Mota
 * Description: Activity 22 - BSTDriver class
 */

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



        // TODO: search for a name

    }
}
