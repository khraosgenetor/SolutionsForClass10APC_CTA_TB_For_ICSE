package _4_StringHandling;

import java.util.*;

// Made by Khraos on 31-10-2024
// System time is: 10:59 and the day is: Thu

public class bit9question27 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] n = new String[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter name " + (i + 1) + ": ");
            n[i] = in.next();
        }

        for (int i = 0; i < n.length - 1; i++)
            for (int j = 0; j < n.length - 1 - i; j++)
                if (n[j].compareTo(n[j + 1]) > 0) {
                    String temp = n[j];
                    n[j] = n[j + 1];
                    n[j + 1] = temp;
                }

        System.out.println("Names in ascending order:");
        for (int i = 0; i < n.length; i++) {
            System.out.println(n[i]);
        }
        in.close();
    }
}
