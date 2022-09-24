/*
 * CS2050 - Computer Science II - Fall 2022
 * Instructor: Thyago Mota
 * Description: Activity 09 - Stack
 */

public class Stack extends LinkedList<Integer> {

    public void push(int value) {
        add(value);
    }

    public int pop() throws Exception {
        if (isEmpty())
            throw new Exception("Stack is empty!");
        Node<Integer> toBeReturned = head;
        head = head.getNext();
        toBeReturned.setNext(null);
        return toBeReturned.getValue();
    }
}