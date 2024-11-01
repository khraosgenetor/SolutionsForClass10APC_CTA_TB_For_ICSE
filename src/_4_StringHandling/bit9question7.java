package _4_StringHandling;

import java.util.*;

// Made by Khraos on 30-10-2024
// System time is: 16:17 and the day is: Wed

public class bit9question7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a string: ");
        String inp = in.nextLine();
        boolean iUC = true; // Flag to check if all characters are uppercase or spaces
        String r = ""; // Initialize r as an empty string

        for (int i = 0; i < inp.length(); i++) {
            char ch = inp.charAt(i);
            // Check if the character is neither uppercase nor a space
            if (!Character.isUpperCase(ch) && ch != ' ') {
                iUC = false; // Set flag to false if a character is not uppercase and not a space
                break;
            }
        }

        if (!iUC) {
            System.err.println("Input contains lowercase letters. Please enter only uppercase letters.");
        } else {
            for (int i = 0; i < inp.length(); i++) {
                char ch = inp.charAt(i);
                if ("AEIOU".indexOf(ch) != -1) {
                    r += '*'; // Concatenate '*' for vowels
                } else {
                    r += ch; // Concatenate the character for consonants
                }
            }
            System.out.println(r);
        }

        in.close();
    }
}
