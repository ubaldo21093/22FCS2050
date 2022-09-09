/*
 * CS2050 - Computer Science II - Fall 2022
 * Instructor: Thyago Mota
 * Description: Activity 05 - ArrayList
 */

public class ArrayList<E> {

    // internal array to hold the elements of our array list
    private E data[];

    // variable to control how many elements we have in our array list
    private int size;

    private static final int INITIAL_CAPACITY = 10;
    private static final int MIN_CAPACITY = 2;

    // enables the creation of an array list with INITIAL_CAPACITY and size zero
    public ArrayList() {
        size = 0;
        data = (E[]) new Object[INITIAL_CAPACITY];
    }

    // enables the creation of an array list with given capacity and size zero
    public ArrayList(int capacity) {
        size = 0;
        if (capacity < MIN_CAPACITY)
            data = (E[]) new Object[INITIAL_CAPACITY];
        else
            data = (E[]) new Object[capacity];
    }

    // TODOd: return true/false depending whether the list is empty or not
    public boolean isEmpty() {
        return size == 0;
    }

    // TODOd: return true/false depending whether the list is at capacity or not
    public boolean isFull() {
        return size == data.length;
    }

    // TODO: add a new element (with the value) in front of the list!
    // if list is full, increase the capacity of the array by INITIAL_CAPACITY before adding
    public void add(E value) {
        if (isFull()) {
            E newData[] = (E[]) new Object[data.length + INITIAL_CAPACITY];
            for (int i = 0; i < size; i++)
                newData[i+1] = data[i];
            data = newData;
        }
        else
            for (int i = size - 1; i >= 0; i--)
                data[i+1] = data[i];
        data[0] = value;
        size++;
    }

    // TODO: add a new element (with the value) at the end of the list!
    // if list is full, increase the capacity of the array by INITIAL_CAPACITY before appending
    public void append(E value) {
        if (isFull()) {
            E newData[] = (E[])new Object[data.length + INITIAL_CAPACITY];
            for (int i = 0; i < size; i++)
                newData[i] = data[i];
            data = newData;
        }
        data[size] = value;
        size++;
    }

    // TODOd: return a string representation of the object
    @Override
    public String toString() {
        String s = "";
        for (int i = 0; i < size; i++)
            s += data[i] + " ";
        return s.trim();
    }

    // TODO: returns the # of elements
    public int size() {
        return size;
    }

    // TODOd: return the element at index location
    public E get(int index) {
        // validate index first
        if (index >= 0 && index < size)
            return data[index];
        throw new ArrayIndexOutOfBoundsException();
    }

    // TODOd: sets value to location at index
    public void set(int index, E value) {
        if (index >= 0 && index < size)
            data[index] = value;
        else
            throw new ArrayIndexOutOfBoundsException();
    }

    // TODOd: inserts value at the given index location
    // throw an exception if index is invalid
    public void insert(int index, E value) {
        if (index >= 0 && index < size) {
            if (isFull()) {
                E newData[] = (E[]) new Object[data.length + INITIAL_CAPACITY];
                // copy (no shift)
                for (int i = 0; i < index; i++)
                    newData[i] = data[i];
                // copy and shift
                for (int i = size-1; i >= index; i--)
                    newData[i+1] = data[i];
                data = newData;
            }
            else
                // just shift on the current array
                for (int i = size-1; i >= index; i--)
                    data[i+1] = data[i];
            data[index] = value;
        }
        else
            throw new ArrayIndexOutOfBoundsException();
    }

    // TODO: removes the element at the given index location
    // throw an exception if index is invalid
    public void remove(int index) {
        if (index >= 0 && index < size) {
            for (int i = index; i < size-1; i++)
                data[i] = data[i+1];
            size--;
        }
        else
            throw new ArrayIndexOutOfBoundsException();
    }
}
