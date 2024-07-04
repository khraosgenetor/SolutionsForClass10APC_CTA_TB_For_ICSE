package Non_Revision_Chapter5;

import java.util.Scanner;

public class bit7question2 {
    static int armstronk(int n) {
        int temp = n, c = 0, temp1 = n;
        double r = 0;
        while(temp != 0) {
            c++;
            temp /= 10;
        }
        while(temp1 != 0) {
            r += (Math.pow(temp1 % 10, c));
            temp1 /= 10;
        }
        if( r == n) {
            return 1;
        }
        return 0;
    }

    public static void main(String[] args) {
        int num;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a three digit number that you wish to check: ");
        num = in.nextInt();
        if( num < 1000 && num > 99 ) {
            if( armstronk(num) == 1) {
                System.out.println(num+" is an Armstrong Number.");
            } else {
                System.out.println(num+" is not an Armstrong Number.");
            }
        } else {
            System.err.println("Not a three digit number: "+num);
            System.exit(400);
        }
    }
}
