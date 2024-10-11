package _2_LibClasses;

import java.util.Scanner;

// Made by Khraos on 11-10-2024
// System time is: 20:13 and the day is: Fri

public class bit8question7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean retry = true;

        while (retry) {
            System.out.print("Enter 10 integers w/o a space: ");
            String inp = in.next();

            if (inp.length() != 10) {
                System.out.println("Wrong number of integers. The number of integers is: " + inp.length());
            } else {
                int sum = 0, product = 1;

                for (int i = 0; i < inp.length(); i++) {
                    int digit = inp.charAt(i) - '0';  // Convert char to int
                    sum += digit;
                    product *= digit;
                }

                String concat = "" + sum + product; // Concatenate sum and product as strings

                System.out.println("The Sum is: " + sum);
                System.out.println("The Product is: " + product);
                System.out.println("The concatenation of the Sum and Product is: " + concat);
            }

            System.out.print("Do you wish to retry? (Yy/Nn): ");
            char choice = in.next().charAt(0);

            retry = (choice == 'Y' || choice == 'y');
        }

        in.close();
    }
}
