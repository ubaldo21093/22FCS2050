/*
 * CS 2050 - Computer Science II - Fall 2022
 * Instructor: Thyago Mota
 * Description: Homework 08 - Bubble Sort
 */

import java.util.Arrays;
import java.util.Random;

class Box implements Comparable<Box> {

    private int width, depth, height;
    static final int MIN_DIM = 1;

    public Box(int width, int depth, int height) {
        if (width < MIN_DIM)
            this.width = MIN_DIM;
        else
            this.width = width;
        if (depth < MIN_DIM)
            this.depth = MIN_DIM;
        else
            this.depth = depth;
        if (height < MIN_DIM)
            this.height = MIN_DIM;
        else
            this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public int getDepth() {
        return depth;
    }

    public int getHeight() {
        return height;
    }

    public int getVolume() {
        return width * depth * height;
    }

    @Override
    public String toString() {
        return "(" + width + "x" + depth + "x" +  height + "=" + getVolume() + ")";
    }

    // TODO #1: box objects should be compared by volume (in ascending order)
    @Override
    public int compareTo(Box other) {
        return 0;
    }
}

class BubbleSort<T extends Comparable<T>> {

    // TODO #2: implement the bubble sort algorithm to sort an array of any type of object
    public void sort(T data[]) {

    }

    public static void main(String[] args) {
        Box data[] = {
                new Box(1, 2, 3),
                new Box(6, 4, 2),
                new Box(1, 1, 2),
                new Box(2, 2, 2),
                new Box(3, 7, 1)
        };

        // TODO #3: instantiate a BubbleSort object of type Box and save the reference to bs
        BubbleSort<Box> bs = null;

        System.out.println(Arrays.toString(data));
        bs.sort(data);
        System.out.println(Arrays.toString(data));
    }
}