package _2_LibClasses;

import java.util.Scanner;

// Made by Khraos on 11-10-2024
// System time is: 20:28 and the day is: Fri

public class bit8question10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Menu:");
        System.out.println("1. Display the first 5 uppercase letters (A to E)");
        System.out.println("2. Display the last 5 lowercase letters (z to v)");
        System.out.print("Please select an option (1 or 2): ");

        int choice = in.nextInt();
        char startChar = (choice == 1) ? 'A' : 'z';
        int limit = 5;

        if (choice == 1 || choice == 2) {
            System.out.println((choice == 1 ? "First" : "Last") + " 5 " + (choice == 1 ? "uppercase" : "lowercase") + " letters:");
            for (int count = 0; count < limit; count++) {
                System.out.print((char)(startChar + (choice == 1 ? count : -count)) + " ");
            }
            System.out.println();
        } else {
            System.out.println("Invalid option. Please select 1 or 2.");
        }

        in.close();
    }
}
