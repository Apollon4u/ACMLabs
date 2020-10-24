package Lab2;

public class ACMLab2Task3 {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {

        int count[] = new int[1001];
        int ans[] = new int[arr1.length];
        int index = 0;

        for (int i = 0; i < arr1.length; i++)
            count[arr1[i]]++;

        for (int i = 0; i < arr2.length; i++)
            while (count[arr2[i]]-- > 0)
                ans[index++] = arr2[i];

        for (int i = 0; i < 1001; i++)
            while (count[i]-- > 0)
                ans[index++] = i;

        return ans;
    }
}
