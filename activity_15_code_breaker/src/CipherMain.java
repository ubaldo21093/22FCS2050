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

        // TODO: read the encrypted text from ENCRYPTED_TEXT file
        Scanner sc = new Scanner(new FileInputStream(ENCRYPTED_TEXT));
        String encrypted = sc.nextLine();
        sc.close();

        // TODO: create a list of common words in English with words from COMMON_WORDS file
        LinkedList<String> commonWords = new LinkedList<>();
        sc = new Scanner(new FileInputStream(COMMON_WORDS));
        while (sc.hasNextLine())
            commonWords.add(sc.nextLine());
        sc.close();

        // TODO: initialize a stack with the letters of the alphabet
        char letters[] = LETTERS.toCharArray();
        Stack<String> stack = new Stack<>();
        for (int i = letters.length - 1; i >= 0; i--)
            stack.push(letters[i] + "");

        // TODO: implement the exhaustive search algorithm main loop, maintaining a counter of the number of keys tested
        int total = 0;
        while (!stack.isEmpty()) {
            String key = stack.pop();
            // System.out.println(key);
            if (key.length() == KEY_SIZE) {
                total++;
                if (total % 1000000 == 0)
                    System.out.println("Tested " + total + " keys so far...");
                String decoded = Cipher.decode(encrypted, key);
                // message has more than a minimum percent of common words
                String words[] = decoded.split(" ");
                int count = 0;
                for (String word : words)
                    if (word.length() > 2 && commonWords.contains(word))
                        count++;
                double percentCommonWords = (double) count / words.length;
                if (percentCommonWords >= COMMON_WORDS_THRESHOLD) {
                    System.out.println("Done after testing " + total + " keys!");
                    System.out.println("key \"" + key + "\" decoded message \"" + decoded + "\" after trying " + total + " different keys!");
                    break;
                }
            }
            else if (key.length() < KEY_SIZE)
                for (int i = letters.length - 1; i >= 0; i--)
                    stack.push(key + letters[i]);
        }
    }
}
