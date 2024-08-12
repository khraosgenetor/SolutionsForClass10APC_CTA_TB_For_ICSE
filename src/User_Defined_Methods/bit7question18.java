package User_Defined_Methods;

import java.util.Scanner;

class Calculator {

    public void calculate(int m, char ch) {
        if (ch == 's') {
            if (m % 7 == 0) {
                System.out.println(m + " is divisible by 7.");
            } else {
                System.out.println(m + " is not divisible by 7.");
            }
        } else {
            if (m % 10 == 7) {
                System.out.println("The last digit of " + m + " is 7.");
            } else {
                System.out.println("The last digit of " + m + " is not 7.");
            }
        }
    }

    public void calculate(int a, int b, char ch) {
        if (ch == 'g') {
            int max = Math.max(a, b);
            System.out.println("The maximum number is: " + max);
        } else {
            int min = Math.min(a, b);
            System.out.println("The smaller number is: " + min);
        }
    }
}

public class bit7question18 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Calculator calculator = new Calculator();

        System.out.print("Enter an integer: ");
        int m = in.nextInt();
        System.out.print("Enter a character (s for check divisibility by 7, any other character to check last digit): ");
        char ch1 = in.next().charAt(0);
        calculator.calculate(m, ch1);

        System.out.print("Enter first integer: ");
        int a = in.nextInt();
        System.out.print("Enter second integer: ");
        int b = in.nextInt();
        System.out.print("Enter a character (g for max, any other character for min): ");
        char ch2 = in.next().charAt(0);
        calculator.calculate(a, b, ch2);

        in.close();
    }
}
