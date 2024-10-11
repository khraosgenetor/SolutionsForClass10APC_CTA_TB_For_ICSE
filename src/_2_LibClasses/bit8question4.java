package _2_LibClasses;

import java.util.Scanner;

public class bit8question4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        typeCheck tc = new typeCheck();
        String str;
        boolean retry = true;

        while (retry) {
            System.out.print("Enter a string of 20 chars: ");
            str = in.nextLine();

            if (str.length() != 20) {
                System.out.println("Error. The string must be exactly 20 characters long. ");
            } else {
                String nStr = str.toUpperCase();
                System.out.println("The string after converting into Uppercase: " + nStr);
                int cC = 0, vC = 0;

                for (int i = 0; i < nStr.length(); i++) {
                    int r = tc.typeCheck(nStr.charAt(i));
                    if (r == 0) {
                        vC++;
                    } else if (r == 1) {
                        cC++;
                    }
                }

                System.out.println("The number of vowels: " + vC);
                System.out.println("The number of consonants: " + cC);
            }

            System.out.print("Do you wish to retry? (Y/N): ");
            char choice = in.next().charAt(0);
            in.nextLine();

            retry = (choice == 'Y' || choice == 'y');
        }

        in.close();
    }
}

class typeCheck {
    int typeCheck(char ch) {
        if (Character.isDigit(ch)) {
            return 2;
        } else if (ch >= 'A' && ch <= 'Z') {
            if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                return 0;
            } else {
                return 1;
            }
        } else if (ch >= 'a' && ch <= 'z') {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                return 0;
            } else {
                return 1;
            }
        }
        return -1;
    }
}
