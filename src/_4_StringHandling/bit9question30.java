package _4_StringHandling;

import java.util.*;

// Made by Khraos on 31-10-2024
// System time is: 11:33 and the day is: Thu

public class bit9question30 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] cities = new String[5]; // Array for city names
        String[] stdCodes = new String[5]; // Array for corresponding STD codes

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter city name: ");
            cities[i] = in.next();
            System.out.print("Enter STD code for " + cities[i] + ": ");
            stdCodes[i] = in.next();
        }

        System.out.print("Enter city name to search: ");
        String searchCity = in.next();
        boolean found = false;

        for (int i = 0; i < cities.length; i++) {
            if (cities[i].equalsIgnoreCase(searchCity)) {
                System.out.println("Search successful. STD code of " + cities[i] + " is: " + stdCodes[i]);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Search unsuccessful, no such city in the list.");
        }

        in.close();
    }
}
