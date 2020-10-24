package Lab2;

import java.util.Arrays;
import java.util.Comparator;

public class ACMLab2Task6 {

    public int getKth(int lo, int hi, int k) {

        int[][] res = new int[hi - lo + 1][2];

        for (int i = 0; i < res.length; i++) {
            res[i][0] = findPower(lo + i, 0);
            res[i][1] = lo + i;
        }

        Arrays.sort(res, Comparator.comparingDouble(arr -> arr[0]));

        return res[k-1][1];
    }

    public int findPower(int n, int count) {

        if (n == 1)
            return count;

        count++;

        if (n % 2 == 0)
            return findPower(n / 2, count);
        else
            return findPower(n * 3 + 1, count);

    }
}
