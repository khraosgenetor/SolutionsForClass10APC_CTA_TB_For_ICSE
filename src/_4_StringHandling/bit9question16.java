package _4_StringHandling;

import java.util.*;

// Made by Khraos on 30-10-2024
// System time is: 17:16 and the day is: Wed

public class bit9question16 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String inp = in.nextLine().toUpperCase();

        int[] freq = new int[26]; // Array to hold frequency of each letter (A-Z)

        for (int i = 0; i < inp.length(); i++) {
            char cC = inp.charAt(i);
            if (cC >= 'A' && cC <= 'Z') { // Check if character is an uppercase letter
                freq[cC - 'A']++; // Increment frequency of the letter
            }
        }
        System.out.println("Characters and their Frequencies:");
        // Display the frequency of letters in alphabetical order
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] > 0) {
                System.out.println((char) (i + 'A') + ": " + freq[i]);
            }
        }
        in.close();
    }
}
