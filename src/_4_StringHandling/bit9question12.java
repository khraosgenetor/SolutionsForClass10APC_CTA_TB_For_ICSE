package _4_StringHandling;

// Made by Khraos on 30-10-2024
// System time is: 16:45 and the day is: Wed

public class bit9question12 {
    public static void main(String[] args) {
        String str = "Blue Bottle is in Blue Bag lying on Blue carpet";
        String find = "Blue";
        String replace = "Red";
        String soln = "";

        int i = 0;

        while (i < str.length()) {
            int index = str.indexOf(find, i); // Find the next occurrence of "Blue"

            if (index == -1) {
                soln += str.substring(i); // Add the remaining part of the string
                break;
            }

            soln += str.substring(i, index) + replace; // Add the part before "Blue" and then "Red"
            i = index + find.length(); // Move index past the current occurrence
        }

        System.out.println("Output: " + soln);
    }
}
