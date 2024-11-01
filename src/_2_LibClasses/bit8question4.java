package _2_LibClasses;

import java.util.Scanner;

public class bit8question4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        typeCheck tc = new typeCheck();
        String str = "";

        System.out.print("Enter a string of 20 characters: ");
        str += in.nextLine().substring(0, 20).toUpperCase();

        int cC = 0, vC = 0;

        for (int i = 0; i < str.length(); i++) {
            int r = tc.typeCheck(str.charAt(i));
            if (r == 0) {
                vC++;
            } else if (r == 1) {
                cC++;
            }
        }

        System.out.println("The number of vowels: " + vC);
        System.out.println("The number of consonants: " + cC);
    }
}

class typeCheck {
    int typeCheck(char ch) {
        if (Character.isLetter(ch)) {
            if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                return 0; // Vowel
            } else {
                return 1; // Consonant
            }
        }
        return -1; // Not a letter
    }
}