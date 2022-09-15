/*
 * CS2050 - Computer Science II - Fall 2022
 * Instructor: Thyago Mota
 * Description: prg_01 - LinkedList
 */

public class LinkedList<E> {

    // NOTE: changed from private to protected
    protected Node<E> head;

    public LinkedList() {
        head = null;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void add(E value) {
        Node<E> newNode = new Node<>(value);
        newNode.setNext(head);
        head = newNode;
    }

    public void append(E value) {
        Node<E> newNode = new Node<>(value);
        if (isEmpty())
            head = newNode;
        else {
            Node<E> current = head;
            while (current.getNext() != null)
                current = current.getNext();
            current.setNext(newNode);
        }
    }

    public int size() {
        Node<E> current = head;
        int size = 0;
        while (current != null) {
            size++;
            current = current.getNext();
        }
        return size;
    }

    @Override
    public String toString() {
        Node<E> current = head;
        String s = "";
        while (current != null) {
            s += current + " ";
            current = current.getNext();
        }
        return s.trim();
    }

    public E get(int index) {
        if (index < 0)
            throw new ArrayIndexOutOfBoundsException();
        Node<E> current = head;
        int currentIndex = 0;
        while (current != null && currentIndex < index) {
            current = current.getNext();
            currentIndex++;
        }
        if (current == null)
            throw new ArrayIndexOutOfBoundsException();
        return current.getValue();
    }
}
