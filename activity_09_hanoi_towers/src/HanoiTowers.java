/*
 * CS2050 - Computer Science II - Fall 2022
 * Instructor: Thyago Mota
 * Description: Activity 09 - Hanoi Tower
 */

public class HanoiTowers {

    // TODO: instance variables: the size of the puzzle (size), the rods (rods), and a counter (moves) for the number of moves

    // class variables are given
    public static final int DEFAULT_SIZE = 3;
    public static final int MIN_SIZE = 1;
    public static final int NUMBER_RODS = 3;
    public static final String RODS_LABELS[] = {"source", "target", "aux"};

    // TODO: constructor should accept the size of the puzzle, i.e., the number of disks; if the value informed is smaller than 1, have it default to 3; the constructor should call initialize method (see below)
    public HanoiTowers(int size) {

    }

    // TODO: initialize is suppose to create the rods and initialize the puzzle (i.e., add all disks to the first rod); also this method should reset the counter for the number of moves
    void initialize() {

    }

    public int getSize() {
        return size;
    }

    public int getMoves() {
        return moves;
    }

    // TODO: move n disks from rod labeled source to rod labeled target using rod labeled aux; show the state of the rods every time there is a move; this function MUST be recursive!
    void move(int n, int source, int target, int aux) throws Exception {
        System.out.println(this);
    }

    @Override
    public String toString() {
        String out = "";
        for (int i = 0; i < rods.length; i++)
            out += RODS_LABELS[i] + ":\t[top] " + rods[i] + " [bottom]\n";
        return out + "\n";
    }

    // TODO: solve the puzzle for different sizes; show the number of moves that it takes to solve it
    public static void main(String[] args) throws Exception {

    }
}
