package _4_StringHandling;

import java.util.*;

public class bit9question1 {

    static int wC(String s) {
        int c = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ' ' && (i == 0 || s.charAt(i - 1) == ' ')) c++;
        }
        return c;
    }

    static int lC(String s) {
        int c = 0;
        for (int i = 0; i < s.length(); i++) {
            if (Character.isLetter(s.charAt(i))) c++;
        }
        return c;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String i = in.nextLine();
        System.out.println("Number of words: " + wC(i));
        System.out.println("Number of letters: " + lC(i));
        in.close();
    }
}
