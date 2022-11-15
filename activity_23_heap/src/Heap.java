/*
 * CS2050 - Computer Science II - Fall 2022
 * Instructor: Thyago Mota
 * Description: Activity 23 - Heap class
 */

public class Heap<E extends Comparable<E>> {

    private E data[];
    private int size;
    private static final int INITIAL_CAPACITY = 10;

    public Heap() {
        data = (E[]) new Comparable[INITIAL_CAPACITY];
        size = 0;
    }

    private boolean isFull() {
        return size == data.length;
    }

    private int parentOf(int index) {
        return (index - 1) / 2;
    }

    // TODO #1: implement the swim operation as described in the instructions
    // hints: the given index points to the recently added node; index 0 is the root node;
    // use a while loop until you reach the root node (bottom-up);
    // at each iteration, check if the current value is greater than the parent's value
    // (use parentOf helper method and compareTo); if that's the case, swap the current node's value
    //  with the parent node's value; then update index to move up in the tree;
    // the procedure can also be done recursively
    private void swim(int index) {

    }

    public void add(final E value) {
        if (isFull())
            return;
        data[size++] = value;
        swim(size-1);
    }

    @Override
    public String toString() {
        String s = "";
        for (int i = 0; i < size; i++)
            s += data[i] + " ";
        return s.trim();
    }

    public static void main(String[] args) {
        // TODO #2: instantiate a heap and add the following elements: 18, 13, 5, 10, 1, 2, 20; then display the heap using toString
    }
}