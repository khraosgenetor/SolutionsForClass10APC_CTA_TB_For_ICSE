package _4_StringHandling;

import java.util.*;

// Made by Khraos on 30-10-2024
// System time is: 16:21 and the day is: Wed

public class bit9question9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String input = in.nextLine();
        String palindromes = "";
        String currentWord = "";

        for (int i = 0; i <= input.length(); i++) {
            if (i < input.length() && input.charAt(i) != ' ') {
                currentWord += input.charAt(i);
            } else {
                if (isPalindrome(currentWord)) {
                    palindromes += currentWord + " ";
                }
                currentWord = "";
            }
        }

        System.out.println("Palindromes: " + palindromes.trim());
        in.close();
    }

    private static boolean isPalindrome(String word) {
        String reversed = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            reversed += word.charAt(i);
        }
        return word.equalsIgnoreCase(reversed);
    }
}
