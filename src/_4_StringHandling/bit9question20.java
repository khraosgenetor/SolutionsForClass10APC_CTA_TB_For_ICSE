package _4_StringHandling;

import java.util.*;

// Made by Khraos on 31-10-2024
// System time is: 02:52 and the day is: Thu

public class bit9question20 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word = in.next();

        int length = word.length();

        // Pattern (a)
        System.out.println("Pattern A:");
        for (int i = length; i > 0; i--) {
            System.out.println(word.substring(0, i));
        }

        System.out.println();

        // Pattern (b)
        System.out.println("Pattern B:");
        for (int i = length - 1; i >= 0; i--) {
            for (int j = 0; j <= length - i - 1; j++) {
                System.out.print(word.charAt(i));
            }
            System.out.println();
        }

        System.out.println();

        // Pattern (c)
        System.out.println("Pattern C:");
        for (int i = 0; i < length; i++) {
            System.out.println(word.substring(i));
        }

        in.close();
    }
}
