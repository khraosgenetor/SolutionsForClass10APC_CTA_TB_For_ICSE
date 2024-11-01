package _4_StringHandling;

import java.util.*;

// Made by Khraos on 31-10-2024
// System time is: 11:32 and the day is: Thu

public class bit9question29 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] words = new String[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter word " + (i + 1) + ": ");
            words[i] = in.next();
        }

        System.out.println("Palindromic words:");
        for (String word : words) {
            if (isPalindrome(word)) {
                System.out.println(word);
            }
        }

        in.close();
    }

    public static boolean isPalindrome(String word) {
        int len = word.length();
        for (int i = 0; i < len / 2; i++) {
            if (word.charAt(i) != word.charAt(len - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}
