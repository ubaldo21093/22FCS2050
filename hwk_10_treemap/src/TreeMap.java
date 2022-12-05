/*
 * CS2050 - Computer Science II - Fall 2022
 * Instructor: Thyago Mota
 * Description: Homework 10 - TreeMap class
 */

public class TreeMap<K extends Comparable<K>, V> {

    private TreeMapNode<K, V> root;

    public boolean isEmpty() {
        return root == null;
    }

    // TODO #1: finish the method's implementation
    private void putRecursively(TreeMapNode<K, V> current, K key, V value) {

    }

    public void put(K key, V value) {
        if (isEmpty())
            root = new TreeMapNode<>(key, value);
        else
            putRecursively(root, key, value);
    }

    // TODO #2: finish the method's implementation
    private V getRecursively(TreeMapNode<K, V> current, K key) {
       return null;
    }

    public V get(K key) {
        if (isEmpty())
            return null;
        else
            return getRecursively(root, key);
    }

    @Override
    public String toString() {
        String out = "";
        Queue<TreeMapNode<K, V>> qu = new Queue<>();
        if (root != null) {
            qu.push(root);
            while (!qu.isEmpty()) {
                try {
                    TreeMapNode<K, V> temp = qu.pop();
                    out += temp + " ";
                    if (temp.getLeft() != null)
                        qu.push(temp.getLeft());
                    if (temp.getRight() != null)
                        qu.push(temp.getRight());
                }
                catch (Exception e) { }
            } // end while
        }
        return out;
    }
}
