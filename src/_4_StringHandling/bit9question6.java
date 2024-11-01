package _4_StringHandling;

import java.util.*;

// Made by Khraos on 30-10-2024
// System time is: 16:15 and the day is: Wed

public class bit9question6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String inp = in.next();

        for (int i = 0; i < inp.length(); i++) {
            char c = inp.charAt(i);
            System.out.println(c + ": " + (int) c);
        }

        in.close();
    }
}
