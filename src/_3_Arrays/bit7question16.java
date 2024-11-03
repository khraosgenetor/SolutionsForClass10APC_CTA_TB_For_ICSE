package _3_Arrays;

import java.util.*;

// Made by Khraos on 31-10-2024
// System time is: 12:08 and the day is: Thu

public class bit7question16 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] sales = new int[5][6]; // 5 stores and 6 departments
        int[] storeTotals = new int[5]; // Store totals
        int[] deptTotals = new int[6]; // Department totals

        // Input monthly sales
        System.out.println("Enter monthly sales for each store and department (5 stores, 6 departments):");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print("Store " + (i + 1) + ", Dept " + (j + 1) + ": ");
                sales[i][j] = in.nextInt();
            }
        }

        // Calculate totals
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 6; j++) {
                storeTotals[i] += sales[i][j];
                deptTotals[j] += sales[i][j];
            }
        }

        // Display totals
        System.out.println("\nMonthly Sales for Each Store:");
        for (int i = 0; i < 5; i++) {
            System.out.println("Store " + (i + 1) + ": " + storeTotals[i]);
        }

        System.out.println("\nMonthly Sales for Each Department:");
        for (int j = 0; j < 6; j++) {
            System.out.println("Dept " + (j + 1) + ": " + deptTotals[j]);
        }

        in.close();
    }
}
