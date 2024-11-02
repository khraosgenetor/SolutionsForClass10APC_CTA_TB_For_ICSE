package _4_StringHandling;

import java.util.*;

// Made by Khraos on 31-10-2024
// System time is: 02:52 and the day is: Thu

public class bit9question20 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String w = in.next();
        int len = w.length();

        // Pattern (a)
        System.out.println("Pattern A:");
        for (int i = len; i > 0; i--) {
            System.out.println(w.substring(0, i));
        }
        System.out.println();
        // Pattern (b)
        System.out.println("Pattern B:");
        for (int i = len - 1; i >= 0; i--) {
            for (int j = 0; j <= len - i - 1; j++) {
                System.out.print(w.charAt(i));
            }
            System.out.println();
        }
        System.out.println();
        // Pattern (c)
        System.out.println("Pattern C:");
        for (int i = 0; i < len; i++) {
            System.out.println(w.substring(i));
        }
        in.close();
    }
}