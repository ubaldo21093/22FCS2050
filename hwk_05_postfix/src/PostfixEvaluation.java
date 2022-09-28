/*
 * CS2050 - Computer Science II - Fall 2022
 * Instructor: Thyago Mota
 * Description: Homework 05 - PostfixEvaluation
 */

import java.util.Iterator;

class Node<E> {

    private E       value;
    private Node<E> next;

    public Node(E value) {
        this.value = value;
        next = null;
    }

    public E getValue() {
        return value;
    }

    public void setValue(E value) {
        this.value = value;
    }

    public Node<E> getNext() {
        return next;
    }

    public void setNext(Node<E> next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return value + "";
    }
}

class LinkedList<E> implements Iterable<E> {

    protected Node<E> head;

    public LinkedList() {
        head = null;
    }

    // TODOd: return true/false depending whether the list is empty or not
    public boolean isEmpty() {
        return head == null;
    }

    // TODOd: add a new element (with the value) in front of the list!
    public void add(E value) {
        Node<E> newNode = new Node<>(value);
        newNode.setNext(head);
        head = newNode;
    }

    // TODOd: add a new element (with the value) at the end of the list!
    public void append(E value) {
        Node<E> newNode = new Node<>(value);
        if (isEmpty())
            head = newNode;
        else {
            Node<E> current = head;
            while (current.getNext() != null)
                current = current.getNext();
            // at this point, what can we tell about current?
            // for sure, current points to the tail node!!!
            current.setNext(newNode);
        }
    }

    // TODOd: returns the # of elements
    public int size() {
        Node<E> current = head;
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
        Node<E> current = head;
        String s = "";
        while (current != null) {
            s += current + " ";
            current = current.getNext();
        }
        return s.trim();
    }

    // TODOd: return the element at index location
    public E get(int index) {
        // check if index is valid 1st
        if (index < 0 || index >= size())
            throw new ArrayIndexOutOfBoundsException();
        Node<E> current = head;
        for (int i = 0; i < index; i++)
            current = current.getNext();
        return current.getValue();
    }

    // TODOd: sets value to location at index
    public void set(int index, E value) {
        // check if index is valid 1st
        if (index < 0 || index >= size())
            throw new ArrayIndexOutOfBoundsException();
        Node<E> current = head;
        for (int i = 0; i < index; i++)
            current = current.getNext();
        current.setValue(value);
    }

    // TODOd: inserts value at the given index location
    // throw an exception if index is invalid
    public void insert(int index, E value) {
        // check if index is valid 1st
        if (index < 0 || index >= size())
            throw new ArrayIndexOutOfBoundsException();
        // special case: index is zero
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

    // TODOd: removes the element at the given index location
    // throw an exception if index is invalid
    public void remove(int index) {
        // check if index is valid 1st
        if (index < 0 || index >= size())
            throw new ArrayIndexOutOfBoundsException();
        // special case: index is zero
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

class Stack<E> extends LinkedList<E> {

    public void push(E value) {
        add(value);
    }

    public E pop() throws Exception {
        if (isEmpty())
            throw new Exception("Stack is empty!");
        Node<E> toBeReturned = head;
        head = head.getNext();
        toBeReturned.setNext(null);
        return toBeReturned.getValue();
    }

}

class PostfixEvaluation {

    static final int INVALID_OP = 0;
    static final int ADD_OP     = 1;
    static final int SUB_OP     = 2;
    static final int MUL_OP     = 3;
    static final int DIV_OP     = 4;

    // returns true/false depending whether the given symbol is an operand
    public static boolean isOperand(String symbol) {
        try {
            Integer.parseInt(symbol);
            return true;
        }
        catch (NumberFormatException ex) {
            return false;
        }
    }

    // returns the operand associated with the given symbol; 0 if symbol is not a valid operand
    public static int getOperand(String symbol) {
        if (isOperand(symbol))
            return Integer.parseInt(symbol);
        return 0;
    }

    // returns true/false depending whether the given symbol is an operator
    public static boolean isOperator(String symbol) {
        if (symbol.length() > 1)
            return false;
        char c = symbol.charAt(0);
        return c == '+' || c == '-' || c == '*' || c == '/';
    }

    // returns the operator code associated with the given symbol; INVALID_OP if symbol is not a valid operator
    public static int getOperator(String symbol) {
        if (!isOperator(symbol))
            return INVALID_OP;
        char c = symbol.charAt(0);
        if (c == '+')
            return ADD_OP;
        else if (c == '-')
            return SUB_OP;
        else if (c == '*')
            return MUL_OP;
        else
            return DIV_OP;
    }

    // TODO: finish the method's implementation
    public static int postfixEval(String exp) throws Exception {
        Stack<Integer> stack = new Stack<>();
        String symbols[] = exp.split(" ");
        for (int i = 0; i < symbols.length; i++) {
            String symbol = symbols[i];
            if (isOperator(symbol)) {
                // TODO: finish this part of the code...

            }
            else if (isOperand(symbol)) {
                // TODO: finish this part of the code...
            }
            else {
                System.out.println("Invalid symbol \"" + symbol + "\" found!");
                System.exit(1);
            }
        }
        if (stack.size() != 1) {
            System.out.println("Couldn't evaluate expression!");
            System.exit(1);
        }
        return stack.pop();
    }

    public static void main(String[] args) throws Exception {
        String exp = "4 3 + 5 2 - *";
        System.out.println("Result: " + postfixEval(exp));
    }
}
