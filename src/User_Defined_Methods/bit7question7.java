package User_Defined_Methods;

import java.util.Scanner;

public class bit7question7 {

    public static int gcd(int a, int b) {
        while (b != 0) {
            int remainder = a % b;
            a = b;
            b = remainder;
        }
        return a;
    }

    public static int Glcm(int a, int b) {
        int gcdValue = gcd(a, b);
        return (a * b) / gcdValue;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = in.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = in.nextInt();

        int lcm = Glcm(num1, num2);
        System.out.println("The LCM of " + num1 + " and " + num2 + " is: " + lcm);
    }
}
