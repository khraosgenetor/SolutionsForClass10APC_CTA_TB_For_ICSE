package _4_StringHandling;

import java.util.*;

// Made by Khraos on 30-10-2024
// System time is: 16:12 and the day is: Wed

public class bit9question5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a sentence to check the biggest word: ");
        String inp = in.nextLine();
        String lW = "", cW = "";

        for (int i = 0; i <= inp.length(); i++) {
            if (i < inp.length() && inp.charAt(i) != ' ') {
                cW += inp.charAt(i);
            } else {
                if (cW.length() > lW.length()) {
                    lW = cW;
                }
                cW = "";
            }
        }

        System.out.println("Longest word: " + lW);
        System.out.println("Length: " + lW.length());
        in.close();
    }
}