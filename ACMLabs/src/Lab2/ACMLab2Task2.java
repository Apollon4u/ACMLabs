package Lab2;

public class ACMLab2Task2 {
    public double average(int[] salary) {

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int sum = 0;

        for (int i = 0; i < salary.length; i++) {

            sum += salary[i];

            if (min > salary[i]) {
                min = salary[i];
            }

            if (max < salary[i]) {
                max = salary[i];
            }
        }

        return (double) (sum - (max + min)) / (salary.length - 2);
    }
}
