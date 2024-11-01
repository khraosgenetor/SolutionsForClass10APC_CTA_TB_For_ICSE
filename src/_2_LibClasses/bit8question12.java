package _2_LibClasses;

// Made by Khraos on 11-10-2024
// System time is: 20:31 and the day is: Fri

public class bit8question12 {
    public static void main(String[] args) {
        printAllPatterns();
    }

    public static void printAllPatterns() {
        printAlternatingCasePattern();
        System.out.println(); // Line break
        printReverseZPattern();
        System.out.println(); // Line break
        printDecreasingAlphabetPattern();
        System.out.println(); // Line break
        printEvenSkippingPattern();
        System.out.println(); // Line break
        printStarredAlphabetPattern();
        System.out.println(); // Line break
        printLowerAndUpperCaseMergedPatterns();
    }

    private static void printAlternatingCasePattern() {
        for (int i = 1; i <= 5; i++) {
            char startChar = (i % 2 == 1) ? 'A' : 'a';
            for (char ch = startChar; ch < startChar + i; ch++) {
                System.out.print(ch);
            }
            System.out.println();
        }
    }

    private static void printReverseZPattern() {
        for (int i = 5; i > 0; i--) {
            for (char ch = 'Z'; ch >= 'Z' - i + 1; ch--) {
                System.out.print(ch);
            }
            System.out.println();
        }
    }

    private static void printDecreasingAlphabetPattern() {
        for (int i = 5; i > 0; i -= 2) {
            for (char ch = 'A'; ch < 'A' + i; ch++) {
                System.out.print(ch);
            }
            System.out.println();
        }
    }

    private static void printEvenSkippingPattern() {
        for (int i = 0; i < 4; i++) {
            for (char ch = 'P'; ch <= 'V'; ch += 2) {
                if (ch <= 'V' - i * 2) {
                    System.out.print(ch);
                }
            }
            System.out.println();
        }
    }

    private static void printStarredAlphabetPattern() {
        for (int i = 5; i > 0; i--) {
            for (char ch = 'A'; ch < 'A' + i; ch++) {
                System.out.print(ch + "*");
            }
            System.out.println();
        }
    }

    private static void printLowerAndUpperCaseMergedPatterns() {
        for (char ch : new char[] {'a', 'b'}) {
            printCharacterMultipleTimes(ch);
        }
        for (char ch : new char[] {'A', 'B'}) {
            printCharacterMultipleTimes(ch);
        }
    }

    private static void printCharacterMultipleTimes(char ch) {
        for (int j = 0; j < 5; j++) {
            System.out.print(ch + " ");
        }
        System.out.println();
    }
}