package Lab2;

import java.util.Collections;
import java.util.Stack;

public class ACMLab2Task4 {
    public int[][] diagonalSort(int[][] mat) {

        int rows = mat.length, columns = mat[0].length;

        for (int i = 0; i < rows; i++) {

            for (int j = 0; j < (i > 0 ? 1 : columns); j++) {

                Stack<Integer> vals = new Stack<>();

                while (i < rows && j < columns)
                    vals.add(mat[i++][j++]);

                Collections.sort(vals);

                while (i > 0 && j > 0)
                    mat[--i][--j] = vals.pop();
            }
        }

        return mat;
    }
}
