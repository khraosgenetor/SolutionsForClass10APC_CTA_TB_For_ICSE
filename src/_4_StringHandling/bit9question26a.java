package _4_StringHandling;

import java.util.*;

// Made by Khraos on 02-11-2024
// System time is: 09:33 and the day is: Sat

public class bit9question26a {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String[] n = new String[20];
        String[] no = new String[20];

        System.out.println("Enter 20 friends' names and their telephone numbers:");

        for (int i = 0; i < 20; i++) {
            System.out.print("Name " + (i + 1) + ": ");
            n[i] = in.nextLine();
            System.out.print("Telephone Number " + (i + 1) + ": ");
            no[i] = in.nextLine().substring(0, 10);
        }

        // Sorting both arrays by names in ascending alphabetical order
        for (int i = 0; i < 19; i++) {
            for (int j = i + 1; j < 20; j++) {
                if (n[i].compareTo(n[j]) > 0) {
                    // Swap names
                    String temp = n[i];
                    n[i] = n[j];
                    n[j] = temp;

                    // Swap corresponding telephone numbers
                    temp = no[i];
                    no[i] = no[j];
                    no[j] = temp;
                }
            }
        }

        System.out.println("\nSorted List of Names and Telephone Numbers:");
        for (int i = 0; i < 20; i++) {
            System.out.println("Name: " + n[i] + ", Telephone Number: " + no[i]);
        }

        in.close();
    }
}
