/*
 * CS2050 - Computer Science II - Fall 2022
 * Instructor: Thyago Mota
 * Student Name:
 * Description: Midterm Exam (make-up)
 */

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class Marathoner implements Comparable<Marathoner> {

    private String name;
    private Date   dob;
    private int    gender;
    private int    pr;
    public static final int FEMALE_GENDER = 1;
    public static final int MALE_GENDER   = 2;

    public Marathoner(String name, Date dob, int gender, int pr) {
        this.name = name;
        this.dob = dob;
        if (gender < FEMALE_GENDER && gender > MALE_GENDER)
            gender = FEMALE_GENDER;
        this.gender = gender;
        if (pr < 0)
            this.pr = 0;
        else
            this.pr = pr;
    }

    public Marathoner(String name, Date dob, int gender) {
        this(name, dob, gender, 0);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        if (gender == FEMALE_GENDER || gender == MALE_GENDER)
            this.gender = gender;
    }

    public int getPr() {
        return pr;
    }

    public void setPr(int pr) {
        if (pr >= 0)
            this.pr = pr;
    }

    private String getPrString() {
        int hours = pr / 3600;
        int minutes = (pr - hours * 3600) / 60;
        int seconds = (pr - hours * 3600 - minutes * 60);
        return hours + ":" + minutes + ":" + seconds;
    }

    private String getGenderString() {
        if (gender == FEMALE_GENDER)
            return "female";
        else
            return "male";
    }

    @Override
    public String toString() {
        SimpleDateFormat df = new SimpleDateFormat("yyyy-mm-dd");
        return "Marathoner{" +
                "name='" + name + '\'' +
                ", dob=" + df.format(dob) +
                ", gender=" + getGenderString() +
                ", pr=" + getPrString() +
                '}';
    }

    // TODO #1: override equals in Marathoner such that it returns true if marathoners have the same name.
    @Override
    public boolean equals(Object obj) {
        return false;
    }

    // TODO #2: override compareTo in Marathoner such that female marathoners appear before male marathoners and that faster marathoners appear before slower ones (if they have the same gender).
    @Override
    public int compareTo(Marathoner other) {
        return 0;
    }
}
