package _7_Constructors;

import java.util.Scanner;

class BookFair {
    String Bname;
    double price;
    BookFair() {
        price = 0.0;
        Bname = null;
    }
    void input() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the name of the book: ");
        Bname = in.nextLine();
        System.out.print("Enter the price of the book: ");
        price = in.nextDouble();
    }
    void calculate() {
        if (price <= 1000) {
            price -= (price * 2.0/100);
        } else if (price > 1000 && price <= 3000) {
            price -= (price * 10.0/100);
        } else {
            price -= (price * 15.0/100);
        }
    }
    void display() {
        System.out.println("Name of the book: "+Bname);
        System.out.println("Final price after discount: "+price);
    }
}

public class bit6question12 {
    public static void main(String[] args) {
        BookFair bf = new BookFair();
        bf.input();
        bf.calculate();
        bf.display();
    }
}
