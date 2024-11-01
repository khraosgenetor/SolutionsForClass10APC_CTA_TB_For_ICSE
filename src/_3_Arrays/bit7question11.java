package _3_Arrays;

import java.util.*;

// Made by Khraos on 31-10-2024
// System time is: 11:44 and the day is: Thu

public class bit7question11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] rollNo = new int[50];
        int[] subjectA = new int[50];
        int[] subjectB = new int[50];
        int[] subjectC = new int[50];
        double[] averages = new double[50];

        // Input data for each student
        for (int i = 0; i < 50; i++) {
            System.out.print("Enter roll number: ");
            rollNo[i] = in.nextInt();
            System.out.print("Enter marks for Subject A: ");
            subjectA[i] = in.nextInt();
            System.out.print("Enter marks for Subject B: ");
            subjectB[i] = in.nextInt();
            System.out.print("Enter marks for Subject C: ");
            subjectC[i] = in.nextInt();

            // Calculate average
            averages[i] = (subjectA[i] + subjectB[i] + subjectC[i]) / 3.0;
        }

        // Display all students' roll numbers and their averages
        System.out.println("\nAll Students' Averages:");
        for (int i = 0; i < 50; i++) {
            System.out.println("Roll No: " + rollNo[i] + ", Average: " + averages[i]);
        }

        // Display students with average > 80
        System.out.println("\nStudents with average > 80:");
        for (int i = 0; i < 50; i++) {
            if (averages[i] > 80) {
                System.out.println("Roll No: " + rollNo[i] + ", Average: " + averages[i]);
            }
        }

        // Display students with average < 80
        System.out.println("\nStudents with average < 80:");
        for (int i = 0; i < 50; i++) {
            if (averages[i] < 80) {
                System.out.println("Roll No: " + rollNo[i] + ", Average: " + averages[i]);
            }
        }

        in.close();
    }
}
