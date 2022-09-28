/*
 * CS2050 - Computer Science II - Fall 2022
 * Instructor: Thyago Mota
 * Description: Homework 05 - PostfixEvaluationTest
 */

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class PostfixEvaluationTest {

    @Test
    public void testSimpleAddExpr() throws Exception {
        String expr = "5 2 +";
        assertEquals(7, PostfixEvaluation.postfixEval(expr));
    }

    @Test
    public void testSimpleSubExpr() throws Exception {
        String expr = "5 2 -";
        assertEquals(3, PostfixEvaluation.postfixEval(expr));
    }

    @Test
    public void testSimpleMulExpr() throws Exception {
        String expr = "5 2 *";
        assertEquals(10, PostfixEvaluation.postfixEval(expr));
    }

    @Test
    public void testSimpleDivExpr() throws Exception {
        String expr = "5 2 /";
        assertEquals(2, PostfixEvaluation.postfixEval(expr));
    }

    @Test
    public void testComplexExprA() throws Exception {
        String expr = "4 3 + 5 2 - *";
        assertEquals(21, PostfixEvaluation.postfixEval(expr));
    }

    @Test
    public void testComplexExprB() throws Exception {
        String expr = "13 3 - 5 / 8 * 3 -";
        assertEquals(13, PostfixEvaluation.postfixEval(expr));
    }

    @Test
    public void testComplexExprC() throws Exception {
        String expr = "4 2 + 3 5 1 - * +";
        assertEquals(18, PostfixEvaluation.postfixEval(expr));
    }
}
