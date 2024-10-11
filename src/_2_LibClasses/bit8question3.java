package _2_LibClasses;

// Made by Khraos on 11-10-2024
// System time is: 19:15 and the day is: Fri

public class bit8question3 {
    public static void main(String[] args) {
        char ch = 'A';
        System.out.println("Printing starting from A.");
        System.out.print("The characters are: "+ch);
        for (int i = 2; i < 26; i += 2) {
            ch = (char) ('A' + i);
            System.out.print(" " + ch);
        }
        System.out.println();

        ch = 'B';
        System.out.println("Printing starting from B.");
        System.out.print("The characters are: "+ch);
        for (int i = 2; i < 26; i += 2) {
            ch = (char) ('B' + i);
            System.out.print(" " + ch);
        }
    }
}
