package _3_Arrays;

import java.util.Scanner;

/**
 * This class contains a main method that calculates and prints the average marks and deviations of students.
 * It takes input from the user for the number of students and their respective names and marks.
 * The average marks are then calculated and printed, followed by the deviation of each student from the average.
 */
public class bit7question5 {
    /**
     * The main method that takes input from the user, calculates the average marks and deviations, and prints the results.
     *
     * @param args Command line arguments (not used in this program).
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("How many students are there in a class: ");
        int n = in.nextInt();

        in.nextLine(); // Consume newline character

        double avg = 0.0;
        double[] total = new double[n];
        String[] name = new String[n];

        // Input loop for student names and marks
        for (int i = 0; i < n; i++) {
            System.out.print("Enter name of student " + (i + 1) + ": ");
            name[i] = in.nextLine();
            System.out.print("Enter the marks of " + name[i] + ": ");
            total[i] = in.nextDouble();
            in.nextLine(); // Consume newline character
        }

        // Calculate the average
        for (int i = 0; i < n; i++) {
            avg += total[i];
        }
        avg /= n;

        System.out.println("Class Average: " + avg);

        // Calculate and print deviations
        for (int i = 0; i < n; i++) {
            double deviation = total[i] - avg;
            System.out.println("Deviation of Student " + (i + 1) + "(" + name[i] + ") is: " + deviation);
        }

        in.close(); // Close the scanner
    }
}