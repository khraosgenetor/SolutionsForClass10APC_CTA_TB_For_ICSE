package _7_Constructors;

import java.util.Scanner;

class Hcflcm {
    int a, b;
    Hcflcm(int x, int y) {
        a = x;
        b = y;
    }
    void calculate() {
        int hcf = 0, lcm = 0;
        for (int i = 1; i <= Math.min(a, b); i++) {
            if (a % i == 0 && b % i == 0) hcf = i;
        }
        lcm = a * b / hcf;
        System.out.println("The HCF of " + a + " and " + b + " is: " + hcf);
        System.out.println("The LCM of " + a + " and " + b + " is: " + lcm);
    }
}

public class bit6question1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int a = in.nextInt();
        System.out.print("Enter the second number: ");
        int b = in.nextInt();
        Hcflcm hl = new Hcflcm(a, b);
        hl.calculate();
    }
}
