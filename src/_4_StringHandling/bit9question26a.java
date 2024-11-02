package _4_StringHandling;

import java.util.*;

// Made by Khraos on 02-11-2024
// System time is: 09:33 and the day is: Sat

public class bit9question26a {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String[] names = new String[20];
        String[] telephone = new String[20];

        System.out.println("Enter 20 friends' names and their telephone numbers:");

        for (int i = 0; i < 20; i++) {
            System.out.print("Name " + (i + 1) + ": ");
            names[i] = in.nextLine();
            System.out.print("Telephone Number " + (i + 1) + ": ");
            telephone[i] = in.nextLine();
        }

        // Sorting both arrays by names in ascending alphabetical order
        for (int i = 0; i < 19; i++) {
            for (int j = i + 1; j < 20; j++) {
                if (names[i].compareTo(names[j]) > 0) {
                    // Swap names
                    String tempName = names[i];
                    names[i] = names[j];
                    names[j] = tempName;

                    // Swap corresponding telephone numbers
                    String tempPhone = telephone[i];
                    telephone[i] = telephone[j];
                    telephone[j] = tempPhone;
                }
            }
        }

        System.out.println("\nSorted List of Names and Telephone Numbers:");
        for (int i = 0; i < 20; i++) {
            System.out.println("Name: " + names[i] + ", Telephone Number: " + telephone[i]);
        }

        in.close();
    }
}
