package _2_LibClasses;

import java.util.Scanner;

// Made by Khraos on 11-10-2024
// System time is: 20:08 and the day is: Fri

public class bit8question6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char ch1, ch2;
        System.out.print("Enter 1st Character: ");
        ch1 = in.next().charAt(0);
        System.out.print("Enter 2nd Character: ");
        ch2 = in.next().charAt(0);

        int d = ch1 - ch2;

        if (d == 0) {
            System.out.println("Both the characters are the same.");
        } else if (d < 0) {
            System.out.println("First character is smaller.");
        } else {
            System.out.println("Second character is smaller.");
        }
        in.close();
    }
}
