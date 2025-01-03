package _5_User_Defined_Methods;

import java.util.Scanner;

class Display {
    void Display(String str, int p) {
        if (p == 1) {
            System.out.print("Uppercase characters: ");
            int length = str.length();
            for (int i = 0; i < length; i++) {
                char c = str.charAt(i);
                if (Character.isUpperCase(c)) {
                    System.out.print(c + " ");
                }
            }
        } else {
            System.out.print("Lowercase characters: ");
            int length = str.length();
            for (int i = 0; i < length; i++) {
                char c = str.charAt(i);
                if (Character.isLowerCase(c)) {
                    System.out.print(c + " ");
                }
            }
        }
        System.out.println();
    }

    void Display(String str, char chr) {
        if (chr == 'v') {
            System.out.print("Vowels: ");
            int length = str.length();
            for (int i = 0; i < length; i++) {
                char c = str.charAt(i);
                if ("AEIOUaeiou".indexOf(c) != -1) {
                    System.out.print(c + " ");
                }
            }
        } else {
            System.out.print("All letters: ");
            int length = str.length();
            for (int i = 0; i < length; i++) {
                char c = str.charAt(i);
                if (Character.isLetter(c)) {
                    System.out.print(c + " ");
                }
            }
        }
        System.out.println();
    }
}

public class bit7question17 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Display dis = new Display();

        System.out.print("Enter a string: ");
        String inputString = in.nextLine();

        System.out.print("Enter an integer (1 for uppercase, otherwise lowercase): ");
        int p = in.nextInt();
        dis.Display(inputString, p);

        System.out.print("Enter a character (v for vowels, any other character for all letters): ");
        char chr = in.next().charAt(0);
        dis.Display(inputString, chr);

        in.close();
    }
}
