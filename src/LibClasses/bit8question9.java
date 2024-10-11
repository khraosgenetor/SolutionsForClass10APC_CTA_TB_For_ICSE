package LibClasses;

import java.util.*;

// Made by Khraos on 11-10-2024
// System time is: 20:27 and the day is: Fri

public class bit8question9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean retry = true;

        while (retry) {
            System.out.print("Enter a letter: ");
            char inputChar = in.next().charAt(0);
            int asciiValue = (int) inputChar; // Get ASCII value

            System.out.println("ASCII value of '" + inputChar + "' is: " + asciiValue);

            String reversedAsciiString = reverseNumber(asciiValue);
            int reversedAsciiValue = Integer.parseInt(reversedAsciiString);
            char correspondingChar = (char) reversedAsciiValue; // Get character from reversed ASCII value

            System.out.println("Reversed ASCII value: " + reversedAsciiValue);
            System.out.println("Corresponding character: '" + correspondingChar + "'");

            System.out.print("Do you wish to retry? (Yy/Nn): ");
            char choice = in.next().charAt(0);
            retry = (choice == 'Y' || choice == 'y');
        }
        in.close();
    }

    private static String reverseNumber(int number) {
        StringBuilder sb = new StringBuilder();
        sb.append(number);
        return sb.reverse().toString();
    }
}
