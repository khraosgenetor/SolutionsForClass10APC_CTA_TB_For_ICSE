package _3_Arrays;

import java.util.Scanner;

// Made by Khraos on 31-10-2024
// System time is: 11:36 and the day is: Thu

public class bit7question7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] n = new int[20];

        // Input 20 numbers
        System.out.println("Enter 20 numbers:");
        for (int i = 0; i < 20; i++) {
            n[i] = in.nextInt();
        }

        // Sort first 10 numbers in ascending order
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9 - i; j++) {
                if (n[j] > n[j + 1]) {
                    int temp = n[j];
                    n[j] = n[j + 1];
                    n[j + 1] = temp;
                }
            }
        }

        // Sort last 10 numbers in descending order
        for (int i = 10; i < 19; i++) {
            for (int j = 10; j < 19 - (i - 10); j++) {
                if (n[j] < n[j + 1]) {
                    int temp = n[j];
                    n[j] = n[j + 1];
                    n[j + 1] = temp;
                }
            }
        }

        // Display sorted array
        System.out.println("Sorted array:");
        for (int i = 0; i < 20; i++) {
            System.out.print(n[i] + " ");
        }

        in.close();
    }
}