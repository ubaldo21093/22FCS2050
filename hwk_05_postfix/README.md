# Instructions

Arithmetic expression can be written in postfix notation, where the operators (+, -, *, and /) appear after the operands (i.e, the numbers).  For example, consider the following expression in postfix notation and the steps you would take to evaluate it.  

```
4 3 + 5 2 - * 
7 5 2 - * 
7 3 * 
21 
```

Your goal in this assignment is to write a program that evaluates simple arithmetic expressions in postfix notation.  The idea is to use a stack as a temporary storage of operands while you evaluate the expression.  In other words, whenever your program reads an operand it should push the number into the stack; on the other hand, if your program reads an operator it should do two pops and extract two numbers from the stack, then perform the operation on the two numbers, finishing by pushing the result back into the stack.  The steps are illustrated below for the expression we used before in our example.  

```
4 3 + 5 2 - *   stack: (top) 4 (bottom) 
3 + 5 2 - *     stack: (top) 3 4 (bottom) 
+ 5 2 - *       stack: (top) 7 (bottom) 
5 2 - *         stack: (top) 5 7 (bottom) 
2 - *           stack: (top) 2 5 7 (bottom) 
- *             stack: (top) 3 7 (bottom) 
*               stack: (top) 21 (bottom) 
```

Note that at the end of the evaluation process the stack should hold a single value with the result of the expression.  

# Submission

Finish the TO-DOs in PostfixEvaluation and make sure you pass all tests before submitting your code through Canvas.  You only need to submit the PostfixEvaluation.java source code.  Use the Stack, LinkedList, and Node classes that are provided! Do not modify them! 



 