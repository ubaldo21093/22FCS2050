/*
 * CS2050 - Computer Science II - Fall 2022
 * Instructor: Thyago Mota
 * Description: Activity 12 - Example 3
 */

public class Example3 {

    // TODO
    static int fibo(int n) {
        return 1;
    }

    public static void main(String[] args) {
        int n = 10;
        int a = 1;
        int b = 1;
        for (int i = 3; i <= n; i++) {
            int an = a + b;
            a = b;
            b = an;
        }
        System.out.println("a_" + n + " = " + b);
        // System.out.println("a_" + n + " = " + fibo(n));
    }
}
