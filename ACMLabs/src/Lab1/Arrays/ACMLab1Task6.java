package Lab1.Arrays;

public class ACMLab1Task6 {

    private int[][] sum;

    public ACMLab1Task6(int[][] matrix) {

        if (matrix.length == 0 || matrix[0].length == 0)
            return;

        sum = new int[matrix.length + 1][matrix[0].length + 1];

        sum[0][0] = 0;

        for (int x = 0; x < matrix.length; x++) {
            for (int y = 0; y < matrix[0].length; y++) {
                sum[x + 1][y + 1] = sum[x + 1][y] + sum[x][y + 1] + matrix[x][y] - sum[x][y];
            }
        }
    }

    public int sumRegion(int row1, int col1, int row2, int col2) {
        return sum[row2 + 1][col2 + 1] - sum[row2 + 1][col1] - sum[row1][col2 + 1] + sum[row1][col1];
    }
}
