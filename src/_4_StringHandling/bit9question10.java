package _4_StringHandling;

import java.util.*;

// Made by Khraos on 30-10-2024
// System time is: 16:23 and the day is: Wed

public class bit9question10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String input = in.nextLine();

        String reversed = "";
        String currentWord = "";

        for (int i = 0; i <= input.length(); i++) {
            if (i < input.length() && input.charAt(i) != ' ') {
                currentWord += input.charAt(i); // Build the current word
            } else {
                // Append the current word to the reversed string
                if (!currentWord.isEmpty()) {
                    if (!reversed.isEmpty()) {
                        reversed = currentWord + " " + reversed; // Add space before the next word
                    } else {
                        reversed = currentWord; // First word, no space needed
                    }
                }
                currentWord = ""; // Reset current word
            }
        }

        System.out.println("Output: " + reversed);
        in.close();
    }
}
