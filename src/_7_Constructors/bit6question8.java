package _7_Constructors;

import java.util.*;

// Made by Khraos on 19-10-2024
// System time is: 12:04 and the day is: Sat

class FruitJuice {
    int product_code, pack_size, product_price;
    String flavor, pack_type;

    FruitJuice() {
        product_code = 0;
        pack_size = 0;
        product_price = 0;
        flavor = " ";
        pack_type = " ";
    }
    void input(Scanner in) {
        System.out.print("Enter product code: ");
        product_code = in.nextInt();

        System.out.print("Enter flavor: ");
        in.nextLine();
        flavor = in.nextLine();

        System.out.print("Enter pack size: ");
        pack_size = in.nextInt();
        in.nextLine();

        System.out.print("Enter pack type: ");
        pack_type = in.nextLine();

        System.out.print("Enter product price: ");
        product_price = in.nextInt();
    }
    void discount() {
        product_price -= 10;
    }
    void display() {
        System.out.println("Product Code: " + product_code);
        System.out.println("Flavor: " + flavor);
        System.out.println("Pack Type: " + pack_type);
        System.out.println("Pack Size: " + pack_size);
        System.out.println("Product Price: " + product_price);
    }
}

public class bit6question8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        FruitJuice fruitJuice = new FruitJuice();
        fruitJuice.input(in);
        fruitJuice.discount();
        fruitJuice.display();
        in.close();
    }
}
