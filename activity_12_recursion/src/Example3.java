/*
 * CS2050 - Computer Science II - Fall 2022
 * Instructor: Thyago Mota
 * Description: Activity 12 - Example 3
 */

public class Example3 {

    // TODO
    static int fibo(int n) {
        if (n == 1 || n == 2)
            return 1;
        else
            return fibo(n-1) + fibo(n-2);
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
