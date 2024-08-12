package User_Defined_Methods;

import java.util.Scanner;

public class bit7question14 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] numbers = new int[10];

        System.out.println("Enter 10 numbers:");
        for (int i = 0; i < 10; i++) {
            numbers[i] = in.nextInt();
        }

        System.out.print("Enter the number to search: ");
        int searchNumber = in.nextInt();

        Search(numbers, searchNumber);
        in.close();
    }

    public static void Search(int m[], int ns) {
        boolean found = false;

        for (int number : m) {
            if (number == ns) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Number is present");
        } else {
            System.out.println("Number not present");
        }
    }
}
