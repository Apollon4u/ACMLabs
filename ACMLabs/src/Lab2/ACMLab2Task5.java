package Lab2;

import java.util.Arrays;

public class ACMLab2Task5 {
    public int maxCoins(int[] piles) {

        Arrays.sort(piles);

        int res = 0, n = piles.length;

        for (int i = n / 3; i < n; i += 2)
            res += piles[i];

        return res;
    }
}
