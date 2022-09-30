/*
 * CS2050 - Computer Science II - Fall 2022
 * Instructor: Thyago Mota
 * Student Name:
 * Description: Homework 06 - PriorityQueue
 */

public class PriorityQueue<E extends HasPriority> extends LinkedList<E> {

    // TODO: finish the implementation of the method
    public void push(E value) {

        // create a new node with value

        // add the new node as the front node if queue is empty


        // if the queue is not empty


            // if that is not the case, add the new node in the correct location of the queue

                // if you haven't returned at this point, add the new node at the rear of the queue


    }

    public E pop() throws Exception {
        if (isEmpty())
            throw new Exception("Queue is empty!");
        Node<E> toBeReturned = head;
        head = head.getNext();
        toBeReturned.setNext(null);
        return toBeReturned.getValue();
    }

    public E peek() throws Exception {
        if (isEmpty())
            throw new Exception("Queue is empty!");
        return head.getValue();
    }
}