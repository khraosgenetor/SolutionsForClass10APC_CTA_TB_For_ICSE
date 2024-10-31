package _7_Constructors;

import java.util.*;

// Made by Khraos on 31-10-2024
// System time is: 04:57 and the day is: Thu

public class bit6question5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Stringop strOp = new Stringop();
        strOp.accept(in);
        strOp.encode();
        strOp.print();
        in.close();
    }
}

class Stringop {
    String str;

    Stringop() {
        str = null; // Initialize str with null
    }

    void accept(Scanner in) {
        System.out.print("Enter a sentence: ");
        str = in.nextLine();
    }

    void encode() {
        String encodedStr = ""; // Initialize an empty string for the encoded result

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isLetter(ch)) { // Check if the character is a letter
                ch += 2; // Replace the character with ASCII + 2
            }
            encodedStr += ch; // Append the character to the encoded string
        }

        str = encodedStr; // Update str with the encoded string
    }

    void print() {
        System.out.println("Encoded sentence:");
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == ' ') { // Check for spaces or end of string
                System.out.println(); // Print a new line for each word
            } else {
                System.out.print(ch); // Print the character
            }
        }
    }
}
