package _2_LibClasses;

import java.util.Scanner;

// Made by Khraos on 11-10-2024
// System time is: 20:28 and the day is: Fri

public class bit8question10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean retry = true;

        while (retry) {
            System.out.println("Menu:");
            System.out.println("1. Display the first 5 uppercase letters (A to E)");
            System.out.println("2. Display the last 5 lowercase letters (v to z)");
            System.out.print("Please select an option (1 or 2): ");
            int choice = in.nextInt();
            in.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    System.out.println("First 5 uppercase letters:");
                    for (char ch = 'A'; ch <= 'E'; ch++) {
                        System.out.print(ch + " ");
                    }
                    System.out.println();
                    break;
                case 2:
                    System.out.println("Last 5 lowercase letters:");
                    for (char ch = 'v'; ch <= 'z'; ch++) {
                        System.out.print(ch + " ");
                    }
                    System.out.println();
                    break;
                default:
                    System.out.println("Invalid option. Please select 1 or 2.");
                    break;
            }

            System.out.print("Do you wish to retry? (Yy/Nn): ");
            char retryChoice = in.next().charAt(0);
            retry = (retryChoice == 'Y' || retryChoice == 'y');
        }

        in.close();
    }
}
