package _2_LibClasses;

import java.util.Scanner;

// Made by Khraos on 11-10-2024
// System time is: 18:44 and the day is: Fri

public class bit8question2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        char ch;

        System.out.print("Enter a character: ");
        ch = in.nextLine().charAt(0);

        System.out.print("The next 5 characters are:");

        for (int i = 1; i <= 5; i++) {
            ch++;
            System.out.print(" " + ch);
        }

    }
}
