package _3_Arrays;

import java.util.*;

// Made by Khraos on 31-10-2024
// System time is: 11:45 and the day is: Thu

public class bit7question8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] sda = new int[20];
        int[] even = new int[20];
        int[] odd = new int[20];
        int eC = 0, oC = 0;

        System.out.println("Enter 20 numbers:");
        for (int i = 0; i < 20; i++) {
            sda[i] = in.nextInt();
            if (sda[i] % 2 == 0) {
                even[eC++] = sda[i];
            } else {
                odd[oC++] = sda[i];
            }
        }

        System.out.println("\nEven numbers:");
        for (int i = 0; i < eC; i++) {
            System.out.print(even[i] + " ");
        }

        System.out.println("\nOdd numbers:");
        for (int i = 0; i < oC; i++) {
            System.out.print(odd[i] + " ");
        }

        in.close();
    }
}
