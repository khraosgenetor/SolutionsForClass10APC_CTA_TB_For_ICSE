package _3_Arrays;

import java.util.Scanner;

public class bit7question3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter the value at index "+i+": ");
            arr[i] = in.nextInt();
        }
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] < 0) {
                System.out.println(arr[i]);
            }
        }

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] >= 0) {
                System.out.println(arr[i]);
            }
        }

    }
}
