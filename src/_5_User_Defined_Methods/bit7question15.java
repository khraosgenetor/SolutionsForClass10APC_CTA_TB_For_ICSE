package _5_User_Defined_Methods;

import java.util.Scanner;

public class bit7question15 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Menu:");
            System.out.println("1. Calculate area of Parallelogram");
            System.out.println("2. Calculate area of Rhombus");
            System.out.println("3. Calculate area of Trapezoid");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = in.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter base of Parallelogram: ");
                    double base = in.nextDouble();
                    System.out.print("Enter height of Parallelogram: ");
                    double height = in.nextDouble();
                    System.out.println("Area of Parallelogram: " + Area(base, height));
                    break;

                case 2:
                    System.out.print("Enter diagonal 1 of Rhombus: ");
                    double diag1 = in.nextDouble();
                    System.out.print("Enter diagonal 2 of Rhombus: ");
                    float diag2 = in.nextFloat();  // Changed to float
                    System.out.println("Area of Rhombus: " + Area(diag1, diag2));
                    break;

                case 3:
                    System.out.print("Enter length of base 1 of Trapezoid: ");
                    double base1 = in.nextDouble();
                    System.out.print("Enter length of base 2 of Trapezoid: ");
                    double base2 = in.nextDouble();
                    System.out.print("Enter height of Trapezoid: ");
                    double trapHeight = in.nextDouble();
                    System.out.println("Area of Trapezoid: " + Area(base1, base2, trapHeight));
                    break;

                case 4:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }
            System.out.println();
        } while (choice != 4);

        in.close();
    }

    public static double Area(double base, double height) {
        return base * height;
    }

    public static double Area(double diag1, float diag2) {  // Changed to float
        return (diag1 * diag2) / 2;
    }

    public static double Area(double base1, double base2, double height) {
        return ((base1 + base2) * height) / 2;
    }
}
