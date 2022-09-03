/*
 * CS2050 - Computer Science II - Fall 2022
 * Instructor: Thyago Mota
 * Description: Activity 01 - BSheep
 */

import java.util.Scanner;

public class BSheep {

    static final int MIN_NUM_SHEEP = 2;

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int nSheeps = in.nextInt();
        if (nSheeps < MIN_NUM_SHEEP)
            System.out.println("Invalid input! We need at least " + MIN_NUM_SHEEP + " sheep to build a fence!");
        else {
            int minX, maxX, minY, maxY;
            minX = maxX = in.nextInt();
            minY = maxY = in.nextInt();
            for (int i = 1; i < nSheeps; i++) {
                int x = in.nextInt();
                if (x < minX)
                    minX = x;
                else if (x > maxX)
                    maxX = x;
                int y = in.nextInt();
                if (y < minY)
                    minY = y;
                else if (y > maxY)
                    maxY = y;
            }
            System.out.print("Fence Coordinates: {");
            System.out.print("(" + minX + "," + minY + "), ");
            System.out.print("(" + maxX + "," + minY + "), ");
            System.out.print("(" + maxX + "," + maxY + "), ");
            System.out.print("(" + minX + "," + maxY + ")");
            System.out.println("}");
        }
        in.close();
    }
} // end of class definition
