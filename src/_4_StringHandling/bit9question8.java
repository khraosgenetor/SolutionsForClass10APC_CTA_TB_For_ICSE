package _4_StringHandling;

import java.util.*;

// Made by Khraos on 30-10-2024
// System time is: 16:19 and the day is: Wed

public class bit9question8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String input = in.nextLine();
        StringBuilder result = new StringBuilder();
        String currentWord = "";

        for (int i = 0; i <= input.length(); i++) {
            if (i < input.length() && input.charAt(i) != ' ') {
                currentWord += input.charAt(i);
            } else {
                if (currentWord.length() > 0) {
                    result.append(currentWord.charAt(0));
                }
                currentWord = "";
            }
        }

        System.out.println("Constructed word: " + result.toString());
        in.close();
    }
}
