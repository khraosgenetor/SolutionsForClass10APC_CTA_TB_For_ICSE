package _4_StringHandling;

import java.util.*;

// Made by Khraos on 31-10-2024
// System time is: 10:59 and the day is: Thu

public class bit9question27 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] names = new String[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter name " + (i + 1) + ": ");
            names[i] = in.next();
        }

        for (int i = 0; i < names.length - 1; i++)
            for (int j = 0; j < names.length - 1 - i; j++)
                if (names[j].compareTo(names[j + 1]) > 0) {
                    String temp = names[j];
                    names[j] = names[j + 1];
                    names[j + 1] = temp;
                }

        System.out.println("Names in ascending order:");
        for (String name : names)
            System.out.println(name);

        in.close();
    }
}
