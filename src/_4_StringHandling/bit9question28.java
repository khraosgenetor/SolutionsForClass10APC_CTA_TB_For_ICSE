package _4_StringHandling;

import java.util.*;

// Made by Khraos on 31-10-2024
// System time is: 11:31 and the day is: Thu

public class bit9question28 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] countries = new String[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter country name " + (i + 1) + ": ");
            countries[i] = in.next();
        }

        System.out.println("Countries that begin with a consonant and end with a vowel:");
        for (String country : countries) {
            char firstChar = country.charAt(0);
            char lastChar = country.charAt(country.length() - 1);
            if (!isVowel(firstChar) && isVowel(lastChar))
                System.out.println(country);
        }

        in.close();
    }

    public static boolean isVowel(char ch) {
        ch = Character.toLowerCase(ch);
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}
