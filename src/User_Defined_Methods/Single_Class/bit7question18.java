package User_Defined_Methods.Single_Class;

import java.util.Scanner;

public class bit7question18 {

    void calculate(int m, char ch) {
        if (ch == 's') {
            System.out.println(m + (m % 7 == 0 ? " is divisible by 7." : " is not divisible by 7."));
        } else {
            System.out.println("The last digit of " + m + (m % 10 == 7 ? " is 7." : " is not 7."));
        }
    }

    void calculate(int a, int b, char ch) {
        System.out.println((ch == 'g' ? "The maximum number is: " : "The smaller number is: ") + (ch == 'g' ? Math.max(a, b) : Math.min(a, b)));
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        bit7question18 obj = new bit7question18();

        System.out.print("Enter an integer: ");
        int m = in.nextInt();
        System.out.print("Enter a character (s for check divisibility by 7, any other character to check last digit): ");
        char ch = in.next().charAt(0);
        obj.calculate(m, ch);

        System.out.print("Enter two integers: \n");
        int a = in.nextInt();
        int b = in.nextInt();
        System.out.print("Enter a character (g for max, any other character for min): ");
        ch = in.next().charAt(0);
        obj.calculate(a, b, ch);

        in.close();
    }
}