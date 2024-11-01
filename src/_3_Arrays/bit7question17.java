package _3_Arrays;

import java.util.*;

// Made by Khraos on 31-10-2024
// System time is: 12:13 and the day is: Thu

public class bit7question17 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[][] m = new String[5][10]; // 5 floors and 10 rooms per floor

        // Input visitor names for each room on each floor
        System.out.println("Enter the names of visitors for each room (5 floors, 10 rooms per floor):");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print("Floor " + (i + 1) + ", Room " + (j + 1) + ": ");
                m[i][j] = in.nextLine();
            }
        }

        // Search for a visitor's name
        System.out.print("Enter the name of the visitor to search: ");
        String searchName = in.nextLine();
        boolean found = false;

        // Search through the array
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 10; j++) {
                if (m[i][j].equalsIgnoreCase(searchName)) {
                    System.out.println("Visitor found: " + searchName + " at Floor " + (i + 1) + ", Room " + (j + 1));
                    found = true;
                }
            }
        }

        // If the visitor is not found
        if (!found) {
            System.out.println("Visitor " + searchName + " not found.");
        }

        in.close();
    }
}
