package _4_StringHandling;

import java.util.*;

// Made by Khraos on 31-10-2024
// System time is: 11:33 and the day is: Thu

public class bit9question30 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] city = new String[5]; // Array for city names
        String[] stdC = new String[5]; // Array for corresponding STD codes

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter city name: ");
            city[i] = in.next();
            System.out.print("Enter STD code for " + city[i] + ": ");
            stdC[i] = in.next();
        }

        System.out.print("Enter city name to search: ");
        String search = in.next();
        boolean bool = false; // whether found or not **

        for (int i = 0; i < city.length; i++) {
            if (city[i].equalsIgnoreCase(search)) {
                System.out.println("Search successful. STD code of " + city[i] + " is: " + stdC[i]);
                bool = true;
                break;
            }
        }

        if (!bool) {
            System.out.println("Search unsuccessful, no such city in the list.");
        }

        in.close();
    }
}
