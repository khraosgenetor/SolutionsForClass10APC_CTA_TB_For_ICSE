package _4_StringHandling;

import java.util.*;

// Made by Khraos on 30-10-2024
// System time is: 17:07 and the day is: Wed

public class bit9question15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String w = in.nextLine();
        int val = calcWordVal(w);
        System.out.println(w + (isHappyWord(val) ? " is a happy word." : " is not a happy word."));
        in.close();
    }

    private static int calcWordVal(String word) {
        int tV = 0;
        for (int i = 0; i < word.length(); i++) {
            char cC = Character.toUpperCase(word.charAt(i));
            if (Character.isLetter(cC)) {
                tV = tV * 100 + (cC - 'A' + 1);
            }
        }
        return tV;
    }

    private static boolean isHappyWord(int n) {
        while (n != 1 && n != 4) { // 4 is a known non-happy number
            n = sumOfSquares(n);
        }
        return n == 1;
    }

    private static int sumOfSquares(int n) {
        int s = 0;
        while (n > 0) {
            int d = n % 10;
            s += d * d;
            n /= 10;
        }
        return s;
    }
}
