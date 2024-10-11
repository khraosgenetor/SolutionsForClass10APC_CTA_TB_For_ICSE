package _7_Constructors;

import java.util.Scanner;

class Grade_Revision {
    String name;
    int bas, expn;
    double inc, nbas;
    Grade_Revision() {
        name = null;
        bas = 0;
        expn = 0;
        inc = 0.0;
        nbas = 0.0;
    }
    void accept() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the name of the employee: ");
        name = in.nextLine();
        System.out.print("Enter the basic salary of the employee: ");
        bas = in.nextInt();
        System.out.print("Enter the experience of the employee in years: ");
        expn = in.nextInt();
    }
    void increment() {
        if(expn <= 3) {
            inc = 1000 + (10/100.0 * bas);
        } else if (expn >3 && expn <= 5) {
            inc = 3000 + (12/100.0 * bas);
        } else if (expn > 5 && expn <= 10) {
            inc = 5000 + (15/100.0 * bas);
        } else {
            inc = 8000 + (20/100.0 * bas);
        }
        nbas = bas + inc;
    }

    void display() {
        System.out.println("The name of the employee: "+name);
        System.out.println("The basic pay of them employee: "+bas);
        System.out.println("The experience of the employee in years is: "+expn);
        System.out.println("The increment in the pay should be: "+inc);
        System.out.println("The new salary is: "+nbas);
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