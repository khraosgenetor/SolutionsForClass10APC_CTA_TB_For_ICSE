package _3_Arrays;

import java.util.*;

// Made by Khraos on 31-10-2024
// System time is: 11:44 and the day is: Thu

public class bit7question11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] rollNo = new int[50];
        int[] subA = new int[50];
        int[] subB = new int[50];
        int[] subC = new int[50];
        double[] total = new double[50];

        // Input data and calculate averages
        for (int i = 0; i < 50; i++) {
            System.out.print("Enter roll number: ");
            rollNo[i] = in.nextInt();
            System.out.print("Enter marks for Subject A, B, and C: ");
            subA[i] = in.nextInt();
            subB[i] = in.nextInt();
            subC[i] = in.nextInt();
            total[i] = (subA[i] + subB[i] + subC[i]) / 3.0;
        }

        // Display all students' averages and categorize by average score
        System.out.println("\nAll Students' Averages:");
        for (int i = 0; i < 50; i++) {
            System.out.println("Roll No: " + rollNo[i] + ", Average: " + total[i]);
        }

        System.out.println("\nStudents with average > 80:");
        for (int i = 0; i < 50; i++) {
            if (total[i] > 80) {
                System.out.println("Roll No: " + rollNo[i] + ", Average: " + total[i]);
            }
        }

        System.out.println("\nStudents with average < 80:");
        for (int i = 0; i < 50; i++) {
            if (total[i] < 80) {
                System.out.println("Roll No: " + rollNo[i] + ", Average: " + total[i]);
            }
        }

        in.close();
    }
}
