package _5_User_Defined_Methods.Single_Class;

import java.util.Scanner;

public class bit7question20 {

    public double series(double n) {
        double sum = 0.0;
        for (int i = 1; i <= n; i++) {
            sum += 1.0 / i;
        }
        return sum;
    }

    public double series(double a, double n) {
        double sum = 0.0;
        for (int i = 0; i < n; i++) {
            double numerator = 1 + 3 * i;
            double denominator = Math.pow(a, 2 + 3 * i);
            sum += numerator / denominator;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        bit7question20 calculator = new bit7question20();

        System.out.print("Enter a positive integer n for the first series: ");
        double n1 = in.nextDouble();
        double result1 = calculator.series(n1);
        System.out.println("Sum of the first series (1/1 + 1/2 + ... + 1/n): " + result1);

        System.out.print("Enter a positive number a for the second series: ");
        double a = in.nextDouble();
        System.out.print("Enter a positive integer n for the second series: ");
        double n2 = in.nextDouble();
        double result2 = calculator.series(a, n2);
        System.out.println("Sum of the second series (1/(a^2) + 4/(a^5) + ...): " + result2);

        in.close();
    }
}
