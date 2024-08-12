package User_Defined_Methods;

import java.util.Scanner;

public class bit7question11 {

    public static void Change(String str) {
        int length = str.length();
        int startIndex = 0;

        while (startIndex < length) {

            int endIndex = str.indexOf(' ', startIndex);
            if (endIndex == -1) {
                endIndex = length;
            }

            // Get the first character of the current word
            if (endIndex > startIndex) {
                char firstChar = str.charAt(startIndex);
                // Toggle the case and print
                if (Character.isUpperCase(firstChar)) {
                    System.out.println(Character.toLowerCase(firstChar));
                } else {
                    System.out.println(Character.toUpperCase(firstChar));
                }
            }

            startIndex = endIndex + 1;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = in.nextLine();

        Change(input);
    }
}
