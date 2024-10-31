package _4_StringHandling;

// Made by Khraos on 30-10-2024
// System time is: 16:45 and the day is: Wed

public class bit9question12 {
    public static void main(String[] args) {
        String input = "Blue Bottle is in Blue Bag lying on Blue carpet";
        String target = "Blue";
        String replacement = "Red";
        String result = "";

        int index = 0;

        while (index < input.length()) {
            int targetIndex = input.indexOf(target, index); // Find the next occurrence of "Blue"

            if (targetIndex == -1) {
                result += input.substring(index); // Add the remaining part of the string
                break;
            }

            result += input.substring(index, targetIndex) + replacement; // Add the part before "Blue" and then "Red"
            index = targetIndex + target.length(); // Move index past the current occurrence
        }

        System.out.println("Output: " + result);
    }
}
