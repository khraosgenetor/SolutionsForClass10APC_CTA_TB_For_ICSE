package _3_Arrays;

import java.util.*;

// Made by Khraos on 31-10-2024
// System time is: 11:56 and the day is: Thu

public class bit7question14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int n = in.nextInt(); // Input number of students

        int[] rNO = new int[n];
        String[] names = new String[n];
        int[][] marks = new int[n][3];
        double[] averages = new double[n];

        // Input roll numbers, names, and marks
        for (int i = 0; i < n; i++) {
            System.out.print("Enter roll number for student " + (i + 1) + ": ");
            rNO[i] = in.nextInt();
            in.nextLine(); // Consume newline
            System.out.print("Enter name for student " + (i + 1) + ": ");
            names[i] = in.nextLine();
            for (int j = 0; j < 3; j++) {
                System.out.print("Enter marks for subject " + (j + 1) + ": ");
                marks[i][j] = in.nextInt();
            }
        }

        // Display the results
        System.out.println("\nRoll No\tAvg\tRemarks");
        for (int i = 0; i < n; i++) {
            averages[i] = (marks[i][0] + marks[i][1] + marks[i][2]) / 3.0;
            System.out.print(rNO[i] + "\t" + averages[i] + "\t");

            String remark;
            if (averages[i] >= 85) remark = "Excellent";
            else if (averages[i] >= 75) remark = "Distinction";
            else if (averages[i] >= 60) remark = "First Class";
            else if (averages[i] >= 40) remark = "Pass";
            else remark = "Poor";

            System.out.println(remark);
        }

        in.close();
    }
}