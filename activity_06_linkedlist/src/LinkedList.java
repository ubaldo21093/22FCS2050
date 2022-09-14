/*
 * CS2050 - Computer Science II - Fall 2022
 * Instructor: Thyago Mota
 * Description: Activity 06 - LinkedList
 */

public class LinkedList {

    private Node head;

    public LinkedList() {
        head = null;
    }

    // TODOd: return true/false depending whether the list is empty or not
    public boolean isEmpty() {
        return head == null;
    }


    // TODOd: add a new element (with the value) in front of the list!
    public void add(int value) {
        Node newNode = new Node(value);
        newNode.setNext(head);
        head = newNode;
    }

    // TODOd: add a new element (with the value) at the end of the list!
    public void append(int value) {
        Node newNode = new Node(value);
        if (isEmpty())
            head = newNode;
        else {
            Node current = head;
            while (current.getNext() != null)
                current = current.getNext();
            // at this point, what can we tell about current?
            // for sure, current points to the tail node!!!
            current.setNext(newNode);
        }
    }

    // TODO: returns the # of elements
    public int size() {
        Node current = head;
        int size = 0;
        while (current != null) {
            size++;
            current = current.getNext();
        }
        return size;
    }

    // TODOd: return a string representation of the object
    @Override
    public String toString() {
        Node current = head;
        String s = "";
        while (current != null) {
            s += current + " ";
            current = current.getNext();
        }
        return s.trim();
    }
}
