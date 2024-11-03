package _3_Arrays;

import java.util.*;

// Made by Khraos on 31-10-2024
// System time is: 11:51 and the day is: Thu

public class bit7question12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] P = new int[6];
        int[] Q = new int[4];
        int[] R = new int[10];

        System.out.println("Enter 6 elements for array P:");
        for (int i = 0; i < P.length; i++)
            P[i] = in.nextInt();

        System.out.println("Enter 4 elements for array Q:");
        for (int i = 0; i < Q.length; i++)
            Q[i] = in.nextInt();

        for (int i = 0; i < R.length; i++)
            R[i] = (i < P.length) ? P[i] : Q[i - P.length];

        System.out.println("Array R:");
        for (int val : R)
            System.out.print(val + " ");

        in.close();
    }
}
