package Constructors;

import java.util.Scanner;

class Bill {
    int call, bno;
    String name;
    double amt;
    Bill() {
        bno = 0;
        call = 0;
        amt = 0.0;
        name = null;
    }
    Bill(int billno, String str, int callno) {
        bno = billno;
        call = callno;
        name = str;
        amt = 0.0;
    }
    void Calculate() {
        if (call <= 100) {
            amt = 0.6 * call;
        } else if (call > 100 & call <= 200) {
            amt = 0.8 * call;
        } else if (call > 200 && call <= 300) {
            amt = 1.2 * call;
        } else {
            amt = 1.5 * call;
        }
        amt += 125;
    }
    void Display() {
        System.out.println("Bill number: "+bno);
        System.out.println("Name of the Customer: "+name);
        System.out.println("The number of calls: "+call);
        System.out.println("Final amount to be paid: "+amt);
    }
}

public class bit6question11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int bno, call;
        String name;
        System.out.print("Enter the bill number: ");
        bno = in.nextInt();
        in.nextLine();
        System.out.print("Enter the name of the customer: ");
        name = in.nextLine();
        System.out.print("Enter the number of calls: ");
        call = in.nextInt();
        Bill bill = new Bill(bno, name, call);
        bill.Calculate();
        bill.Display();
    }
}
