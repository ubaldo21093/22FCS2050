/*
 * CS 2050 - Computer Science II - Fall 2022
 * Instructor: Thyago Mota
 * Description: Activity 24 - HashtableDriver
 */

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class HashtableDriver {

    private static final String FILE_NAME = "students.csv";

    public static void main(String[] args) throws FileNotFoundException {
        Hashtable<Integer, Student> ht = new Hashtable<>();
        Scanner in = new Scanner(new FileInputStream(FILE_NAME));
        while (in.hasNextLine()) {
            String line = in.nextLine();
            String data[] = line.split(",");
            int id = Integer.parseInt(data[0]);
            String name = data[1];
            Student student = new Student(id, name);
            ht.put(id, student);
        }
        in.close();
        System.out.println(ht);
//        ht.put(1234, new Student(1234, "Elyse"));
//        ht.put(5568, new Student(5568, "Thyago"));
//        System.out.println(ht);


//        ht.put(5568, new Student(5568, "Mota"));
//        Student std = ht.get(5568);
//        System.out.println(std);
    }
}
