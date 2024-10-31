package _4_StringHandling;

import java.util.*;

// Made by Khraos on 30-10-2024
// System time is: 17:07 and the day is: Wed

public class bit9question15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word = in.nextLine();
        int value = calculateWordValue(word);
        System.out.println(word + (isHappyWord(value) ? " is a happy word." : " is not a happy word."));
        in.close();
    }

    private static int calculateWordValue(String word) {
        int totalValue = 0;
        for (int i = 0; i < word.length(); i++) {
            char currentChar = Character.toUpperCase(word.charAt(i));
            if (Character.isLetter(currentChar)) {
                totalValue = totalValue * 100 + (currentChar - 'A' + 1);
            }
        }
        return totalValue;
    }

    private static boolean isHappyWord(int number) {
        while (number != 1 && number != 4) { // 4 is a known non-happy number
            number = sumOfSquaresOfDigits(number);
        }
        return number == 1;
    }

    private static int sumOfSquaresOfDigits(int number) {
        int sum = 0;
        while (number > 0) {
            int digit = number % 10;
            sum += digit * digit;
            number /= 10;
        }
        return sum;
    }
}
