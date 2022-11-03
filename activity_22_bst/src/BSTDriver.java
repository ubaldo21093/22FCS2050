/*
 * CS2050 - Computer Science II - Fall 2022
 * Instructor: Thyago Mota
 * Description: Activity 22 - BSTDriver class
 */

public class BSTDriver {

    // TODO: create a binary tree and add the data elements to reproduce the tree described in the lecture about trees; don't forget to print your tree at the end
    public static void main(String[] args) {
        BST<String> btree = new BST<>();
        btree.add("Janet");
        btree.add("Alex");
        btree.add("Brenna");
        btree.add("Anthony");
        btree.add("Carla");
        btree.add("Paul");
        btree.add("Kristi");
        btree.add("Xavier");
        System.out.println(btree);

        // TODO: search for a name
        if (btree.search("Carlas"))
            System.out.println("Found!");
        else
            System.out.println("Not found!");
    }
}
