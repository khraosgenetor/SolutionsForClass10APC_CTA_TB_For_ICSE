package _7_Constructors;

import java.util.Scanner;

class Bill {
    int call, bno;
    String name;
    double amt;

    Bill(int billno, String str, int callno) {
        bno = billno;
        name = str;
        call = callno;
    }

    void calculate() {
        if (call <= 100) amt = 0.6 * call;
        else if (call <= 200) amt = 0.8 * call;
        else if (call <= 300) amt = 1.2 * call;
        else amt = 1.5 * call;
        amt += 125;
    }

    void display() {
        System.out.println("Bill number: " + bno);
        System.out.println("Customer name: " + name);
        System.out.println("Number of calls: " + call);
        System.out.println("Final amount: " + amt);
    }
}

public class bit6question11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter bill number: ");
        int bno = in.nextInt();
        in.nextLine();  // Consume the newline
        System.out.print("Enter customer name: ");
        String name = in.nextLine();
        System.out.print("Enter number of calls: ");
        int call = in.nextInt();

        Bill bill = new Bill(bno, name, call);
        bill.calculate();
        bill.display();
        in.close();
    }
}