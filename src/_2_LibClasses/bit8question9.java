package _2_LibClasses;

import java.util.Scanner;

// Made by Khraos on 11-10-2024
// System time is: 20:27 and the day is: Fri

public class bit8question9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a letter: ");
        char inputChar = in.next().charAt(0);

        int asciiValue = (int) inputChar; // Get ASCII value

        String reversedAsciiString = "";
        while (asciiValue != 0) {
            reversedAsciiString += (asciiValue % 10); // Append the last digit
            asciiValue /= 10; // Remove the last digit
        }

        int reversedAsciiValue = Integer.parseInt(reversedAsciiString);
        char correspondingChar = (char) reversedAsciiValue; // Get character from reversed ASCII value

        System.out.println("ASCII value of '" + inputChar + "' is: " + asciiValue);
        System.out.println("Reversed ASCII value: " + reversedAsciiValue);
        System.out.println("Corresponding character: '" + correspondingChar + "'");

        in.close();
    }
}