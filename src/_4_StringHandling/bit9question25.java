package _4_StringHandling;

import java.util.*;

// Made by Khraos on 31-10-2024
// System time is: 03:50 and the day is: Thu

public class bit9question25 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String[] countries = new String[10];
        String[] capitals = new String[10];

        // Input countries and capitals
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter country " + (i + 1) + ": ");
            countries[i] = in.nextLine();
            System.out.print("Enter capital of " + countries[i] + ": ");
            capitals[i] = in.nextLine();
        }

        // Displaying the header
        System.out.println("Country        Capital");

        // Display countries starting with a vowel
        for (int i = 0; i < 10; i++) {
            char fC = countries[i].charAt(0);
            if ("AEIOUaeiou".indexOf(fC) != -1) {
                System.out.println(countries[i]+"\t"+capitals[i]);
            }
        }

        in.close();
    }
}
