package _4_StringHandling;

import java.util.*;

// Made by Khraos on 31-10-2024
// System time is: 11:31 and the day is: Thu

public class bit9question28 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] country = new String[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter country name " + (i + 1) + ": ");
            country[i] = in.next();
        }

        System.out.println("Countries that begin with a consonant and end with a vowel:");
        for (int i = 0; i < country.length; i++) {
            char fC = country[i].charAt(0), lC = country[i].charAt(country[i].length() - 1);

            if (!isVowel(fC) && isVowel(lC)) {
                System.out.println(country[i]);
            }
        }

        in.close();
    }

    public static boolean isVowel(char ch) {
        return ("AEIOUaeiou".indexOf(ch) != -1);
    }
}
