package _3_Arrays;

import java.util.*;

// Made by Khraos on 31-10-2024
// System time is: 11:56 and the day is: Thu

public class bit7question14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int n = in.nextInt(); // Input number of students
        int[] rollNumbers = new int[n];
        String[] names = new String[n];
        int[] marks1 = new int[n];
        int[] marks2 = new int[n];
        int[] marks3 = new int[n];
        double[] averages = new double[n];

        // Input roll numbers, names, and marks
        for (int i = 0; i < n; i++) {
            System.out.print("Enter roll number for student " + (i + 1) + ": ");
            rollNumbers[i] = in.nextInt();
            in.nextLine(); // Consume newline
            System.out.print("Enter name for student " + (i + 1) + ": ");
            names[i] = in.nextLine();
            System.out.print("Enter marks for subject 1: ");
            marks1[i] = in.nextInt();
            System.out.print("Enter marks for subject 2: ");
            marks2[i] = in.nextInt();
            System.out.print("Enter marks for subject 3: ");
            marks3[i] = in.nextInt();
        }

        // Display the results
        System.out.println("\nRoll No\tAvg\tRemarks");
        for (int i = 0; i < n; i++) {
            averages[i] = (marks1[i] + marks2[i] + marks3[i]) / 3.0;
            System.out.print(rollNumbers[i] + "\t" + averages[i] + "\t");

            if (averages[i] >= 85) {
                System.out.println("Excellent");
            } else if (averages[i] >= 75) {
                System.out.println("Distinction");
            } else if (averages[i] >= 60) {
                System.out.println("First Class");
            } else if (averages[i] >= 40) {
                System.out.println("Pass");
            } else {
                System.out.println("Poor");
            }
        }

        in.close();
    }
}
