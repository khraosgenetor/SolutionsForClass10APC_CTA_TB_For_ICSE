package _3_Arrays;

import java.util.*;

// Made by Khraos on 31-10-2024
// System time is: 11:51 and the day is: Thu

public class bit7question12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Create two SDAs
        int[] P = new int[6];
        int[] Q = new int[4];

        // Input values for array P
        System.out.println("Enter 6 elements for array P:");
        for (int i = 0; i < P.length; i++) {
            P[i] = in.nextInt();
        }

        // Input values for array Q
        System.out.println("Enter 4 elements for array Q:");
        for (int i = 0; i < Q.length; i++) {
            Q[i] = in.nextInt();
        }

        // Create array R and combine values from P and Q
        int[] R = new int[10];
        for (int i = 0; i < P.length; i++) {
            R[i] = P[i]; // Fill R with values from P
        }
        for (int i = 0; i < Q.length; i++) {
            R[i + P.length] = Q[i]; // Fill the remaining part of R with values from Q
        }

        // Display array R
        System.out.println("Array R:");
        for (int i = 0; i < R.length; i++) {
            System.out.print(R[i] + " ");
        }

        in.close();
    }
}
