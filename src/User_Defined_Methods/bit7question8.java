package User_Defined_Methods;

import java.util.Scanner;

public class bit7question8 {

    public static void Magic(String str) {
        boolean isMagic = false;

        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) + 1 == str.charAt(i + 1)) {
                isMagic = true;
                break;
            }
        }

        if (isMagic) {
            System.out.println("It is a magic string");
        } else {
            System.out.println("It is not a magic string");
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String word = in.nextLine();

        Magic(word);
    }
}
