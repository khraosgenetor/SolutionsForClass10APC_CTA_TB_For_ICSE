package _4_StringHandling;

import java.util.*;

// Made by Khraos on 31-10-2024
// System time is: 02:49 and the day is: Thu

public class bit9question17 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inp = in.nextLine().toUpperCase();

        int dLC = 0;
        int len = inp.length();

        for (int i = 0; i < len - 1; i++) {
            if (inp.charAt(i) == inp.charAt(i + 1)) {
                dLC++;
                while (i < len - 1 && inp.charAt(i) == inp.charAt(i + 1)) {
                    i++;
                }
            }
        }

        System.out.println("Double letter sequences: " + dLC);

        in.close();
    }
}
