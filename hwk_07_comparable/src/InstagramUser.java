/*
 * CS2050 - Computer Science II - Fall 2022
 * Instructor: Thyago Mota
 * Description: Homework 07 - InstagramUser
 * Student name:
 */

import java.util.Arrays;

public class InstagramUser implements Comparable<InstagramUser> {

    private String username;
    private int    followers;

    public InstagramUser(String username, int followers) throws InstantiationException {
        this.username = username;
        if (followers < 0) throw new InstantiationException("#followers cannot be negative!");
        this.followers = followers;
    }

    // TODO #1: override compareTo such that more popular users (higher number of followers) appear before less popular users
    @Override
    public int compareTo(InstagramUser other) {
        return 0;
    }

    @Override
    public String toString() {
        return "InstagramUser{" +
                "username='" + username + '\'' +
                ", followers=" + followers +
                '}';
    }

    public static void main(String[] args) throws InstantiationException {
        // TODO #2: create a static array of 5 instagram accounts


        // TODO #3: sort the accounts from most popular to least popular using Arrays.sort's method;
        // then display the accounts
        
    }
}
