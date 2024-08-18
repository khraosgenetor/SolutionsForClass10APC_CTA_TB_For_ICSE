package User_Defined_Methods;

import java.util.Scanner;

class Comparator {

    public void compare(int a, int b) {
        if (a > b) {
            System.out.println("The greater integer is: " + a);
        } else if (b > a) {
            System.out.println("The greater integer is: " + b);
        } else {
            System.out.println("Both integers are equal.");
        }
    }

    public void compare(char ch1, char ch2) {
        if (ch1 > ch2) {
            System.out.println("The character with greater ASCII value is: " + ch1);
        } else if (ch2 > ch1) {
            System.out.println("The character with greater ASCII value is: " + ch2);
        } else {
            System.out.println("Both characters are equal.");
        }
    }

    public void compare(String str1, String str2) {
        if (str1.length() > str2.length()) {
            System.out.println("The longer string is: " + str1);
        } else if (str2.length() > str1.length()) {
            System.out.println("The longer string is: " + str2);
        } else {
            System.out.println("Both strings have the same length.");
        }
    }
}

public class bit7question19 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Comparator comparator = new Comparator();

        System.out.print("Enter first integer: ");
        int int1 = in.nextInt();
        System.out.print("Enter second integer: ");
        int int2 = in.nextInt();
        comparator.compare(int1, int2);

        System.out.print("Enter first character: ");
        char char1 = in.next().charAt(0);
        System.out.print("Enter second character: ");
        char char2 = in.next().charAt(0);
        comparator.compare(char1, char2);

        in.nextLine(); // Clear the buffer
        System.out.print("Enter first string: ");
        String str1 = in.nextLine();
        System.out.print("Enter second string: ");
        String str2 = in.nextLine();
        comparator.compare(str1, str2);

        in.close();
    }
}