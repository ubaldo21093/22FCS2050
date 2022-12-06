/*
 * CS 2050 - Computer Science II - Fall 2022
 * Instructor: Thyago Mota
 * Description: Homework 10 - Student
 */

public class Student implements Comparable<Student> {

    private int    id;
    private String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() { return id; }

    public String getName() { return name; }

    @Override
    public String toString() {
        return "(" + id + ", '" + name + "')";
    }

    @Override
    public int compareTo(Student other) {
        return name.compareTo(other.name);
    }

    @Override
    public int hashCode() {
        int sum = id;
        for (int i = 0; i < name.length(); i++)
            sum += name.charAt(i);
        return sum;
    }
}