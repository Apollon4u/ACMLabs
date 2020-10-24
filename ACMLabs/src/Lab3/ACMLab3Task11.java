package Lab3;

public class ACMLab3Task11 {

    int sum, mod;

    public boolean isHappy(int n) {

        if (n == 1 || n == 7)
            return true;

        if (n < 10)
            return false;

        sum = 0;

        while (n != 0) {
            mod = n % 10;
            sum += mod * mod;
            n = n / 10;
        }

        return isHappy(sum);

    }
}
