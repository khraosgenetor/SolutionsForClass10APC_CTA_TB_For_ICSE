package _2_LibClasses;

// Made by Khraos on 11-10-2024
// System time is: 20:31 and the day is: Fri

public class bit8question12 {
    public static void main(String[] args) { printAllPatterns(); }

    public static void printAllPatterns() {
        for (int i = 1; i <= 5; i++) {
            char sC = (i % 2 == 1) ? 'A' : 'a';
            for (char ch = sC; ch < sC + i; ch++) {
                System.out.print(ch+" ");
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 5; i > 0; i--) {
            for (char ch = 'Z'; ch >= 'Z' - i + 1; ch--) {
                System.out.print(ch+" ");
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 5; i > 0; i -= 2) {
            for (char ch = 'A'; ch < 'A' + i; ch++) {
                System.out.print(ch+" ");
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i < 4; i++) {
            for (char ch = 'P'; ch <= 'V'; ch += 2) {
                if (ch <= 'V' - i * 2) {
                    System.out.print(ch+" ");
                }
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 5; i > 0; i--) {
            for (char ch = 'A'; ch < 'A' + i; ch++) {
                System.out.print(ch + "*");
            }
            System.out.println();
        }
        System.out.println();
        for (int j = 0; j < 5; j++) {
            System.out.print("a ");
        }
        System.out.println();
        for (int j = 0; j < 5; j++) {
            System.out.print("b ");
        }
        System.out.println();
        for (int j = 0; j < 5; j++) {
            System.out.print("A ");
        }
        System.out.println();
        for (int j = 0; j < 5; j++) {
            System.out.print("B ");
        }
        System.out.println();
    }
}