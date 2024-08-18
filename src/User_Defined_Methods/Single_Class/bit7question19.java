package User_Defined_Methods.Single_Class;

import java.util.Scanner;

public class bit7question19 {

    void compare(int a, int b) {
        if (a != b) {
            System.out.println("The greater integer is: " + Math.max(a, b));
        } else {
            System.out.println("Both integers are equal.");
        }
    }

    void compare(char ch1, char ch2) {
        if (ch1 != ch2) {
            System.out.println("The character with greater ASCII value is: " + Math.max(ch1, ch2));
        } else {
            System.out.println("Both characters are equal.");
        }
    }

    void compare(String str1, String str2) {
        if (str1.length() != str2.length()) {
            System.out.println("The longer string is: " + (str1.length() > str2.length() ? str1 : str2 ));
        } else {
            System.out.println("Both strings have the same length.");
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        bit7question19 comp = new bit7question19();

        System.out.print("Enter first integer: ");
        int int1 = in.nextInt();
        System.out.print("Enter second integer: ");
        int int2 = in.nextInt();
        comp.compare(int1, int2);

        System.out.print("Enter first character: ");
        char char1 = in.next().charAt(0);
        System.out.print("Enter second character: ");
        char char2 = in.next().charAt(0);
        comp.compare(char1, char2);

        in.nextLine(); // Clear the buffer
        System.out.print("Enter first string: ");
        String str1 = in.nextLine();
        System.out.print("Enter second string: ");
        String str2 = in.nextLine();
        comp.compare(str1, str2);

        in.close();
    }
}