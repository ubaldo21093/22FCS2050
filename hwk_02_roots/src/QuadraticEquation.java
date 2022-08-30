/*
 * CS2050 - Computer Science II - Fall 2022
 * Instructor: Thyago Mota
 * Description: Homework 02 - QuadraticEquation
 */

public class QuadraticEquation {

    private double a;
    private double b;
    private double c;
    private static final double DEFAULT_COEFFICIENT = 1;
    public static final double PRECISION = 0.00001;

    // TODO #1: if given "a" coefficient is very close to zero, set it to DEFAULT_COEFFICIENT
    public QuadraticEquation(double a, double b, double c) {
        
    }

    // TODO #1: set "a" coefficient to DEFAULT_COEFFICIENT
    public QuadraticEquation(double b, double c) {
       
    }

    public double delta() {
        return b * b - 4 * a * c;
    }

    // TODO #2: returns true when delta is >= 0; false otherwise
    public boolean hasRoots() {
        return false;
    }

    // TODO #2: return true if delta is very close to zero
    public boolean sameRoots() {
        return false;
    }

    public double firstRoot() {
        return ( -1 * b + Math.sqrt(delta()) ) / (2 * a);
    }

    public double secondRoot() {
        return ( -1 * b - Math.sqrt(delta()) ) / (2 * a);
    }

    // TODO #3: implement toString according to the blueprint below:
    // CASE 1: both roots
    // ax^2 + bx + c
    // a = 2.00
    // b = -11.00
    // c = 5.00
    // Roots are: 5.00, 0.50
    // CASE 2: equal roots
    // ax^2 + bx + c
    // a = -4.00
    // b = 12.00
    // c = -9.00
    // Equal roots = 1.50
    // CASE 3: no roots
    // ax^2 + bx + c
    // a = 1.00
    // b = -3.00
    // c = 4.00
    // No roots!
    @Override
    public String toString() {
        return "";
    }
}
