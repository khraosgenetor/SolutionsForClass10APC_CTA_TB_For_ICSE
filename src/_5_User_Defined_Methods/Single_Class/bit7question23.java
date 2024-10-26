package _5_User_Defined_Methods.Single_Class;

import java.util.Scanner;

public class bit7question23 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the radius of the sphere: ");
        double r = in.nextDouble();
        System.out.println("Volume of the sphere: " + volume(r));

        System.out.print("Enter the height of the cylinder: ");
        double h = in.nextDouble();
        System.out.print("Enter the radius of the cylinder: ");
        double cR = in.nextDouble();
        System.out.println("Volume of the cylinder: " + volume(h, cR));

        System.out.print("Enter the length of the cuboid: ");
        double l = in.nextDouble();
        System.out.print("Enter the breadth of the cuboid: ");
        double b = in.nextDouble();
        System.out.print("Enter the height of the cuboid: ");
        double cuH = in.nextDouble();
        System.out.println("Volume of the cuboid: " + volume(l, b, cuH));

        in.close();
    }

    public static double volume(double r) {
        return (4.0 / 3.0) * Math.PI * Math.pow(r, 3);
    }

    // Method to calculate the volume of a cylinder
    public static double volume(double h, double cR) {
        return Math.PI * Math.pow(cR, 2) * h;
    }

    // Method to calculate the volume of a cuboid
    public static double volume(double l, double b, double cuH) {
        return l * b * cuH;
    }
}