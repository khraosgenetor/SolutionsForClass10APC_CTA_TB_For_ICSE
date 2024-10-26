package _7_Constructors;

import java.util.Scanner;

class Laptop {
    String name;
    double price, amt, dis;
    Laptop(double a, double d) {
        name = null;
        price = 0.0;
        amt = a;
        dis = d;
    }
    void accept() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the name of the Customer: ");
        name = in.nextLine();
        System.out.print("Enter the price of the article: ");
        price = in.nextDouble();
    }
    void discount() {
        double rate =
                price <= 25000 ? 5 :
                price <= 50000 ? 7.5 :
                price <= 100000 ? 10 :
                    15;
        dis = price * rate / 100;
        amt = price - dis;
    }

    void display() {
        System.out.println("The name of customer: " + name);
        System.out.println("The discount: " + dis);
        System.out.println("The price after discount: " + amt);
    }
}

public class bit6question2 {
    public static void main(String[] args) {
        Laptop lp = new Laptop(0.0, 0.0);
        lp.accept();
        lp.discount();
        lp.display();
    }
}
