package LibClasses;

import java.util.*;

// Made by Khraos on 11-10-2024
// System time is: 20:31 and the day is: Fri

public class bit8question12 {
    public static void main(String[] args) {
        printAllPatterns();
    }

    public static void printAllPatterns() {
        // Pattern 1: A
        for (int i = 1; i <= 5; i++) {
            for (char ch = (i % 2 == 1) ? 'A' : 'a'; ch < (i % 2 == 1 ? 'A' + i : 'a' + i); ch++) {
                System.out.print(ch);
            }
            System.out.println();
        }
        System.out.println(); // Line break

        // Pattern 2: ZYXWU
        for (int i = 5; i > 0; i--) {
            for (char ch = 'Z'; ch >= 'Z' - i + 1; ch--) {
                System.out.print(ch);
            }
            System.out.println();
        }
        System.out.println(); // Line break

        // Pattern 3: ABCD, ABC, A
        for (int i = 5; i > 0; i -= 2) { // Control number of characters to print
            for (char ch = 'A'; ch < 'A' + i; ch++) { // Print characters from 'A' up to 'A' + i
                System.out.print(ch); // Print the character
            }
            System.out.println(); // Move to the next line
        }
        System.out.println(); // Line break

        // Pattern 4: PRTV
        for (int i = 0; i < 4; i++) { // Outer loop for lines
            for (char ch = 'P'; ch <= 'V'; ch += 2) { // Loop through 'P', 'R', 'T', 'V'
                if (ch <= 'V' - i * 2) { // Condition to skip the last i*2 characters
                    System.out.print(ch);
                }
            }
            System.out.println(); // Move to the next line after each row
        }
        System.out.println(); // Line break

        // Pattern 5: A*B*C*D*E*
        for (int i = 5; i > 0; i--) {
            for (char ch = 'A'; ch < 'A' + i; ch++) {
                System.out.print(ch + "*");
            }
            System.out.println();
        }
        System.out.println(); // Line break

        // Merged Patterns for Lowercase letters
        for (char ch = 'a'; ch <= 'b'; ch++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(ch + " ");
            }
            System.out.println();
        }
        for (char ch = 'A'; ch <= 'B'; ch++){
            for (int j = 0; j < 5; j++) {
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }
}
