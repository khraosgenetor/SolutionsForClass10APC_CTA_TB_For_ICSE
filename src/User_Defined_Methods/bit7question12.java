package User_Defined_Methods;

import java.util.Scanner;

public class bit7question12 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Accept employee's name and annual income
        System.out.print("Enter the name of the employee: ");
        String name = in.nextLine();

        System.out.print("Enter the annual income of the employee: ");
        int income = in.nextInt();

        // Call the Tax method
        Tax(name, income);

        in.close();
    }

    public static void Tax(String name, int income) {
        double tax = 0;

        // Calculate tax based on the given tariff
        if (income <= 250000) {
            tax = 0; // No tax
        } else if (income <= 500000) {
            tax = (income - 250000) * 0.10; // 10% of income exceeding 250000
        } else if (income <= 1000000) {
            tax = 30000 + (income - 500000) * 0.20; // 30000 + 20% of the amount exceeding 500000
        } else {
            tax = 50000 + (income - 1000000) * 0.30; // 50000 + 30% of the amount exceeding 1000000
        }

        // Display the result
        System.out.println("Employee Name: " + name);
        System.out.printf("Income Tax: ₹%.2f\n", tax);
    }
}
