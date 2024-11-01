package _4_StringHandling;

import java.util.*;

// Made by Khraos on 30-10-2024
// System time is: 16:47 and the day is: Wed

public class bit9question13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String inp = in.nextLine();

        String r = "";

        for (int i = 0; i < inp.length(); i++) {
            char cC = inp.charAt(i);
            // Convert to lowercase if it is uppercase
            if (cC >= 'A' && cC <= 'Z') {
                cC += 32; // Convert to lowercase
            }
            // Check if the character is a vowel and replace with ASCII + 1
            if (isVowel(cC)) {
                cC++;
            }
            r += cC; // Append the modified character to the result
        }

        System.out.println("Output: " + r);
        in.close();
    }

    private static boolean isVowel(char c) {
        return ("aeiou".indexOf(c) != -1);
    }
}
