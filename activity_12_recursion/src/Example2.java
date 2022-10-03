/*
 * CS2050 - Computer Science II - Fall 2022
 * Instructor: Thyago Mota
 * Description: Activity 12 - Example 2
 */
public class Example2 {

    // TODO
    static void seq(int an, int r, int n, int i) {

    }

    public static void main(String[] args) {
        int an = 2;
        int r = 2;
        int n = 10;
        for (int i = 1; i <= n; i++) {
            System.out.print(an + " ");
            an *= r;
        }
        System.out.println();
        // seq(2, r, n, 1);
    }
}
