/*
 * CS2050 - Computer Science II - Fall 2022
 * Instructor: Thyago Mota
 * Student(s) Name(s):
 * Description: prg_01 - Element
 */

/**
 * A chemical element is a pure substance that consists of one type of atom and it is represented in this project by the Element class. Users can create an element by informing its atom letter, name, and amount (the last 2 have default values). Atom letters are always written in upper case. For example, element "C" is named "carbon". In this assignment, two element objects are considered to be equal if they have the same atom letter (regardless of their actual names and amounts).
 */
public class Element {

    private String atomLetter;
    private String name;
    private int    amount;
    public static final int MIN_AMOUNT = 1;

    // TODO: finish the generic constructor, making sure that atomLetter is (converted to) upper case, name is (converted to) lower case, and that element is at least MIN_AMOUNT
    public Element(String atomLetter, String name, int amount) {

    }

    // TODO: finish this constructor, setting amount to MIN_AMOUNT; make sure that atomLetter is (converted to) upper case and that name is (converted to) lower case
    public Element(String atomLetter, String name) {

    }

    // TODO: finish this constructor, setting name to "" and amount to MIN_AMOUNT; make sure that atomLetter is (converted to) upper case
    public Element(String atomLetter) {

    }

    // TODO: implement getters and setters for all instance variables


    // TODO: override equals (two elements are considered to be equal if they have the same atom letter, regardless of their actual names and amounts)
    @Override
    public boolean equals(final Object obj) {
        return false;
    }

    // TODO: override toString returning a string representation of an element
    @Override
    public String toString() {
        return "";
    }

    // TODO: override clone (return an exact copy of the element)
    @Override
    protected Object clone() {
        return null;
    }
}
