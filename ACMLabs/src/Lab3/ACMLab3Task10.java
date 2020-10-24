package Lab3;

import java.util.HashMap;
import java.util.Map;

public class ACMLab3Task10 {
    public int fourSumCount(int[] A, int[] B, int[] C, int[] D) {

        int counter = 0;
        int sum;

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < B.length; j++) {
                sum = A[i] + B[j];
                map.put(sum, map.getOrDefault(sum, 0) + 1);
            }
        }

        for (int i = 0; i < C.length; i++) {
            for (int j = 0; j < D.length; j++) {
                sum = C[i] + D[j];
                counter += map.getOrDefault(-sum, 0);
            }
        }

        return counter;
    }
}
