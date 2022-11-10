/*
 * CS 2050 - Computer Science II - Fall 2022
 * Instructor: Thyago Mota
 * Description: Activity 21 - Merge Sort
 */

import java.util.Arrays;
import java.util.Random;

public class MergeSort {

    // TODO: implement the merge portion of merge sort
    public static void merge(int data[], int begin, int middle, int end) {
        int newData[] = new int[end - begin + 1];
        
    }

    // TODO: implement the merge sort algorithm
    public static void mergeSort(int data[], int begin, int end) {
        for (int i = begin; i <= end; i++)
            System.out.print(data[i] + " ");
        System.out.println();
        if (begin < end) {
            // divide
            int middle = (begin + end) / 2;
            mergeSort(data, begin, middle);
            mergeSort(data, middle + 1, end);

            // conquer (merge)
            merge(data, begin, middle, end);
        }
    }

    public static void main(String[] args) {

        int data[] = {13, 12, 84, 79, 10, 77, 56, 1, 34, 27, 3};
        System.out.println(Arrays.toString(data));
        mergeSort(data, 0, data.length - 1);
        System.out.println(Arrays.toString(data));
    }
}