package _4_StringHandling;

import java.util.*;

// Made by Khraos on 31-10-2024
// System time is: 02:56 and the day is: Thu

public class bit9question21 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Pattern (a)
        System.out.println("Pattern A:");
        for (int i = 5; i > 0; i--) {
            char letter = 'A';
            for (int j = 0; j < i; j++) {
                System.out.print(letter + " ");
                letter++;
            }
            System.out.println();
        }

        System.out.println();

        // Pattern (b)
        System.out.println("Pattern B:");
        char letter = 'A';
        for (int i = 1; i <= 5; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(letter + " ");
                letter++;
            }
            System.out.println();
        }

        System.out.println();

        // Corrected Pattern (c)
        System.out.println("Pattern C:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5 - i; j++) {
                System.out.print((char) ('A' + j) + " ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print((char) ('A' + j) + " ");
            }
            System.out.println();
        }

        in.close();
    }
}
