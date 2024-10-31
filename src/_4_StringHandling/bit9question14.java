package _4_StringHandling;

import java.util.*;

// Made by Khraos on 30-10-2024
// System time is: 16:50 and the day is: Wed

public class bit9question14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = in.nextLine();

        String result = "";

        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            char newChar = currentChar;

            if (Character.isLetter(currentChar)) {
                char previousChar = (char) (currentChar - 1);

                if (!isVowel(currentChar)) {
                    // If the previous character is a vowel, replace with ASCII + 1
                    if (isVowel(previousChar)) {
                        newChar = (char) (currentChar + 1);
                    } else {
                        // Replace with ASCII - 1
                        newChar = (char) (currentChar - 1);
                    }
                }
            }

            result += newChar; // Append the modified character to the result
        }

        System.out.println("Output: " + result);
        in.close();
    }

    private static boolean isVowel(char c) {
        c = Character.toLowerCase(c);
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}
