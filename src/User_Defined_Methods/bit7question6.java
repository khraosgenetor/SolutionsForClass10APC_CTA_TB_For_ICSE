package User_Defined_Methods;

import java.util.Scanner;

class Area {
    double area (double r) {
        double a = Math.PI * Math.pow(r, 2);
        return a;
    }
    double area (float s) {
        double a = Math.pow(s, 2);
        return a;
    }
    double area (double l, double b) {
        double a = l * b;
        return a;
    }
}

public class bit7question6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Area a = new Area();
        char ch;
        System.out.println("Find area of A) Circle, B) Square, C) Rectangle.");
        System.out.print("Enter your choice: ");
        ch = in.next().charAt(0);
        switch (ch) {
            case 'a':
            case 'A':
                System.out.print("Enter the radius of the circle: ");
                double r = in.nextDouble();
                double ar = a.area(r);
                System.out.println("The area of the circle is: "+ar);
                break;

            case 'b':
            case 'B':
                System.out.print("Enter the side of the square: ");
                float s = in.nextFloat();
                ar = a.area(s);
                System.out.println("The area of the square is: "+ar);
                break;

            case 'c':
            case 'C':
                System.out.print("Enter the length of the rectangle: ");
                double l = in.nextDouble();
                System.out.print("Enter the breadth of the rectangle: ");
                double b = in.nextDouble();
                ar = a.area(l, b);
                System.out.println("The area of the rectangle is: "+ar);
                break;

            default:
                System.err.println("Invalid choice: "+ch);
        }
    }
}
