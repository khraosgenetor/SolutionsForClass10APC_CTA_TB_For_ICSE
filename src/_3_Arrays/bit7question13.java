package _3_Arrays;

import java.util.*;

// Made by Khraos on 31-10-2024
// System time is: 11:53 and the day is: Thu

public class bit7question13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] years = {1982, 1987, 1993, 1996, 1999, 2003, 2006, 2007, 2009, 2010};

        System.out.print("Enter your graduation year: ");
        int year = in.nextInt();

        // Perform binary search
        int left = 0, right = years.length - 1;
        int index = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (years[mid] == year) {
                index = mid;
                break; // Found the year, exit the loop
            }
            left = (years[mid] < year) ? mid + 1 : left;
            right = (years[mid] >= year) ? mid - 1 : right;
        }

        if (index >= 0) {
            System.out.println("Record Exists");
        } else {
            System.out.println("Record Does Not Exist");
        }

        in.close();
    }
}