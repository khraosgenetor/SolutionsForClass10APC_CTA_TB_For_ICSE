package _3_Arrays;

import java.util.*;

// Made by Khraos on 03-11-2024
// System time is: 18:07 and the day is: Sun

public class bit7question18 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] names = new String[40];
        int[][] marks = new int[40][5];
        String[] subjects = {"ENG", "HIN", "MATHS", "SCIENCE", "COMP"};

        // Input names and marks
        for (int i = 0; i < 40; i++) {
            System.out.print("Enter name of student " + (i + 1) + ": ");
            names[i] = in.nextLine();
            for (int j = 0; j < 5; j++) {
                System.out.print("Enter marks for " + subjects[j] + ": ");
                marks[i][j] = in.nextInt();
            }
            in.nextLine(); // Clear the newline
        }

        // Search and display marks
        System.out.print("Enter the name of the student to display their marks: ");
        String searchName = in.nextLine();
        for (int i = 0; i < 40; i++) {
            if (names[i].equalsIgnoreCase(searchName)) {
                int total = 0;
                System.out.println("Name: " + names[i]);
                for (int mark : marks[i]) {
                    System.out.println("Marks: " + mark);
                    total += mark;
                }
                System.out.println("Total Marks: " + total);
                in.close();
                return;
            }
        }

        System.out.println("Student not found.");
        in.close();
    }
}