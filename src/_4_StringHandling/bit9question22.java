package _4_StringHandling;

import java.util.*;

// Made by Khraos on 31-10-2024
// System time is: 03:01 and the day is: Thu

public class bit9question22 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Type 1 for Triangle and 2 for Inverted Triangle: ");
        int choice = in.nextInt();

        System.out.print("Enter terms: ");
        int terms = in.nextInt();

        if (choice == 1) {
            // Pattern for Inverted Triangle of Stars
            for (int i = terms; i > 0; i--) {
                for (int j = 0; j < terms - i; j++) {
                    System.out.print("  ");
                }
                for (int j = 0; j < i; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        } else if (choice == 2) {
            // Pattern for Inverted Triangle of Alphabets
            for (int i = terms; i > 0; i--) {
                char letter = 'A';
                for (int j = 0; j < i; j++) {
                    System.out.print(letter + " ");
                    letter++;
                }
                System.out.println();
            }
        } else {
            System.out.println("Invalid choice.");
        }

        in.close();
    }
}
