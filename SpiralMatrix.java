package SpiralMatrix;
public class SpiralMatrix {
    public static void main(String[] args) {
        int[][] a = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int rowStart = 0;
        int rowEnd = a.length;
        int colStart = 0;
        int colEnd = a[0].length;

        while (rowStart < rowEnd && colStart < colEnd) {
            // Print the top row (left -> right)
            for (int i = colStart; i < colEnd; i++) {
                System.out.print(a[rowStart][i] + " ");
            }
            rowStart++;

            // Print the right column (top -> bottom)
            for (int i = rowStart; i < rowEnd; i++) {
                System.out.print(a[i][colEnd - 1] + " ");
            }
            colEnd--;

            // Check if there are rows left
            if (rowStart < rowEnd) {
                // Print the bottom row (right -> left)
                for (int i = colEnd - 1; i >= colStart; i--) {
                    System.out.print(a[rowEnd - 1][i] + " ");
                }
                rowEnd--;
            }

            // Check if there are columns left
            if (colStart < colEnd) {
                // Print the left column (bottom -> top)
                for (int i = rowEnd - 1; i >= rowStart; i--) {
                    System.out.print(a[i][colStart] + " ");
                }
                colStart++;
            }
        }
    }
}
