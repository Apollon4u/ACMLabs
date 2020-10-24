package Lab1.Arrays;

public class ACMLab1Task1 {

    private int[] array;

    public ACMLab1Task1(int[] nums) {
        array = new int[nums.length + 1];
        array[0] = 0;
        for (int i = 0; i < nums.length; i++) {
            array[i + 1] = array[i] + nums[i];
        }
    }

    public int sumRange(int startPoint, int endPoint) {
        return array[endPoint + 1] - array[startPoint];
    }
}
