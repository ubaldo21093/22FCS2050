/*
 * CS 2050 - Computer Science II - Fall 2022
 * Instructor: Thyago Mota
 * Description: Activity 04 - Fraction
 */

public class Fraction {

    // instance variables
    private int numerator;
    private int denominator;

    // class variable
    private static final int DEFAULT_VALUE = 1;

    // TODOd: implement the parameter-less constructor
    // sets both the numerator and denominator to one.
    Fraction() {
        numerator = DEFAULT_VALUE;
        denominator = DEFAULT_VALUE;
    }

    // TODOd: implement the parametrized constructor with one parameter
    Fraction(int numerator) {
        this.numerator = numerator;
        denominator = DEFAULT_VALUE;
    }

    // TODOd: implement the parametrized constructor with two parameters
    Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        if (denominator == 0)
            this.denominator = DEFAULT_VALUE;
        else
            this.denominator = denominator;
    }

    // TODOd: implement getNumerator
    int getNumerator() {
        return numerator;
    }

    // TODOd: implement getDenominator
    int getDenominator() {
        return denominator;
    }

    // TODOd: implement setNumerator
    void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    // TODOd: implement setDenominator (do not to allow having the denominator set to zero)
    void setDenominator(int denominator) {
        if (denominator != 0)
            this.denominator = denominator;
    }

    // TODOd: implement getValue
    // returns the value of the fraction (as a floating-point value); in other words, this method returns the results of dividing its numerator by its denominator;
    double getValue() {
        return (double) numerator / denominator;
    }

    // TODOd: correct the error in the code
    int gcd() {
        int a = Math.abs(this.numerator);
        int b = Math.abs(this.denominator);
        while (b != 0) {
            int temp = a;
            a = b;
            b = temp % b;
        }
        return a;
    }

    // nothing to do here (code is given to you, enjoy)
    void simplify() {
        int gcd = this.gcd();
        this.numerator /= gcd;
        this.denominator /= gcd;
        if (numerator == 0)
            denominator = 1;
        else if ((this.numerator > 0 && this.denominator < 0) || (this.numerator < 0 && this.denominator < 0)) {
            this.numerator *= -1;
            this.denominator *= -1;
        }
    }

    // TODOd: implement isNegative
    // returns true if the value of the fraction is less than zero; false otherwise;
    public boolean isNegative() {
        return getValue() < 0;
    }

    // TODOd: implement isProper
    // returns true if the function is proper; false otherwise; a fraction is considered proper if the absolute value of its numerator is smaller than the absolute value of its denominator.
    public boolean isProper() {
        return Math.abs(numerator) < Math.abs(denominator);
    }

    // nothing to do here (code is given to you, enjoy)
    @Override
    public String toString() {
        String str = "";
        if (this.numerator == 0)
            str += this.numerator;
        else
        if (this.isProper())
            str += this.numerator + "/" + this.denominator;
        else {
            int whole = this.numerator / this.denominator;
            str += whole;
            if (this.numerator % this.denominator != 0)
                str += " " + (this.numerator - whole * this.denominator) + "/" + this.denominator;
        }
        return str;
    }
}