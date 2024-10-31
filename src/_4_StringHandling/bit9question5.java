package _4_StringHandling;

import java.util.*;

// Made by Khraos on 30-10-2024
// System time is: 16:12 and the day is: Wed

public class bit9question5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a sentence to check the biggest word: ");
        String input = in.nextLine();
        String longestWord = "";
        String currentWord = "";

        for (int i = 0; i <= input.length(); i++) {
            if (i < input.length() && input.charAt(i) != ' ') {
                currentWord += input.charAt(i);
            } else {
                if (currentWord.length() > longestWord.length()) {
                    longestWord = currentWord;
                }
                currentWord = "";
            }
        }

        System.out.println("Longest word: " + longestWord);
        System.out.println("Length: " + longestWord.length());
        in.close();
    }
}
