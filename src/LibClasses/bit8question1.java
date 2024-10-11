package LibClasses;

import java.util.*;

// Made by Khraos on 11-10-2024
// System time is: 18:43 and the day is: Fri

public class bit8question1 {
    public static void main(String[] args) {
        char ch, chO;
        Scanner in = new Scanner(System.in);

        boolean retry = true;

        while(retry) {
            System.out.print("Enter a character: ");
            ch = in.nextLine().charAt(0);

            chO = (char) (10 + ch);
            System.out.println("The 10th character after " + ch + " is: " + chO);

            System.out.print("Do you wish to retry? (Y/N): ");
            char choice = in.next().charAt(0);
            in.nextLine();

            retry = (choice == 'Y' || choice == 'y');
        }

        in.close();
    }
}

