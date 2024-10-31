package _4_StringHandling;

import java.util.*;

// Made by Khraos on 31-10-2024
// System time is: 02:49 and the day is: Thu

public class bit9question17 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = in.nextLine().toUpperCase();

        int doubleLetterCount = 0;
        int length = input.length();

        for (int i = 0; i < length - 1; i++) {
            if (input.charAt(i) == input.charAt(i + 1)) {
                doubleLetterCount++;
                while (i < length - 1 && input.charAt(i) == input.charAt(i + 1)) {
                    i++;
                }
            }
        }

        System.out.println("Double letter sequences: " + doubleLetterCount);

        in.close();
    }
}
