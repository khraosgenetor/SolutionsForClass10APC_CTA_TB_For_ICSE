package _4_StringHandling;

import java.util.*;

// Made by Khraos on 31-10-2024
// System time is: 02:45 and the day is: Thu

public class bit9question18 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word = in.next().toUpperCase();

        int length = word.length();
        boolean isSpecial = word.charAt(0) == word.charAt(length - 1);
        boolean isPalindrome = true;

        for (int i = 0; i < length / 2; i++) {
            if (word.charAt(i) != word.charAt(length - i - 1)) {
                isPalindrome = false;
                break;
            }
        }

        System.out.println("Special Word: " + (isSpecial ? "Yes" : "No"));
        System.out.println("Palindrome: " + (isPalindrome ? "Yes" : "No"));

        in.close();
    }
}
