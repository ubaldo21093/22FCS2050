/*
 * CS2050 - Computer Science II - Fall 2022
 * Instructor: Thyago Mota
 * Student(s) Name(s):
 * Description: prg_01 - Element
 */

/**
 * A Molecule is a specialized linked list that uses chain of Node objects carrying Elements. A Molecule has a name (for example, “Carbon Dioxide” or “Caffeine”).
 */
public class Molecule extends LinkedList<Element> {

    private String name;

    // TODO: initialize the molecule with the information provided by the user
    public Molecule(final String name) {
        super(); // leave it: need to call LinkedList parent's constructor
    }

    // TODO: provide an implementation consistent with the following:
    //  1. The elements in a molecule must be distinct; therefore, the add method should prevent adding an element that is already in the molecule
    //  2. The elements in a molecule must respect the Hill system, which states that carbon atoms are listed first, hydrogen atoms next, and then all other elements are added in alphabetical order.
    @Override
    public void add(final Element element) {

    }

    // TODO: provide an implementation consistent with the following:
    // * the name of the molecule should be returned in double quotes followed by a colon and the molecule’s elements and amounts;
    // * only the atom letter of each element must be returned (do not return the name of the element);
    // * the amount follows the element’s atom letter with an underscore character in between;
    // * if the amount is one, it should be omitted.
    @Override
    public String toString() {
        return "";
    }
}
