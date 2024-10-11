package _5_User_Defined_Methods;

import java.util.Scanner;

public class bit7question13 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = in.nextLine();
        First(inputString);
        in.close();
    }

    public static void First(String str) {
        System.out.print("First characters of each word: ");
        int length = str.length();
        boolean isWord = false;

        for (int i = 0; i < length; i++) {
            char currentChar = str.charAt(i);
            if (currentChar == ' ') {
                isWord = false;
            } else if (!isWord) {
                System.out.print(currentChar + " ");
                isWord = true;
            }
        }

        System.out.println();
    }
}
