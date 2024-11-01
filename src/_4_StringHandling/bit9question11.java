package _4_StringHandling;

import java.util.*;

// Made by Khraos on 30-10-2024
// System time is: 16:28 and the day is: Wed

public class bit9question11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String input = in.nextLine();

        String cW = "";
        String mVW = "";
        int mVC = 0;

        for (int i = 0; i <= input.length(); i++) {
            if (i < input.length() && input.charAt(i) != ' ') {
                cW += input.charAt(i); // Build the current word
            } else {
                // Check for vowels in the current word
                int vC = countVowels(cW);
                // Update the word with the most vowels
                if (vC > mVC) {
                    mVC = vC;
                    mVW = cW;
                }
                cW = ""; // Reset current word
            }
        }

        System.out.println("Output: " + mVW);
        System.out.println("Vowel Count: " + mVC);
        in.close();
    }

    private static int countVowels(String word) {
        int count = 0;
        for (int i = 0; i < word.length(); i++) {
            char c = Character.toLowerCase(word.charAt(i)); // Convert to lowercase for uniformity
            if ("aeiou".indexOf(c) != -1) {
                count++;
            }
        }
        return count;
    }
}
