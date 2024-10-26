package _4_StringHandling;

import java.util.*;

// Made by Khraos on 19-10-2024
// System time is: 12:53 and the day is: Sat

/**
 * This class contains methods to get initials from a full name and count the number of words in a given string.
 */
public class bit9question3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your name (max 3 words): ");
        String fullName = in.nextLine();

        if (wordCount(fullName) > 3) {
            System.out.println("Error: Please enter a name with a maximum of 3 words.");
        } else {
            String initials = getInitials(fullName);
            System.out.println("Initials: " + initials);
        }

        in.close();
    }

    /**
     * Extracts the initials from a full name.
     *
     * @param name The full name from which to extract initials.
     * @return A string containing the initials of the name, separated by periods.
     */
    public static String getInitials(String name) {
        String initials = "";
        boolean isStartOfWord = true;

        for (int i = 0; i < name.length(); i++) {
            char currentChar = name.charAt(i);
            if (currentChar == ' ') {
                isStartOfWord = true;
            } else if (isStartOfWord) {
                initials += currentChar + ".";
                isStartOfWord = false;
            }
        }

        return initials;
    }

    /**
     * Counts the number of words in a given string.
     *
     * @param name The string to count the words of.
     * @return The number of words in the string.
     */
    public static int wordCount(String name) {
        int count = 0;
        boolean inWord = false;

        for (int i = 0; i < name.length(); i++) {
            char currentChar = name.charAt(i);
            if (currentChar == ' ') {
                if (inWord) {
                    count++;
                    inWord = false;
                }
            } else {
                inWord = true;
            }
        }

        if (inWord) {
            count++; // Count the last word if there's no trailing space
        }

        return count;
    }
}
