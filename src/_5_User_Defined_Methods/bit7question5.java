package _5_User_Defined_Methods;

import java.util.Scanner;

class factorial {
    double fact(int n) {
        double fact = 1.0;
        for(int i = 1; i<= n; i++) {
            fact *= i;
        }
        return fact;
    }
}

public class bit7question5 {
    public static void main(String[] args) {
        factorial fact = new factorial();
        Scanner in = new Scanner(System.in);
        int n, m;
        double nF, mF, nmmF, S; // nmmF is n minus m factorial
        System.out.print("Enter the number \'n\': ");
        n = in.nextInt();
        System.out.print("Enter the number \'m\': ");
        m = in.nextInt();
        nF = fact.fact(n);
        mF = fact.fact(m);
        nmmF = fact.fact((n-m));
        S = (nF/(mF * nmmF));
        System.out.println("The value of S is: "+S);
    }
}
