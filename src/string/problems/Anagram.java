package string.problems;

import java.util.Arrays;

/**
 * Created by mrahman on 04/22/17.
 */
public class Anagram {

    public static void main(String[] args) {
        //Write a Java Program to check if the two String are Anagram. Two String are called Anagram when there is
        //same character but in different order.For example,"CAT" and "ACT", "ARMY" and "MARY".
        System.out.println("isAnagram" + AnagramChack("s1", "s2"));

    String s1 = "ARMY";
    String s2 = "MARY";}

    public static boolean AnagramChack(String s1, String s2) {
        char[] array = s1.toLowerCase().toCharArray();
        char[] array2 = s2.toLowerCase().toCharArray();
        Arrays.sort(array);
        Arrays.sort(array2);
        return Arrays.equals(array, array2);


    }

    }

