package _3_Arrays;

import java.util.*;

// Made by Khraos on 31-10-2024
// System time is: 12:08 and the day is: Thu

public class bit7question16 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] m = new int[5][6]; // 5 stores and 6 departments
        int[] storeSales = new int[5]; // Array to store monthly sales for each store
        int[] departmentSales = new int[6]; // Array to store monthly sales for each department

        // Input the monthly rates
        System.out.println("Enter the monthly rates for each store and department (5 stores, 6 departments):");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print("Store " + (i + 1) + ", Department " + (j + 1) + ": ");
                m[i][j] = in.nextInt();
            }
        }

        // Calculate the monthly sales for each store and department
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 6; j++) {
                storeSales[i] += m[i][j]; // Sum for each store
                departmentSales[j] += m[i][j]; // Sum for each department
            }
        }

        // Display monthly sales for each store
        System.out.println("\nMonthly Sales for Each Store:");
        for (int i = 0; i < 5; i++) {
            System.out.println("Store " + (i + 1) + ": " + storeSales[i]);
        }

        // Display monthly sales for each department
        System.out.println("\nMonthly Sales for Each Department:");
        for (int j = 0; j < 6; j++) {
            System.out.println("Department " + (j + 1) + ": " + departmentSales[j]);
        }

        in.close();
    }
}
