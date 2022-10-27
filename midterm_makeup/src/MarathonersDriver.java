/*
 * CS2050 - Computer Science II - Fall 2022
 * Instructor: Thyago Mota
 * Student Name:
 * Description: Midterm Exam (make-up)
 */

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;

public class MarathonersDriver {

    public static void main(String[] args) throws ParseException {

        // Part 1
        SimpleDateFormat df = new SimpleDateFormat("yyyy-mm-dd");

        // TODO #5: declare a static array of Marathoner's named "mrts" and then instantiate the array with size 5, saving the reference into "mrts".

//        mrts[0] = new Marathoner("Daniel do Nascimento", df.parse("1998-07-28"), Marathoner.MALE_GENDER, 7491);
//        mrts[1] = new Marathoner("Emma Bates", df.parse("1992-07-08"), Marathoner.FEMALE_GENDER, 8598);
//        mrts[2] = new Marathoner("Eliud Kipchoge", df.parse("1984-11-05"), Marathoner.MALE_GENDER, 7269);
//        mrts[3] = new Marathoner("Galen Rupp", df.parse("1986-05-08"), Marathoner.MALE_GENDER, 7595);
//        mrts[4] = new Marathoner("Gotytom Gebreslase", df.parse("1995-01-15"), Marathoner.FEMALE_GENDER, 8291);
        Arrays.sort(mrts);
        System.out.println(Arrays.toString(mrts));

        // Part 2
        // TODO #6:  instantiate a MarathonersList and add (or append) all the marathoners (described in the MarathonersDriver class); then display a list of the male marathoners followed by female marathoners using MarathonersList's byGender method; finally, show the faster male and female marathoner using MarathonersList's getFaster method.

    }
}
