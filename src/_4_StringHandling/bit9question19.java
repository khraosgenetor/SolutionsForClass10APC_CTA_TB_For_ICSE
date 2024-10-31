package _4_StringHandling;

// Made by Khraos on 30-10-2024
// System time is: 17:22 and the day is: Wed

import java.util.Scanner;

public class bit9question19 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String input = in.nextLine().toUpperCase();

        int consecutiveLetterWords = 0;

        // Split the sentence into words manually
        int start = 0;
        for (int i = 0; i <= input.length(); i++) {
            if (i == input.length() || input.charAt(i) == ' ') {
                String word = input.substring(start, i);

                // Check for consecutive letters in ascending order
                boolean hasConsecutiveLetters = false;
                for (int j = 1; j < word.length(); j++) {
                    if (word.charAt(j) - word.charAt(j - 1) == 1) {
                        hasConsecutiveLetters = true;
                        break;
                    }
                }

                // Print the word and update the count
                System.out.print(word + " ");
                if (hasConsecutiveLetters) {
                    consecutiveLetterWords++;
                }

                start = i + 1; // Move to the next word
            }
        }

        System.out.println("\nConsecutive Lettered Words: " + consecutiveLetterWords);

        in.close();
    }
}