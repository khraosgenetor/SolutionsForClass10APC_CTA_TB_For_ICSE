package User_Defined_Methods;

import java.util.Scanner;

class SeriesCalculator {

    // Method to calculate the first series: sum = 1/1 + 1/2 + 1/3 + ... + 1/n
    public double series(double n) {
        double sum = 0.0;
        for (int i = 1; i <= n; i++) {
            sum += 1.0 / i;
        }
        return sum;
    }

    // Method to calculate the second series: sum = 1/(a^2) + 4/(a^5) + 7/(a^8) + ... up to n terms
    public double series(double a, double n) {
        double sum = 0.0;
        for (int i = 0; i < n; i++) {
            double numerator = 1 + 3 * i; // 1, 4, 7, 10, ...
            double denominator = Math.pow(a, 2 + 3 * i); // a^2, a^5, a^8, ...
            sum += numerator / denominator;
        }
        return sum;
    }
}

public class bit7question20 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        SeriesCalculator calculator = new SeriesCalculator();

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
