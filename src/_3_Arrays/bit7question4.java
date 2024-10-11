package _3_Arrays;

import java.util.Scanner;

public class bit7question4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] prime = new int[20];
        for(int i = 0; i < prime.length; i++) {
            System.out.print("Enter the value of member "+(i+1)+": ");
            prime[i] = in.nextInt();
        }
        for(int i = 0; i < prime.length; i++) {
            int c = 0;
            for(int j = 1; j <= prime[i]; j++) {
                if(prime[i] % j == 0) {
                    c++;
                }
            }
            if(c == 2) {
                System.out.print(prime[i]+" ");
            }
        }
    }
}
