package _5_User_Defined_Methods.Single_Class;

import java.util.Scanner;

public class bit7question22 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a string to check if it starts with a specific character: ");
        String str1 = in.nextLine();
        System.out.print("Enter a character: ");
        char ch = in.next().charAt(0);
        bit7question22.display(str1, ch);

        in.nextLine(); // Clear the buffer
        System.out.print("Enter the first string to compare: ");
        String str2 = in.nextLine();
        System.out.print("Enter the second string to compare: ");
        String str3 = in.nextLine();
        bit7question22.display(str2, str3);

        System.out.print("Enter a string to get the character at a specific pos: ");
        String str4 = in.nextLine();
        System.out.print("Enter the pos (0-indexed): ");
        int pos = in.nextInt();
        bit7question22.display(str4, pos);

        in.close();
    }

    // Method to check if str has ch at the beginning
    public static void display(String str, char ch) {
        if (!(str.isEmpty()) && str.charAt(0) == ch) {
            System.out.println("Special Word: " + str);
        } else {
            System.out.println("Not a Special Word.");
        }
    }

    // Method to check if two strings are equal
    public static void display(String str1, String str2) {
        if (str1.equals(str2)) {
            System.out.println("The two strings are equal.");
        } else {
            System.out.println("The two strings are not equal.");
        }
    }

    // Method to print character at nth position
    public static void display(String str, int n) {
        if (n >= 0 && n < str.length()) {
            System.out.println("Character at position " + n + ": " + str.charAt(n));
        } else {
            System.out.println("Invalid position: " + n);
        }
    }
}
