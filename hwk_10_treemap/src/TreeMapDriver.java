/*
 * CS 2050 - Computer Science II - Fall 2022
 * Instructor: Thyago Mota
 * Description: Homework 10 - TreeMapDriver
 */

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TreeMapDriver {

    private static final String FILE_NAME = "students.csv";

    public static void main(String[] args) throws FileNotFoundException {
        TreeMap<Integer, Student> tm = new TreeMap<>();
        Scanner in = new Scanner(new FileInputStream(FILE_NAME));
        while (in.hasNextLine()) {
            String line = in.nextLine();
            String data[] = line.split(",");
            int id = Integer.parseInt(data[0]);
            String name = data[1];
            Student student = new Student(id, name);
            tm.put(id, student);
        }
        in.close();
        System.out.println(tm);

        // TODO #3a: check if Elyse is on key 1234

        // TODO #3a: change the association by making 1234 be associated with Jennifer

        // TODO #3a: check if Jennifer is no on ke 1234
    }
}