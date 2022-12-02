/*
 * CS 2050 - Computer Science II - Fall 2022
 * Instructor: Thyago Mota
 * Description: Activity 24 - Hashtable
 */

public class Hashtable<K,V> {

    private static int SIZE = 11;
    private HashNode<K, V> table[];

    public Hashtable() {
        table = new HashNode[SIZE];
    }

    private int hash(K key) {
        return key.hashCode() % SIZE;
    }

    public void put(K key, V value) {
        // TODOd #1: get the index (of the table) where the (key, value) should be stored
        int index = hash(key);

        // TODO #2: start a linear search using current=table[index] for a hashnode with the key;
        // case 1: hashnode is found -> replace the value
        // case 2: hashnode is NOT found -> create a new node with the association
        HashNode<K, V> current = table[index];
        boolean found = false;
        while (current != null) {
            if (current.getKey().equals(key)) {
                current.setValue(value);
                found = true;
                break;
            }
            current = current.getNext();
        }
        if (!found) {
            HashNode<K, V> newNode = new HashNode(key, value);
            newNode.setNext(table[index]);
            table[index] = newNode;
        }
    }

    public V get(K key) {
        int index = hash(key);
        HashNode<K, V> current = table[index];
        while (current != null) {
            if (current.getKey().equals(key))
                return current.getValue();
            current = current.getNext();
        }
        return null;
    }

    private String linkedListToString(HashNode<K, V> head) {
        HashNode<K, V> current = head;
        String s = "";
        while (current != null) {
            s += current + " ";
            current = current.getNext();
        }
        return s.trim();
    }

    @Override
    public String toString() {
        String out = "";
        for (int i = 0; i < SIZE; i++)
            out += "[" + i + "] -> " + linkedListToString(table[i]) + "\n";
        return out;
    }
}
