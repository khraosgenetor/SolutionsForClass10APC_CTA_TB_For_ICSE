package LibClasses;

import java.util.*;

// Made by Khraos on 11-10-2024
// System time is: 20:30 and the day is: Fri

public class bit8question11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean retry = true;

        while (retry) {
            System.out.println("Menu:");
            System.out.println("1. Display uppercase letters A to Z with Unicode values");
            System.out.println("2. Display lowercase letters z to a with Unicode values");
            System.out.print("Please select an option (1 or 2): ");
            int choice = in.nextInt();
            in.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    System.out.println("Uppercase letters A to Z with Unicode values:");
                    for (char ch = 'A'; ch <= 'Z'; ch++) {
                        System.out.println(ch + ": " + (int) ch);
                    }
                    break;
                case 2:
                    System.out.println("Lowercase letters z to a with Unicode values:");
                    for (char ch = 'z'; ch >= 'a'; ch--) {
                        System.out.println(ch + ": " + (int) ch);
                    }
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
