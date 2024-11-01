package _2_LibClasses;

import java.util.Scanner;

// Made by Khraos on 11-10-2024
// System time is: 20:27 and the day is: Fri

public class bit8question9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a letter: ");
        char iC = in.next().charAt(0);

        int aV = (int) iC; // Get ASCII value

        String rAS = "";
        while (aV != 0) {
            rAS += (aV % 10); // Append the last digit
            aV /= 10; // Remove the last digit
        }

        int rAV = Integer.parseInt(rAS);
        char cC = (char) rAV; // Get character from reversed ASCII value

        System.out.println("ASCII value of '" + iC + "' is: " + aV);
        System.out.println("Reversed ASCII value: " + rAV);
        System.out.println("Corresponding character: '" + cC + "'");

        in.close();
    }
}