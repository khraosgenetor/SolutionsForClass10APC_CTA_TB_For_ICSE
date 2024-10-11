package _5_User_Defined_Methods;


import java.util.Scanner;

class Discount_Class {
    double Discount(double d, double p) {
        double amt;
        amt = p - (d * p / 100.0);
        return amt;
    }

    double Discount(double d1, double d2, double p) {
        double amt;
        amt = p - (d1 * p / 100.0);
        amt -= (d2 * amt / 100.0);
        return amt;
    }

    double Discount(double d1, double d2, double d3, double p) {
        double amt;
        amt = p - (d1 * p / 100.0);
        amt -= (d2 * amt / 100.0);
        amt -= (d3 * amt / 100.0);
        return amt;
    }

}
public class bit7question1 {
   
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Discount_Class dc = new Discount_Class();
        int dn;
        double price;
        String print = "Hello, World!";
        System.out.print("Enter the price: ");
        price = in.nextDouble();
        System.out.print("Enter the number of discounts: ");
        dn = in.nextInt();
        switch (dn) {
            case 1:
                double d, d1amt;
                System.out.print("Enter the discount: ");
                d = in.nextDouble();
                d1amt = dc.Discount(d, price);
                print = "The final amount is " + d1amt;
                break;

            case 2:
                double d1, d2, d2amt;
                System.out.println("Enter the successive discount: ");
                d1 = in.nextDouble();
                d2 = in.nextDouble();
                d2amt = dc.Discount(d1, d2, price);
                print = "The final amount is " + d2amt;
                break;

            case 3:
                double d_1, d_2, d_3, d3amt;
                System.out.println("Enter the successive discount: ");
                d_1 = in.nextDouble();
                d_2 = in.nextDouble();
                d_3 = in.nextDouble();
                d3amt = dc.Discount(d_1, d_2, d_3, price);
                print = "The final amount is " + d3amt;
                break;

            default:
                System.err.println("There are only 3 successive discounts.");
                break;
        }

        System.out.println(print);

    }
}
