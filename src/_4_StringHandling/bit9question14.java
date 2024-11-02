package _4_StringHandling;

import java.util.*;

// Made by Khraos on 30-10-2024
// System time is: 16:50 and the day is: Wed

public class bit9question14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inp = in.nextLine();

        String r = "";

        for (int i = 0; i < inp.length(); i++) {
            char cC = inp.charAt(i);
            char nC = cC;

            if (Character.isLetter(cC)) {
                char pC = (char) (cC - 1);

                if (!isVowel(cC)) {
                    // If the previous character is a vowel, replace with ASCII + 1
                    if (isVowel(pC)) {
                        nC = (char) (cC + 1);
                    } else {
                        // Replace with ASCII - 1
                        nC = (char) (cC - 1);
                    }
                }
            }

            r += nC; // Append the modified character to the result
        }

        System.out.println("Output: " + r);
        in.close();
    }

    private static boolean isVowel(char c) {
        return "AEIOUaeiou".indexOf(c) != -1;   
    }
}
