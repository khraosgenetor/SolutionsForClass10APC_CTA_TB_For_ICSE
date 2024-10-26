package _4_StringHandling;

import java.util.*;

// Made by Khraos on 19-10-2024
// System time is: 12:40 and the day is: Sat

/**
 * This class contains two static methods to count words and letters in a given string.
 *
 * @author Khraos
 * @since 19-10-2024
 */
public class bit9question1 {

    /**
     * Counts the number of words in a given string.
     * A word is defined as a sequence of non-space characters.
     *
     * @param string The string to count words in.
     * @return The number of words in the given string.
     */
    static int wordsCount(String string) {
        int count = 0;
        boolean inWord = false;

        for (int i = 0; i < string.length(); i++) {
            char currentChar = string.charAt(i);
            if (currentChar != ' ') {
                if (!inWord) {
                    inWord = true;
                    count++;
                }
            } else {
                inWord = false;
            }
        }
        return count;
    }

    /**
     * Counts the number of letters in a given string.
     *
     * @param string The string to count letters in.
     * @return The number of letters in the given string.
     */
    static int letterCount(String string) {
        int count = 0;
        for (int i = 0; i < string.length(); i++) {
            char currentChar = string.charAt(i);
            if (Character.isLetter(currentChar)) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String input = in.nextLine();

        System.out.println("Number of words: " + wordsCount(input));
        System.out.println("Number of letters: " + letterCount(input));

        in.close();
    }
}
