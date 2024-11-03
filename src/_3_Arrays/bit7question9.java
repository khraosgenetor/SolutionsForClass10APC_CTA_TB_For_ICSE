package _3_Arrays;

import java.util.*;

// Made by Khraos on 31-10-2024
// System time is: 11:39 and the day is: Thu

public class bit7question9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] numbers = new int[20];

        // Input 20 numbers
        System.out.println("Enter 20 numbers:");
        for (int i = 0; i < 20; i++) {
            numbers[i] = in.nextInt();
        }

        // Display perfect squares
        System.out.println("Perfect square numbers:");
        for (int n : numbers) {
            if ((int) Math.sqrt(n) * (int) Math.sqrt(n) == n) {
                System.out.print(n + " ");
            }
        }


        in.close();
    }
}
