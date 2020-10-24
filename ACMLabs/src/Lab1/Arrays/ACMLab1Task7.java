package Lab1.Arrays;

public class ACMLab1Task7 {
    public void rotate(int[][] matrix) {

        int temp;

        for (int i = 0; i < matrix.length / 2; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                temp = matrix[i][j];
                matrix[i][j] = matrix[matrix.length - 1 - i][j];
                matrix[matrix.length - 1 - i][j] = temp;
            }
        }

        int counter = 0;
        for (int i = 0; i < matrix.length - 1; i++) {

            for (int j = 1 + counter; j < matrix[0].length; j++) {
                temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }

            counter++;
        }
    }
}
