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

    // TODOd: implement the isEmpty method
    public boolean isEmpty() {
        return root == null;
    }

    // TODO: implement the addRecursively private method
    private void addRecursively(BSTNode<E> current, final E value) {
        if (value.compareTo(current.getValue()) < 0) {
            if (current.getLeft() == null)
                current.setLeft(new BSTNode<>(value));
            else
                addRecursively(current.getLeft(), value);
        } else if (value.compareTo(current.getValue()) > 0) {
            if (current.getRight() == null)
                current.setRight(new BSTNode<>(value));
            else
                addRecursively(current.getRight(), value);
        }
    }

    // TODO: implement the add method
    public void add(final E value) {
        if (isEmpty())
            root = new BSTNode<>(value);
        else
            addRecursively(root, value);
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
