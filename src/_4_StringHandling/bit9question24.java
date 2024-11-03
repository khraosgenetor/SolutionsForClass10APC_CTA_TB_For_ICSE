package _4_StringHandling;

import java.util.*;

// Made by Khraos on 31-10-2024
// System time is: 03:47 and the day is: Thu

public class bit9question24 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("1. Floyd's Triangle");
        System.out.println("2. Character Pattern");
        System.out.print("Enter your choice (1 or 2): ");
        int ch = in.nextInt();

        if (ch == 1) {
            // Floyd's Triangle
            int n = 1; // starting number
            for (int i = 1; i <= 5; i++) { // 5 rows
                for (int j = 1; j <= i; j++) {
                    System.out.print(n + " ");
                    n++;
                }
                System.out.println();
            }
        } else if (ch == 2) {
            // Character Pattern
            char[] l = {'I', 'C', 'S', 'E'};
            for (int i = 0; i < l.length; i++) {
                for (int j = 0; j <= i; j++) {
                    System.out.print(l[j] + " ");
                }
                System.out.println();
            }
        } else {
            System.err.println("Invalid choice '" +ch+"'.");
        }

        in.close();
    }
}
