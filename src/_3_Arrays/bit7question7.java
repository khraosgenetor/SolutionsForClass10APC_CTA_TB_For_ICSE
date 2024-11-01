package _3_Arrays;

import java.util.*;

// Made by Khraos on 31-10-2024
// System time is: 11:36 and the day is: Thu

public class bit7question7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] numbers = new int[20];

        // Input 20 numbers
        System.out.println("Enter 20 numbers:");
        for (int i = 0; i < 20; i++) {
            numbers[i] = in.nextInt();
        }

        // Sort the first 10 numbers in ascending order using bubble sort
        bubbleSortAscending(numbers, 0, 10);

        // Sort the last 10 numbers in descending order using bubble sort
        bubbleSortDescending(numbers, 10, 20);

        // Display sorted array
        System.out.println("Sorted array:");
        for (int i = 0; i < 20; i++) {
            System.out.print(numbers[i] + " ");
        }

        in.close();
    }

    // Bubble sort for ascending order
    private static void bubbleSortAscending(int[] arr, int start, int end) {
        for (int i = start; i < end - 1; i++) {
            for (int j = start; j < end - 1 - i + start; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    // Bubble sort for descending order
    private static void bubbleSortDescending(int[] arr, int start, int end) {
        for (int i = start; i < end - 1; i++) {
            for (int j = start; j < end - 1 - i + start; j++) {
                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
