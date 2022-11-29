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

    // TODO #1 implement the sift up method
    private void siftUp(int index) {
        int parent = parentOf(index);

    }

    // TODO #2: implement the sift down method
    private void siftDown(int index) {
        int left = 2 * index + 1;
        int right = left + 1;
        // case 1: has left and right

        // case 2: only has left

        // case 3: only has right

        // case 4: no children -> do nothing!
    }

    public void add(final E value) {
        if (isFull())
            return;
        data[size++] = value;
        siftUp(size-1);
    }

    public E remove() throws Exception{
        if (size > 0) {
            E value = data[0];
            data[0] = data[size-1];
            size--;
            siftDown(0);
            return value;
        }
        else
            throw new Exception("Heap is empty!");
    }

    @Override
    public String toString() {
        String s = "";
        for (int i = 0; i < size; i++)
            s += data[i] + " ";
        return s.trim();
    }

    public static void main(String[] args) throws Exception {
        // TODO #3: instantiate a heap and add the following elements: 18, 13, 5, 10, 1, 2, 20; then display the heap using toString

    }
}