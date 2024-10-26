package _7_Constructors;

import java.util.Scanner;

class Calculate {
    int num;

    Calculate(int n) {
        num = n;
    }

    int prime() {
        if (num <= 1) return 0;
        for (int i = 2; i * i <= num; i++) if (num % i == 0) return 0;
        return 1;
    }

    int reverse() {
        int original = num, rev = 0;
        while (original != 0) {
            rev = rev * 10 + original % 10;
            original /= 10;
        }
        return rev;
    }

    void display() {
        if (num == reverse() && prime() == 1)
            System.out.println(num + " is a prime palindrome.");
        else
            System.out.println(num + " is not a prime palindrome.");
    }
}

public class bit6question3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Calculate calc = new Calculate(in.nextInt());
        calc.display();
        System.out.println("Is Prime: " + (calc.prime() == 1 ? "Yes" : "No"));
        System.out.println("Reversed Number: " + calc.reverse());
        in.close();
    }
}

