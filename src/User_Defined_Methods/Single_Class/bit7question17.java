package User_Defined_Methods.Single_Class;

import java.util.Scanner;

public class bit7question17 {
    void Display(String str, int p) {
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if ((p == 1 && Character.isUpperCase(c)) || (p != 1 && Character.isLowerCase(c))) {
                System.out.print(c + " ");
            }
        }
        System.out.println();
    }

    void Display(String str, char chr) {
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if ((chr == 'v' && "AEIOUaeiou".indexOf(c) != -1) ||
                    (chr != 'v' && Character.isLetter(c))) {
                System.out.print(c + " ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        bit7question17 obj = new bit7question17();

        System.out.print("Enter a string: ");
        String inputString = in.nextLine();

        System.out.print("Enter an integer (1 for uppercase, otherwise lowercase): ");
        int p = in.nextInt();
        obj.Display(inputString, p);

        System.out.print("Enter a character (v for vowels, any other character for all letters): ");
        char chr = in.next().charAt(0);
        obj.Display(inputString, chr);

        in.close();
    }
}