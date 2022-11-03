/*
 * CS2050 - Computer Science II - Fall 2022
 * Instructor: Thyago Mota
 * Description: Activity 22 - BSTNode class
 */

// TODO: implement the BSTNode<E> class
public class BSTNode<E> {

    @Override
    public String toString() {
        String str = "";
        if (left == null)
            str += "-";
        str += value;
        if (right == null)
            str += "-";
        return str;
    }
}