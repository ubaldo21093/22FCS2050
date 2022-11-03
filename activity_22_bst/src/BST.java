/*
 * CS2050 - Computer Science II - Fall 2022
 * Instructor: Thyago Mota
 * Description: Activity 22 - BST class
 */

public class BST<E extends Comparable<E>> {

    private BSTNode<E> root;

    public BST() {
        root = null;
    }

    // TODO: implement the isEmpty method
    public boolean isEmpty() {
        return false;
    }

    // TODO: implement the addRecursively private method
    private BSTNode<E> addRecursively(BSTNode<E> current, final E value) {

        // TODO: check if current is null, if that is the case, return a new BinNode with the value

        // TODO: if current is not null...

        return null;
    }

    // TODO: implement the add method
    public void add(final E value) {

    }

    // TODO: override the toString method using a breadth first tree traversal using a queue of binary nodes
    @Override
    public String toString() {
        return "";
    }

    // TODO: implement searchRecursively
    private boolean searchRecursively(final BSTNode<E> current, final E value) {
        return false;
    }

    // TODO: boolean search
    public boolean search(final E value) {
        return false;
    }
}
