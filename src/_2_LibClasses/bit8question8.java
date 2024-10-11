package _2_LibClasses;

import java.util.*;

// Made by Khraos on 11-10-2024
// System time is: 20:24 and the day is: Fri

public class bit8question8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean retry = true;

        while (retry) {
            System.out.println("Menu:");
            System.out.println("1. Generate uppercase letters from Z to A");
            System.out.println("2. Generate lowercase letters from a to z");
            System.out.println("3. Exit");
            System.out.print("Enter your choice (1, 2, or 3): ");
            int choice = in.nextInt();
            in.nextLine();

            switch (choice) {
                case 1:
                    generateUppercaseZtoA();
                    break;
                case 2:
                    generateLowercaseAtoZ();
                    break;
                case 3:
                    retry = false;
                    System.out.println("Exiting the program.");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter 1, 2, or 3.");
            }

            if (retry) {
                System.out.print("Do you wish to retry? (Yy/Nn): ");
                char retryChoice = in.next().charAt(0);
                in.nextLine();
                retry = (retryChoice == 'Y' || retryChoice == 'y');
            }
        }
        in.close();
    }

    private static void generateUppercaseZtoA() {
        for (char ch = 'Z'; ch >= 'A'; ch--) {
            System.out.print(ch + " ");
        }
        System.out.println();
    }

    private static void generateLowercaseAtoZ() {
        for (char ch = 'a'; ch <= 'z'; ch++) {
            System.out.print(ch + " ");
        }
        System.out.println();
    }
}
