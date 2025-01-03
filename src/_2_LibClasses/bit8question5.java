package _2_LibClasses;

import java.util.Scanner;

// Made by Khraos on 11-10-2024
// System time is: 19:58 and the day is: Fri

public class bit8question5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int inp;
        System.out.print("Enter an integer between 0 to 27 (0 and 27 are exclusive): ");
        inp = in.nextInt();

        if(!(inp > 0 && inp < 27)) {
            System.out.print("Error. Integer must be between 0 and 27. Int provided is: "+inp);
        } else {
            char ch = (char) ('A' + (inp - 1));
            System.out.println("The character for ASCII value "+inp+" is: "+ch);
        }

        in.close();
    }
}
