package _4_StringHandling;

import java.util.*;

// Made by Khraos on 30-10-2024
// System time is: 16:19 and the day is: Wed

public class bit9question8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String inp = in.nextLine();
        String r = ""; // Initialize result as an empty string
        String cW = "";

        for (int i = 0; i <= inp.length(); i++) {
            if (i < inp.length() && inp.charAt(i) != ' ') {
                cW += inp.charAt(i); // Accumulate characters in the current word
            } else {
                if (cW.length() > 0) {
                    r += cW.charAt(0); // Append the first character of the current word
                }
                cW = ""; // Reset currentWord for the next word
            }
        }

        System.out.println("Constructed word: " + r); // Output the constructed word
        in.close();
    }
}
