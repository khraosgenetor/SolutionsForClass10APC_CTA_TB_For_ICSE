package _3_Arrays;

import java.util.*;

// Made by Khraos on 31-10-2024
// System time is: 11:40 and the day is: Thu

public class bit7question10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] rNO = new int[40];
        int[] engM = new int[40];
        int[] phyM = new int[40];
        int[] chemM = new int[40];
        int[] mathM = new int[40];
        final int PASS = 35;

        // Input roll numbers and marks
        for (int i = 0; i < 40; i++) {
            System.out.print("Enter roll number for student " + (i + 1) + ": ");
            rNO[i] = in.nextInt();

            System.out.print("Enter English, Physics, Chemistry, and Math marks: ");
            engM[i] = in.nextInt();
            phyM[i] = in.nextInt();
            chemM[i] = in.nextInt();
            mathM[i] = in.nextInt();
        }

        // Check promotion eligibility
        System.out.println("\nPromotion Results:");
        for (int i = 0; i < 40; i++) {
            int c = 0;

            if (phyM[i] >= PASS) c++;
            if (chemM[i] >= PASS) c++;
            if (mathM[i] >= PASS) c++;

            System.out.println("Roll No. " + rNO[i] + ": Promotion is " +
                    (engM[i] >= PASS && c >= 2 ? "Granted" : "not Granted"));
        }

        in.close();
    }
}
