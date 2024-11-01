package _4_StringHandling;

import java.util.*;

// Made by Khraos on 30-10-2024
// System time is: 16:23 and the day is: Wed

public class bit9question10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String inp = in.nextLine();

        String r = "";
        String cW = "";

        for (int i = 0; i <= inp.length(); i++) {
            if (i < inp.length() && inp.charAt(i) != ' ') {
                cW += inp.charAt(i); // Build the current word
            } else {
                // Append the current word to the r string
                if (cW.length() > 0) {
                    if (r.length() > 0) {
                        r = cW + " " + r; // Add space before the next word
                    } else {
                        r = cW; // First word, no space needed
                    }
                }
                cW = ""; // Reset current word
            }
        }

        System.out.println("Output: " + r);
        in.close();
    }
}
