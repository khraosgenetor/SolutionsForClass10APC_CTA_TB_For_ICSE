package _3_Arrays;

import java.util.Scanner;

public class bit7question6 {

    public static void main(String[] args) {
        int n = 100;
        int[] rNO = new int[n];
        String[] name = new String[n];
        int[] marks = new int[n * 7];

        Scanner in = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.print("Enter roll number for student " + (i + 1) + ": ");
            rNO[i] = in.nextInt();
            in.nextLine();
            System.out.print("Enter name for student " + (i + 1) + ": ");
            name[i] = in.nextLine();

            int total = 0;
            System.out.println("Enter marks for 6 subjects:");
            for (int j = 0; j < 6; j++) {
                System.out.print("Subject " + (j + 1) + ": ");
                marks[i * 7 + j] = in.nextInt();
                total += marks[i * 7 + j];
            }
            marks[i * 7 + 6] = total;
        }
        in.close();

        System.out.println("\nResults:");
        for (int i = 0; i < n; i++) {
            double p = marks[i * 7 + 6] / 6.0;
            char g; //grade
            if (p >= 80) g = 'A';
            else if (p >= 60) g = 'B';
            else if (p >= 40) g = 'C';
            else g = 'D';

            System.out.println("Roll No: " + rNO[i]);
            System.out.println("Name: " + name[i]);
            System.out.println("Percentage: " + p + "%");
            System.out.println("Grade: " + g);
            System.out.println();
        }
    }
}