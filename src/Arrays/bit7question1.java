package Arrays;

import java.util.Scanner;

public class bit7question1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[] = new int[20];
        for(int i = 0; i < arr.length; i++) {
            System.out.print("Enter member "+(i+1)+": ");
            arr[i] = in.nextInt();
        }
        System.out.println("The following are even numbers: ");
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] % 2 == 0) {
                System.out.println(arr[i]+" at index number: "+i);
            }
        }
        System.out.println("The following are odd numbers: ");
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] % 2 == 1) {
                System.out.println(arr[i]+" at index number: "+i);
            }
        }
        in.close();
    }
}
