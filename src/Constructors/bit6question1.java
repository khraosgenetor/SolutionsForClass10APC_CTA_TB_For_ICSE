package Constructors;

import java.util.Scanner;

class Hcflcm {
    int a, b;
    Hcflcm(int x, int y) {
        a = x;
        b = y;
    }
    void calculate() {
        int hcf = 0, lcm = 0;
        int max = Math.max(a, b);
        int min = Math.min(a, b);
        for(int i = 1; i <= min; i++){
            if( max % i == 0 && min % i == 0) {
                hcf = i;
            }
        }
        for(int i = min; i <= (max * min); i++) {
            if ( i % min == 0 && i % max == 0) {
                lcm = i;
                break;
            }
        }
        System.out.println("The HCF of "+a+" and "+b+" is: "+hcf);
        System.out.println("The LCM of "+a+" and "+b+" is: "+lcm);
    }
}

public class bit6question1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int a = in.nextInt();
        System.out.print("Enter the second number: ");
        int b = in.nextInt();
        Hcflcm hl = new Hcflcm(a, b);
        hl.calculate();
    }
}
