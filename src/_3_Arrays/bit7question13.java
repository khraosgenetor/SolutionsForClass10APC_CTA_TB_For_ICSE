package _3_Arrays;

import java.util.*;

// Made by Khraos on 31-10-2024
// System time is: 11:53 and the day is: Thu

public class bit7question13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Predefined array of graduation years
        int[] years = {1982, 1987, 1993, 1996, 1999, 2003, 2006, 2007, 2009, 2010};

        // Input user's graduation year
        System.out.print("Enter your graduation year: ");
        int userYear = in.nextInt();

        // Perform binary search
        Arrays.sort(years); // Ensure the array is sorted for binary search
        int index = Arrays.binarySearch(years, userYear);

        // Check if the year exists
        if (index >= 0) {
            System.out.println("Record Exists");
        } else {
            System.out.println("Record Does Not Exist");
        }

        in.close();
    }
}
