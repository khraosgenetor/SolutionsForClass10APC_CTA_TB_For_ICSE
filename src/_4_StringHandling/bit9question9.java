package _4_StringHandling;

import java.util.*;

// Made by Khraos on 30-10-2024
// System time is: 16:21 and the day is: Wed

public class bit9question9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String input = in.nextLine();
        StringBuilder palindromes = new StringBuilder();
        String currentWord = "";

        for (int i = 0; i <= input.length(); i++) {
            if (i < input.length() && input.charAt(i) != ' ') {
                currentWord += input.charAt(i);
            } else {
                if (isPalindrome(currentWord)) {
                    palindromes.append(currentWord).append(" ");
                }
                currentWord = "";
            }
        }

        System.out.println("Palindromes: " + palindromes.toString().trim());
        in.close();
    }

    private static boolean isPalindrome(String word) {
        StringBuilder reversed = new StringBuilder(word);
        return word.equalsIgnoreCase(reversed.reverse().toString());
    }
}
