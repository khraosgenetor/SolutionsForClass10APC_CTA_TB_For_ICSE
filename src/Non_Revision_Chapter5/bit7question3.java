package Non_Revision_Chapter5;

import java.sql.SQLOutput;
import java.util.Scanner;

public class bit7question3 {
    static int Pronic(int n) {
        for(int i = 1; i <= n; i++ ) {
            int j = i + 1;
            if(n == (i * j)) {
                return 1;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int num;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number which you wish to check: ");
        num = in.nextInt();
        if( Pronic(num) == 1 ) {
            System.out.println(num+" is a Pronic number.");
        } else {
            System.out.println(num+" is not a Pronic number.");
        }
    }
}
