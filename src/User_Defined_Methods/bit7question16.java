package User_Defined_Methods;

import java.util.Scanner;

public class bit7question16 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Menu:");
            System.out.println("1. Calculate perimeter of Square");
            System.out.println("2. Calculate perimeter of Rectangle");
            System.out.println("3. Calculate perimeter of Circle");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = in.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the side length of the Square: ");
                    float side = in.nextFloat();
                    System.out.println("Perimeter of Square: " + perimeter(side));
                    break;

                case 2:
                    System.out.print("Enter the length of the Rectangle: ");
                    double length = in.nextDouble();
                    System.out.print("Enter the width of the Rectangle: ");
                    double width = in.nextDouble();
                    System.out.println("Perimeter of Rectangle: " + perimeter(length, width));
                    break;

                case 3:
                    System.out.print("Enter the radius of the Circle: ");
                    double radius = in.nextDouble();
                    System.out.println("Perimeter of Circle: " + perimeter(radius));
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

    public static double perimeter(float side) {
        return (4 * side); // Perimeter of square
    }

    public static double perimeter(double length, double width) {
        return (2 * (length + width)); // Perimeter of rectangle
    }

    public static double perimeter(double radius) {
        return (2 * Math.PI * radius); // Perimeter (circumference) of circle
    }
}
