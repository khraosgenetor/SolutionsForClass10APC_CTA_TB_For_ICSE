package _4_StringHandling;

import java.util.*;

// Made by Khraos on 19-10-2024
// System time is: 12:53 and the day is: Sat

public class bit9question2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String w = in.nextLine();
        System.out.println("Word after removing vowels: " + rV(w));
    }

    public static String rV(String w) {
        String r = "";
        for (int c = 0; c < w.length(); c++) {
            char ch = w.charAt(c);
            if ("aeiouAEIOU".indexOf(ch) == -1) r += ch;
        }
        return r;
    }
}
