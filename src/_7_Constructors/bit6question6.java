package _7_Constructors;

import java.util.*;

// Made by Khraos on 19-10-2024
// System time is: 11:47 and the day is: Sat

/**
 * This class represents a population and calculates the population growth over a period of 7 years.
 */
class Population {
    float p, r;

    Population(int a, int b) {
        p = a;
        r = b;
    }

    void print() {
        System.out.println("Population for year 2000: "+p);
        for(int i = 1; i <= 7; i++) {
            p *= (1+r/100);
            System.out.println("The population for the year 200"+i+": "+p);
        }
    }
}

public class bit6question6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the population for the year 2000: ");
        int p = in.nextInt();
        System.out.print("Enter the rate of increase of population: ");
        int r = in.nextInt();
        Population pop = new Population(p, r);
        pop.print();
        in.close();
    }
}
