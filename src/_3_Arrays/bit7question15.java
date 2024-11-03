package _3_Arrays;

import java.util.*;

// Made by Khraos on 31-10-2024
// System time is: 11:59 and the day is: Thu

public class bit7question15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] N = new int[4][4];
        int evenSum = 0, oddProduct = 1;
        boolean hasOdd = false; // Flag to check if there's at least one odd number

        // Input the elements of the 2D array
        System.out.println("Enter 16 numbers for a 4x4 array:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                N[i][j] = in.nextInt();
                if (N[i][j] % 2 == 0) {
                    evenSum += N[i][j]; // Add to sum if even
                } else {
                    oddProduct *= N[i][j]; // Multiply for odd
                    hasOdd = true; // Set flag if odd number is found
                }
            }
        }

        // Output results
        System.out.println("Sum of all even numbers: " + evenSum);
        System.out.println(hasOdd ? "Product of all odd numbers: " + oddProduct : "No odd numbers were entered.");

        in.close();
    }
}
