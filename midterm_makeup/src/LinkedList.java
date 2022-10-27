/*
 * CS2050 - Computer Science II - Fall 2022
 * Instructor: Thyago Mota
 * Student Name:
 * Description: Midterm Exam (make-up)
 */

import java.util.Iterator;

public class LinkedList<E> implements Iterable<E> {

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
        if (index < 0 || index >= size())
            throw new ArrayIndexOutOfBoundsException();
        Node<E> current = head;
        for (int i = 0; i < index; i++)
            current = current.getNext();
        return current.getValue();
    }

    public void set(int index, E value) {
        if (index < 0 || index >= size())
            throw new ArrayIndexOutOfBoundsException();
        Node<E> current = head;
        for (int i = 0; i < index; i++)
            current = current.getNext();
        current.setValue(value);
    }

    public void insert(int index, E value) {
        if (index < 0 || index >= size())
            throw new ArrayIndexOutOfBoundsException();
        if (index == 0)
            add(value);
        else {
            Node<E> current = head;
            for (int i = 0; i < index - 1; i++)
                current = current.getNext();
            Node<E> newNode = new Node<>(value);
            newNode.setNext(current.getNext());
            current.setNext(newNode);
        }
    }

    public void remove(int index) {
        if (index < 0 || index >= size())
            throw new ArrayIndexOutOfBoundsException();
        if (index == 0) {
            Node<E> toBeRemoved = head;
            head = head.getNext();
            toBeRemoved.setNext(null);
        }
        else {
            Node<E> current = head;
            for (int i = 0; i < index - 1; i++)
                current = current.getNext();
            Node<E> toBeRemoved = current.getNext();
            current.setNext(toBeRemoved.getNext());
            toBeRemoved.setNext(null);
        }
    }

    @Override
    public Iterator<E> iterator() {
        return new Iterator<E>() {

            private Node<E> current = head;

            @Override
            public boolean hasNext() {
                return current != null;
            }

            @Override
            public E next() {
                if (hasNext()) {
                    E value = current.getValue();
                    current = current.getNext();
                    return value;
                }
                return null;
            }
        };
    }
}