package _3_Arrays;

import java.util.Scanner;

public class bit7question5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("How many students are there in a class: ");
        int n = in.nextInt();

        in.nextLine();

        double average = 0.0, deviation;
        double[] totalmarks = new double[n];
        String[] name = new String[n];
        for(int i = 0; i < n; i++) {
            System.out.print("Enter name of student "+(i+1)+": ");
            name[i] = in.nextLine();
            System.out.print("Enter the marks of "+name[i]+": ");
            totalmarks[i] = in.nextDouble();
            in.nextLine();
        }
        for(int i = 0; i < n; i++ ) {
            average += totalmarks[i];
        }
        average /= n;
        System.out.println("Class Average: "+average);
        for(int i = 0; i< n; i++) {
            deviation = totalmarks[i] - average;
            System.out.println("Deviation of Student "+(i+1)+"("+name[i]+") is: "+deviation);
        }
    }
}
