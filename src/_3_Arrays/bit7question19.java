package _3_Arrays;

// Made by Khraos on 03-11-2024
// System time is: 18:10 and the day is: Sun

public class bit7question19 {
    public static void main(String[] args) {
        // Matrix M
        int[][] M = {
                {-1, 0, 2},
                {-3, -1, 6},
                {4, 3, -1}
        };

        // Matrix M + N
        int[][] MplusN = {
                {-6, 9, 4},
                {4, 5, 0},
                {1, -2, -3}
        };

        // Calculate N
        int[][] N = new int[3][3]; // Assuming the matrices are 3x3

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                N[i][j] = MplusN[i][j] - M[i][j];
            }
        }

        // Display matrix N
        System.out.println("Matrix N:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(N[i][j] + " ");
            }
            System.out.println();
        }
    }
}
