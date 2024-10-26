package _4_StringHandling;

import java.util.*;

// Made by Khraos on 19-10-2024
// System time is: 12:53 and the day is: Sat

import java.util.Scanner;

/**
 * This class contains a method to remove vowels from a given word.
 *
 * @author Khraos
 * @since 19-10-2024
 */
public class bit9question2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word = in.nextLine();
        String result = removeVowels(word);
        System.out.println("Word after removing vowels: " + result);
    }

    /**
     * Removes vowels from a given word.
     *
     * @param word The word from which to remove vowels.
     * @return The word after removing vowels.
     */
    public static String removeVowels(String word) {
        String vowels = "aeiouAEIOU";
        StringBuilder sb = new StringBuilder();
        for (char c : word.toCharArray()) {
            if (!vowels.contains(String.valueOf(c))) {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}
