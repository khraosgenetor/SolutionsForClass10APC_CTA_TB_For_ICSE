package _7_Constructors;

import java.util.Scanner;

class Grade_Revision {
    String name;
    int bas, expn;
    double inc, nbas;

    Grade_Revision() {
        name = "";
        bas = expn = 0;
        inc = nbas = 0.0;
    }

    void accept() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter employee name: ");
        name = in.nextLine();
        System.out.print("Enter basic salary: ");
        bas = in.nextInt();
        System.out.print("Enter experience in years: ");
        expn = in.nextInt();
    }

    void increment() {
        if (expn <= 3) inc = 1000 + 0.10 * bas;
        else if (expn <= 5) inc = 3000 + 0.12 * bas;
        else if (expn <= 10) inc = 5000 + 0.15 * bas;
        else inc = 8000 + 0.20 * bas;
        nbas = bas + inc;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Basic Salary: " + bas);
        System.out.println("Experience: " + expn + " years");
        System.out.println("Increment: " + inc);
        System.out.println("New Salary: " + nbas);
    }
}

public class bit6question9 {
    public static void main(String[] args) {
        Grade_Revision gr = new Grade_Revision();
        gr.accept();
        gr.increment();
        gr.display();
    }
}
