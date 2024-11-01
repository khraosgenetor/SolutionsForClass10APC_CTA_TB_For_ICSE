package _4_StringHandling;

import java.util.*;

// Made by Khraos on 30-10-2024
// System time is: 16:21 and the day is: Wed

public class bit9question9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String inp = in.nextLine();
        String p = "";
        String cW = "";

        for (int i = 0; i <= inp.length(); i++) {
            if (i < inp.length() && inp.charAt(i) != ' ') {
                cW += inp.charAt(i);
            } else {
                if (isPalindrome(cW)) {
                    p += cW + " ";
                }
                cW = "";
            }
        }

        System.out.println("Palindromes: " + p.trim());
        in.close();
    }

    private static boolean isPalindrome(String w) {
        String r = "";
        for (int i = w.length() - 1; i >= 0; i--) {
            r += w.charAt(i);
        }
        return w.equalsIgnoreCase(r);
    }
}
