/*
 * CS2050 - Computer Science II - Fall 2022
 * Instructor: Thyago Mota
 * Description: Homework 10 - BSTNode class
 */

public class TreeMapNode<K extends Comparable<K>, V> {

    private K  key;
    private V  value;
    private TreeMapNode<K, V> left, right;

    public TreeMapNode(K key, V value) {
        this.key = key;
        this.value = value;
        left = right = null;
    }

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }

    public TreeMapNode<K, V> getLeft() {
        return left;
    }

    public void setLeft(TreeMapNode<K, V> left) {
        this.left = left;
    }

    public TreeMapNode<K, V> getRight() {
        return right;
    }

    public void setRight(TreeMapNode<K, V> right) {
        this.right = right;
    }

    @Override
    public String toString() {
        return "(" + key + ":" + value + ")";
    }
}