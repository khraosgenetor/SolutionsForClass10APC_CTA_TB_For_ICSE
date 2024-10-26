package _7_Constructors;

import java.util.*;

// Made by Khraos on 19-10-2024
// System time is: 11:58 and the day is: Sat

class Quad {
    float a, b, c, d, r1, r2;
    Quad(int x, int y, int z) {
        a = x;
        b = y;
        c = z;
        d = 0;
    }
    void calculate() {
        d = (float) Math.pow(b, 2) - (4 * a * c);
        if(d < 0) {
            System.out.print("Roots not possible.");
        } else {
            r1 = (-b + (float) Math.sqrt(d)) / (2 * a);
            r2 = (-b - (float) Math.sqrt(d)) / (2 * a);
            System.out.println("Root 1: " + r1);
            System.out.println("Root 2: " + r2);
        }
    }
}

public class bit6question7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x, y, z;
        System.out.print("Enter coefficients a: ");
        x = in.nextInt();
        System.out.print("Enter coefficients b: ");
        y = in.nextInt();
        System.out.print("Enter coefficients c: ");
        z = in.nextInt();
        Quad q = new Quad(x, y, z);
        q.calculate();
        in.close();
    }
}
