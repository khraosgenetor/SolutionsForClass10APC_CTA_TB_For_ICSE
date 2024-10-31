package _7_Constructors;

import java.util.*;

// Made by Khraos on 31-10-2024
// System time is: 04:32 and the day is: Thu

public class bit6question4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Arrange arr = new Arrange();
        arr.accept(in);
        arr.arrange();
        arr.display();
        in.close();
    }
}

class Arrange {
    String str;
    int p, i;
    char ch;

    Arrange() {
        str = "";
        p = i = 0;
        ch = '\u0000';
    }

    void accept(Scanner in) {
        System.out.print("Enter a word: ");
        str = in.nextLine();
        p = str.length();
    }

    void arrange() {
        char[] charArray = new char[p]; // Create a char array of length p

        // Fill the char array with characters from the string
        for (int index = 0; index < p; index++) {
            charArray[index] = str.charAt(index);
        }

        // Sorting the characters using bubble sort based on ASCII values
        for (i = 0; i < p - 1; i++) {
            for (int j = 0; j < p - 1 - i; j++) {
                ch = charArray[j]; // Assign the current character to ch
                // Compare with the next character
                if (ch > charArray[j + 1]) {
                    // Swap using a temporary char variable
                    char temp = ch; // Store current character in temp
                    charArray[j] = charArray[j + 1];
                    charArray[j + 1] = temp;
                }
            }
        }

        // Rebuild the string from the sorted char array
        str = "";
        for (int index = 0; index < p; index++) {
            str += charArray[index]; // Concatenate characters to form the sorted string
        }
    }

    void display() {
        System.out.println("Arranged word: " + str);
    }
}
