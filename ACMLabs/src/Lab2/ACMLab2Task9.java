package Lab2;

import java.util.PriorityQueue;

public class ACMLab2Task9 {
    public int[][] kClosest(int[][] points, int K) {

        PriorityQueue<Integer> pq = new PriorityQueue<>((Integer point1, Integer point2) -> {
            return dis(points[point2]) - dis(points[point1]);
        });

        for (int i = 0; i < points.length; i++) {
            pq.add(i);
            if (pq.size() > K) {
                pq.remove();
            }
        }

        int[][] result = new int[K][2];

        for (int i = 0; i < K; i++) {
            int head = pq.remove();
            result[i] = points[head];
        }

        return result;
    }

    private int dis(int[] point) {
        return point[0] * point[0] + point[1] * point[1];
    }
}
