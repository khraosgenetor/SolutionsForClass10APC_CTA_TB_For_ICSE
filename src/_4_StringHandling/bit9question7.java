package _4_StringHandling;

import java.util.*;

// Made by Khraos on 30-10-2024
// System time is: 16:17 and the day is: Wed

public class bit9question7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a string: ");
        String input = in.nextLine();
        boolean isUppercase = true;
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char character = input.charAt(i);
            if (!Character.isUpperCase(character)) {
                isUppercase = false;
                break;
            }
        }

        if (!isUppercase) {
            System.err.println("Input contains lowercase letters. Please enter only uppercase letters.");
        } else {
            for (int i = 0; i < input.length(); i++) {
                char character = input.charAt(i);
                if (character == 'A' || character == 'E' || character == 'I' || character == 'O' || character == 'U') {
                    result.append('*');
                } else {
                    result.append(character);
                }
            }
            System.out.println(result.toString());
        }

        in.close();
    }
}
