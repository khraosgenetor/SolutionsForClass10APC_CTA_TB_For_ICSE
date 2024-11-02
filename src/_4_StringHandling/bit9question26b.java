package _4_StringHandling;

import java.util.*;

// Made by Khraos on 31-10-2024
// System time is: 04:03 and the day is: Thu

public class bit9question26b {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String[] names = new String[10];
        System.out.println("Enter 10 names:");

        for (int i = 0; i < 10; i++) {
            System.out.print("Name " + (i + 1) + ": ");
            names[i] = in.nextLine();
        }

        System.out.print("Enter a letter: ");
        char letter = in.next().charAt(0);

        System.out.println(letter + ":");
        for (int i = 0; i < 10; i++) {
            if (names[i].charAt(0) == letter) {
                System.out.println("    " + names[i]);
            }
        }

        in.close();
    }
}
