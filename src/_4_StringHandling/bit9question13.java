package _4_StringHandling;

import java.util.*;

// Made by Khraos on 30-10-2024
// System time is: 16:47 and the day is: Wed

public class bit9question13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String input = in.nextLine();

        String result = "";

        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            // Convert to lowercase if it is uppercase
            if (currentChar >= 'A' && currentChar <= 'Z') {
                currentChar += 32; // Convert to lowercase
            }
            // Check if the character is a vowel and replace with ASCII + 1
            if (isVowel(currentChar)) {
                currentChar++;
            }
            result += currentChar; // Append the modified character to the result
        }

        System.out.println("Output: " + result);
        in.close();
    }

    private static boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}
