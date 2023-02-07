import java.util.Scanner;

public class DiagonalMatrix {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = input.nextInt();

        System.out.print("Enter number of columns: ");
        int columns = input.nextInt();

        int[][] matrix = new int[rows][columns];
        int value = 1;
        int row = 0, col = 0;

        while (row < rows && col < columns) {
            for (int i = col; i < columns; i++) {
                matrix[row][i] = value;
                value = value == 1 ? 0 : 1;
            }
            row++;

            for (int i = row; i < rows; i++) {
                matrix[i][columns - 1] = value;
                value = value == 1 ? 0 : 1;
            }
            columns--;

            if (row < rows) {
                for (int i = columns - 1; i >= col; i--) {
                    matrix[rows - 1][i] = value;
                    value = value == 1 ? 0 : 1;
                }
                rows--;
            }

            if (col < columns) {
                for (int i = rows - 1; i >= row; i--) {
                    matrix[i][col] = value;
                    value = value == 1 ? 0 : 1;
                }
                col++;
            }
        }

        System.out.println("Diagonal matrix:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}