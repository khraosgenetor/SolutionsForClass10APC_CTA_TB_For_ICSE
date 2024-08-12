package User_Defined_Methods;

import java.util.Scanner;

class VolumeCalculator {

    // Method to calculate the volume of a sphere
    public double volume(double r) {
        return (4.0 / 3.0) * Math.PI * Math.pow(r, 3);
    }

    // Method to calculate the volume of a cylinder
    public double volume(double h, double r) {
        return Math.PI * Math.pow(r, 2) * h;
    }

    // Method to calculate the volume of a cuboid
    public double volume(double l, double b, double h) {
        return l * b * h;
    }
}

public class bit7question23 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        VolumeCalculator volumeCalculator = new VolumeCalculator();

        System.out.print("Enter the radius of the sphere: ");
        double radius = in.nextDouble();
        double sphereVolume = volumeCalculator.volume(radius);
        System.out.println("Volume of the sphere: " + sphereVolume);

        System.out.print("Enter the height of the cylinder: ");
        double height = in.nextDouble();
        System.out.print("Enter the radius of the cylinder: ");
        double cylinderRadius = in.nextDouble();
        double cylinderVolume = volumeCalculator.volume(height, cylinderRadius);
        System.out.println("Volume of the cylinder: " + cylinderVolume);

        System.out.print("Enter the length of the cuboid: ");
        double length = in.nextDouble();
        System.out.print("Enter the breadth of the cuboid: ");
        double breadth = in.nextDouble();
        System.out.print("Enter the height of the cuboid: ");
        double cuboidHeight = in.nextDouble();
        double cuboidVolume = volumeCalculator.volume(length, breadth, cuboidHeight);
        System.out.println("Volume of the cuboid: " + cuboidVolume);

        in.close();
    }
}
