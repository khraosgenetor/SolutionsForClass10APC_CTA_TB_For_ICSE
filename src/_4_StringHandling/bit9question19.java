package _4_StringHandling;

// Made by Khraos on 30-10-2024
// System time is: 17:22 and the day is: Wed

import java.util.Scanner;

public class bit9question19 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String inp = in.nextLine().toUpperCase();

        int cLW = 0;

        // Split the sentence into words manually
        int s = 0, len = inp.length();
        for (int i = 0; i <= len; i++) {
            if (i == len || inp.charAt(i) == ' ') {
                String w = inp.substring(s, i);

                // Check for consecutive letters in ascending order
                boolean hCL = false;
                for (int j = 1; j < w.length(); j++) {
                    if (w.charAt(j) - w.charAt(j - 1) == 1) {
                        hCL = true;
                        break;
                    }
                }

                // Print the word and update the count
                System.out.print(w + " ");
                if (hCL) {
                    cLW++;
                }

                s = i + 1; // Move to the next word
            }
        }

        System.out.println("\nConsecutive Lettered Words: " + cLW);

        in.close();
    }
}