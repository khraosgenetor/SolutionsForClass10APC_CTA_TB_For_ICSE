package _3_Arrays;

import java.util.*;

// Made by Khraos on 31-10-2024
// System time is: 11:40 and the day is: Thu

public class bit7question10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] rollNumbers = new int[40];
        int[] englishMarks = new int[40];
        int[] physicsMarks = new int[40];
        int[] chemistryMarks = new int[40];
        int[] mathMarks = new int[40];
        final int PASS_MARK = 35;

        // Input roll numbers and marks for each student
        for (int i = 0; i < 40; i++) {
            System.out.print("Enter roll number for student " + (i + 1) + ": ");
            rollNumbers[i] = in.nextInt();

            System.out.print("Enter English marks: ");
            englishMarks[i] = in.nextInt();

            System.out.print("Enter Physics marks: ");
            physicsMarks[i] = in.nextInt();

            System.out.print("Enter Chemistry marks: ");
            chemistryMarks[i] = in.nextInt();

            System.out.print("Enter Math marks: ");
            mathMarks[i] = in.nextInt();
        }

        // Check promotion eligibility for each student
        System.out.println("\nPromotion Results:");
        for (int i = 0; i < 40; i++) {
            int passCount = 0;

            // Check if student passed in English
            boolean passedEnglish = englishMarks[i] >= PASS_MARK;

            // Count the number of other science subjects with passing marks
            if (physicsMarks[i] >= PASS_MARK) passCount++;
            if (chemistryMarks[i] >= PASS_MARK) passCount++;
            if (mathMarks[i] >= PASS_MARK) passCount++;

            // Determine promotion status
            if (passedEnglish && passCount >= 2) {
                System.out.println("Roll No. " + rollNumbers[i] + ": Promotion is Granted");
            } else {
                System.out.println("Roll No. " + rollNumbers[i] + ": Promotion is not Granted");
            }
        }

        in.close();
    }
}
