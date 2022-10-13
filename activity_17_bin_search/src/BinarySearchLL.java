/*
 * CS 2050 - Computer Science II - Summer 2022
 * Instructor: Thyago Mota
 * Description: Activity 17 - BinarySearch
 */

import java.util.Arrays;
import java.util.Random;

public class BinarySearchLL {

    public static void main(String[] args) {
        LinkedList<Integer> data = new LinkedList<>();
        data.append(10);
        data.append(21);
        data.append(23);
        data.append(47);
        data.append(53);
        data.append(80);
        data.append(90);
        data.append(95);
        data.append(100);
        System.out.println(data);
        if (data.bsearch(10))
            System.out.println("Found!");
        else
            System.out.println("Not found!");
    }
}
