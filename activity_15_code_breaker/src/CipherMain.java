/*
 * CS 2050 - Computer Science II - Fall 2022
 * Instructor: Thyago Mota
 * Description: Activity 15 - CipherMain class
 */

import java.io.*;
import java.util.*;

public class CipherMain {

    public static final String ENCRYPTED_TEXT         = "encrypted.txt";
    public static final String COMMON_WORDS           = "common.txt";
    public static final String LETTERS                = "abcdefghijklmnopqrstuvwxyz";
    public static final int    KEY_SIZE               = 7;
    public static final double COMMON_WORDS_THRESHOLD = .3;

    public static void main(String[] args) throws Exception {

        // TODOd: read the encrypted text from ENCRYPTED_TEXT file
        Scanner sc = new Scanner(new FileInputStream(ENCRYPTED_TEXT));
        String encrypted = sc.nextLine();
        sc.close();

        // TODOd: create a list of common words in English with words from COMMON_WORDS file
        LinkedList<String> commonWords = new LinkedList<>();
        sc = new Scanner(new FileInputStream(COMMON_WORDS));
        while (sc.hasNextLine())
            commonWords.add(sc.nextLine());
        sc.close();

        // TODO: initialize a stack with the letters of the alphabet

        // TODO: implement the exhaustive search algorithm main loop, maintaining a counter of the number of keys tested

    }
}
