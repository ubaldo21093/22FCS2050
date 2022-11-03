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
        return root == null;
    }

    // TODO: implement the addRecursively private method
    private BSTNode<E> addRecursively(BSTNode<E> current, final E value) {

        // TODO: check if current is null, if that is the case, return a new BinNode with the value
        if (current == null)
            return new BSTNode<E>(value);

        // TODO: if current is not null...
        else {

            // TODO: if given data is smaller than current value, call addRecursively to the left,
            //  making sure to use the method's return to set current's left node
            if (value.compareTo(current.getValue()) < 0)
                current.setLeft(addRecursively(current.getLeft(), value));

            // TODO: if given data is greater than current value, call addRecursively to the right,
            //  making sure to use the method's return to set current's right node
            else if (value.compareTo(current.getValue()) > 0)
                current.setRight(addRecursively(current.getRight(), value));

            // TODO: don't forget to return current
            return current;
        }
    }

    // TODO: implement the add method
    public void add(final E value) {
        if (isEmpty())
            root = new BSTNode<E>(value);
        else
            addRecursively(root, value);
    }

    // TODO: override the toString method using a breadth first tree traversal using a queue of binary nodes
    @Override
    public String toString() {
        Queue<BSTNode<E>> queue = new Queue<>();
        BSTNode<E> current = root;
        queue.push(current);
        String str = "";
        while (!queue.isEmpty()) {
            try {
                current = queue.pop();
            } catch (Exception e) {
                continue;
            }
            str += current.getValue() + " ";
            if (current.getLeft() != null)
                queue.push(current.getLeft());
            if (current.getRight() != null)
                queue.push(current.getRight());
        }
        return str;
    }

    // TODO: implement searchRecursively
    private boolean searchRecursively(final BSTNode<E> current, final E value) {
        if (current == null)
            return false;
        else if (value.compareTo(current.getValue()) == 0)
            return true;
        else if (value.compareTo(current.getValue()) < 0)
            return searchRecursively(current.getLeft(), value);
        else
            return searchRecursively(current.getRight(), value);
    }

    // TODO: boolean search
    public boolean search(final E value) {
        return searchRecursively(root, value);
    }
}
