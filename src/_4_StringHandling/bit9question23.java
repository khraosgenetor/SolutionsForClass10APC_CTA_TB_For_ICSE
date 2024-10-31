package _4_StringHandling;

import java.util.*;

// Made by Khraos on 31-10-2024
// System time is: 03:06 and the day is: Thu

public class bit9question23 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("INP: Type 1 for Triangle and 2 for Inverted Triangle: ");
        int choice = in.nextInt();

        System.out.print("Enter a word: ");
        String word = in.next().toUpperCase();
        int length = word.length();

        if (choice == 1) {
            // Triangle Pattern
            for (int i = 0; i < length; i++) {
                for (int j = 0; j <= i; j++) {
                    System.out.print(word.charAt(i) + " ");
                }
                System.out.println();
            }
        } else if (choice == 2) {
            // Inverted Triangle Pattern
            for (int i = length; i > 0; i--) {
                for (int j = 0; j < i; j++) {
                    System.out.print(word.charAt(j) + " ");
                }
                System.out.println();
            }
        } else {
            System.out.println("Invalid choice.");
        }

        in.close();
    }
}
