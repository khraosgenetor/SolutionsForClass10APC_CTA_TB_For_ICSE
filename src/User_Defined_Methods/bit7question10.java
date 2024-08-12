package User_Defined_Methods;

import java.util.Scanner;

public class bit7question10 {

    public static void Display(String str) {
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            // Check if the character is a consonant
            if (Character.isLetter(ch) && !(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                    ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')) {
                System.out.println(ch);
            }
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String word = in.nextLine();

        Display(word);
    }
}
