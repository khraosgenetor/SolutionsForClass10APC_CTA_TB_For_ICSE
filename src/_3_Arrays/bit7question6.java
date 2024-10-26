package _3_Arrays;

import java.util.Scanner;

/**
 * This class contains methods for storing and processing student grades.
 */
class StudentGrades {

    /**
     * Stores roll numbers, names, and marks of students in separate arrays.
     *
     * @param rollNumbers An array to store roll numbers.
     * @param names An array to store student names.
     * @param marks An array to store marks of students.
     * The marks are stored in a single array with each student's marks
     * followed by their total marks at the end.
     */
    public static void storeData(int[] rollNumbers, String[] names, int[] marks) {
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < rollNumbers.length; i++) {
            System.out.print("Enter roll number for student " + (i + 1) + ": ");
            rollNumbers[i] = in.nextInt();
            in.nextLine();
            System.out.print("Enter name for student " + (i + 1) + ": ");
            names[i] = in.nextLine();
            System.out.println("Enter marks for 6 subjects:");

            int totalMarks = 0; // To store the total marks for percentage calculation
            for (int j = 0; j < 6; j++) {
                System.out.print("Subject " + (j + 1) + ": ");
                int mark = in.nextInt();
                marks[i * 7 + j] = mark; // Store marks in a single array
                totalMarks += mark; // Accumulate total marks
            }

            // Store the total marks for the student in the last index of the marks array
            marks[i * 7 + 6] = totalMarks; // Store total marks
        }
        in.close();
    }

    /**
     * Calculates the percentage of marks for a given student.
     *
     * @param marks An array containing marks of students.
     * @param studentIndex The index of the student in the marks array.
     * @return The percentage of marks for the student.
     */
    public static double calculatePercentage(int[] marks, int studentIndex) {
        int totalMarks = marks[studentIndex * 7 + 6]; // Get total marks stored
        return (totalMarks / 6.0); // Calculate percentage
    }

    /**
     * Calculates the grade based on the percentage of marks.
     *
     * @param percentage The percentage of marks.
     * @return The grade corresponding to the percentage.
     */
    public static char calculateGrade(double percentage) {
        if (percentage >= 80) {
            return 'A';
        } else if (percentage >= 60) {
            return 'B';
        } else if (percentage >= 40) {
            return 'C';
        } else {
            return 'D';
        }
    }
}

/**
 * This class contains the main method to run the program.
 * It initializes arrays for storing roll numbers, names, and marks.
 * It calls the storeData method to input student data,
 * then calculates and displays the results.
 */
public class bit7question6 {

    public static void main(String[] args) {
        int numStudents = 100; // Number of students
        int[] rollNumbers = new int[numStudents];
        String[] names = new String[numStudents];
        int[] marks = new int[numStudents * 7]; // 6 subjects + 1 for total marks

        StudentGrades.storeData(rollNumbers, names, marks); // Store data

        // Display results
        System.out.println("\nResults:");
        for (int i = 0; i < numStudents; i++) {
            double percentage = StudentGrades.calculatePercentage(marks, i);
            char grade = StudentGrades.calculateGrade(percentage);
            System.out.printf("Roll No: %d, Name: %s, Percentage: %.2f%%, Grade: %c%n",
                    rollNumbers[i], names[i], percentage, grade);
        }
    }
}
