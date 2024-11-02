package _4_StringHandling;

import java.util.*;

// Made by Khraos on 31-10-2024
// System time is: 02:45 and the day is: Thu

public class bit9question18 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String w = in.next().toUpperCase();

        int len = w.length();
        boolean iS = w.charAt(0) == w.charAt(len - 1); //is Special?
        boolean iP = true;//is Palindrome?

        for (int i = 0; i < len / 2; i++) {
            if (w.charAt(i) != w.charAt(len - i - 1)) {
                iP = false;
                break;
            }
        }

        System.out.println("Special Word: " + (iS ? "Yes" : "No"));
        System.out.println("Palindrome: " + (iP ? "Yes" : "No"));

        in.close();
    }
}
