package _4_StringHandling;

import java.util.*;

// Made by Khraos on 19-10-2024
// System time is: 13:06 and the day is: Sat

public class bit9question4 {
    public static void main(String[] args) {
        System.out.print("Enter a name: ");
        Scanner in = new Scanner(System.in);
        String name = in.nextLine();
        String[] parts = new String[2];
        int lastSpaceIndex = name.lastIndexOf(' ');
        if (lastSpaceIndex != -1) {
            parts[0] = name.substring(lastSpaceIndex + 1);
            parts[1] = name.substring(0, lastSpaceIndex);
            System.out.println(parts[0] + " " + parts[1]);
        }
        in.close();
    }
}

