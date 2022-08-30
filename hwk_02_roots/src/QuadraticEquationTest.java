/*
 * CS2050 - Computer Science II - Fall 2022
 * Instructor: Thyago Mota
 * Description: Homework 02 - QuadraticEquationTest
 */

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QuadraticEquationTest {

    @Test
    public void twoRootsTest() {
        QuadraticEquation eq = new QuadraticEquation(2, -11, 5);
        assertTrue(eq.hasRoots());
        assertFalse(eq.sameRoots());
        assertEquals(5, eq.firstRoot(), QuadraticEquation.PRECISION);
        assertEquals(0.5, eq.secondRoot(), QuadraticEquation.PRECISION);
    }

    @Test
    public void equalRootsTest() {
        QuadraticEquation eq = new QuadraticEquation(-4, 12, -9);
        assertTrue(eq.hasRoots());
        assertTrue(eq.sameRoots());
        assertEquals(1.5, eq.firstRoot(), QuadraticEquation.PRECISION);
    }

    @Test
    public void noRootsTest() {
        QuadraticEquation eq = new QuadraticEquation(1, -3, 4);
        assertFalse(eq.hasRoots());
    }

}