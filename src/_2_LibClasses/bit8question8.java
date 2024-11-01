package _2_LibClasses;

import java.util.Scanner;

// Made by Khraos on 11-10-2024
// System time is: 20:24 and the day is: Fri

public class bit8question8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Menu:");
        System.out.println("1. Generate uppercase letters from Z to A");
        System.out.println("2. Generate lowercase letters from a to z");
        System.out.println("3. Exit");
        System.out.print("Enter your choice (1, 2, or 3): ");
        int ch = in.nextInt();

        switch (ch) {
            case 1:
                for (char c = 'Z'; c >= 'A'; c--) {
                    System.out.print(c + " ");
                }
                System.out.println();
                break;
            case 2:
                for (char c = 'a'; c <= 'z'; c++) {
                    System.out.print(c + " ");
                }
                System.out.println();
                break;
            case 3:
                System.out.println("Exiting the program.");
                break;
            default:
                System.out.println("Invalid choice. Please enter 1, 2, or 3.");
        }

        in.close();
    }
}