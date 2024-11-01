package _4_StringHandling;

import java.util.*;

// Made by Khraos on 19-10-2024
// System time is: 12:53 and the day is: Sat

public class bit9question3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your name (max 3 words): ");
        String n = in.nextLine();

        if (wC(n) > 3) {
            System.out.println("Error: Max 3 words.");
        } else {
            System.out.println("Initials: " + gI(n));
        }
        in.close();
    }

    public static String gI(String name) {
        String in = "";
        boolean startWord = true;
        for (int i = 0; i < name.length(); i++) {
            char c = name.charAt(i);
            if (c == ' ') startWord = true;
            else if (startWord) {
                in += c + ".";
                startWord = false;
            }
        }
        return in;
    }

    public static int wC(String name) {
        int c = 0;
        boolean iW = false;
        for (int i = 0; i < name.length(); i++) {
            if (name.charAt(i) == ' ') {
                if (iW) c++;
                iW = false;
            } else iW = true;
        }
        return iW ? c + 1 : c;
    }
}