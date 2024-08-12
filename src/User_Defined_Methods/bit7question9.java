package User_Defined_Methods;

import java.util.Scanner;

public class bit7question9 {

    public static void Palin(String str) {
        int len = str.length();
        boolean isPalindrome = true;

        for (int i = 0; i < len / 2; i++) {
            if (str.charAt(i) != str.charAt(len - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println("The string is a palindrome");
        } else {
            System.out.println("The string is not a palindrome");
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String word = in.nextLine();

        Palin(word);
    }
}
