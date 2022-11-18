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
        //return postOrder(root);
        String out = "";
        Queue<BSTNode<E>> qu = new Queue<>();
        if (root != null) {
            qu.push(root);
            while (!qu.isEmpty()) {
                try {
                    BSTNode<E> temp = qu.pop();
                    out += temp + " ";
                    if (temp.getLeft() != null)
                        qu.push(temp.getLeft());
                    if (temp.getRight() != null)
                        qu.push(temp.getRight());
                }
                catch (Exception e) { }
            } // end while
        }
        return out;
    }

    // TODO: implement searchRecursively
    private boolean searchRecursively(final BSTNode<E> current, final E value) {
        if (value.compareTo(current.getValue()) == 0)
            return true;
        else if (value.compareTo(current.getValue()) < 0) {
            if (current.getLeft() == null)
                return false;
            else
                return searchRecursively(current.getLeft(), value);
        } else {
            if (current.getRight() == null)
                return false;
            else
                return searchRecursively(current.getRight(), value);
        }
    }

    // TODO: boolean search
    public boolean search(final E value) {
        if (isEmpty())
            return false;
        else
            return searchRecursively(root, value);
    }

    public String inOrder(final BSTNode<E> current) {
        if (current == null)
            return "";
        return inOrder(current.getLeft()) + " " + current + " " + inOrder(current.getRight());
    }

    public String preOrder(final BSTNode<E> current) {
        if (current == null)
            return "";
        return current + " " + preOrder(current.getLeft()) + " " + preOrder(current.getRight());
    }

    public String postOrder(final BSTNode<E> current) {
        if (current == null)
            return "";
        return postOrder(current.getLeft()) + " " + postOrder(current.getRight()) + " " + current;
    }

    private int numberChildren(final BSTNode<E> current) {
        if (current == null){
            return 0;
        }
        if (current.getLeft() == null && current.getRight() == null){
            return 0;
        }
        if (current.getLeft() != null && current.getRight() != null){
            return 2;
        }
        return 1;
    }

    private BSTNode<E> getLeftMost(final BSTNode<E> current) {
        if (current.getLeft() == null){
            return current;
        }
        return getLeftMost(current.getLeft());
    }

    public BSTNode<E> removeRecursively(final BSTNode<E> current, final E value) {
        if (value.compareTo(current.getValue()) == 0){
            if (numberChildren(current) == 0){
                return null;
            }
            if (numberChildren(current) == 1){
                BSTNode<E> toBeReturned = null;
                if (current.getLeft() != null){
                    toBeReturned = current.getLeft();
                    current.setLeft(null);
                }else{
                    toBeReturned = current.getRight();
                    current.setRight(null);
                }
                return toBeReturned;
            }
            BSTNode<E> toBeReturned = null;
            BSTNode<E> leftMost = getLeftMost(toBeReturned);
            leftMost.setLeft(current.getLeft());
            current.setLeft(null);
            current.setRight(null);
            return toBeReturned;
        }
        else if (value.compareTo(current.getValue()) < 0){
            current.setLeft(removeRecursively(current.getLeft(),value));
        }else{
            current.setRight(removeRecursively(current.getRight(),value));
        }
        return current;
    }

    public void remove(final E value) {
        root = removeRecursively(root,value);
    }

}
