package Arrays;

import java.util.Scanner;

public class bit7question2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double[] arrOfF = new double[20];
        double[] arrOfC = new double[20];
        for(int i = 0; i < arrOfF.length; i++) {
            System.out.print("Enter temperature "+(i+1)+" in Fahrenheit: ");
            arrOfF[i] = in.nextDouble();
        }
        for (int i = 0; i < arrOfF.length; i++) {
            arrOfC[i] = 5.0 * ((arrOfF[i] - 32)/9.0);
            System.out.println("The temperature at index "+i+" in Celsius is: "+arrOfC[i]);
        }
    }
}
