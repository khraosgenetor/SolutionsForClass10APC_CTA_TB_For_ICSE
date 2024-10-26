package _5_User_Defined_Methods;

import java.util.Scanner;

class DisplayHelper {

    public void display(int num) {
        double sqrt = Math.sqrt(num);
        if (sqrt * sqrt == num) {
            System.out.println(num + " is a perfect square.");
        } else {
            System.out.println(num + " is not a perfect square.");
        }
    }

    // Method to check whether the string contains the character
    public void display(String str, char ch) {
        if (str.indexOf(ch) != -1) {
            System.out.println("The string contains the character '" + ch + "'.");
        } else {
            System.out.println("The string does not contain the character '" + ch + "'.");
        }
    }

    // Method to check and print the number of special characters in the string
    public void display(String str) {
        int sCC = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (!Character.isLetterOrDigit(c) && !Character.isWhitespace(c)) {
                sCC++;
            }
        }
        System.out.println("The number of special characters in the string is: " + sCC);
    }
}


public class bit7question21 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        DisplayHelper dH = new DisplayHelper();

        System.out.print("Enter an integer to check if it's a perfect square: ");
        int num = in.nextInt();
        dH.display(num);

        System.out.print("Enter a string: ");
        in.nextLine(); // Clear the buffer
        String str = in.nextLine();
        System.out.print("Enter a character to check if it is in the string: ");
        char ch = in.next().charAt(0);
        dH.display(str, ch);

        System.out.print("Enter another string to count special characters: ");
        in.nextLine(); // Clear the buffer
        String str2 = in.nextLine();
        dH.display(str2);

        in.close();
    }
}
