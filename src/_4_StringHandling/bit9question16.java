package _4_StringHandling;

import java.util.*;

// Made by Khraos on 30-10-2024
// System time is: 17:16 and the day is: Wed

public class bit9question16 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String input = in.nextLine().toUpperCase();

        int[] frequency = new int[26]; // Array to hold frequency of each letter (A-Z)

        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            if (currentChar >= 'A' && currentChar <= 'Z') { // Check if character is an uppercase letter
                frequency[currentChar - 'A']++; // Increment frequency of the letter
            }
        }
        System.out.println("Characters and their Frequencies:");
        // Display the frequency of letters in alphabetical order
        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i] > 0) {
                System.out.println((char) (i + 'A') + ": " + frequency[i]);
            }
        }
        in.close();
    }
}
