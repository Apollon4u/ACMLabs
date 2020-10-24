package Lab1.Strings;

public class ACMLab1Task3 {
    public int myAtoi(String str) {

        int startPoint = 0;

        while (startPoint < str.length() && str.charAt(startPoint) == ' ')
            startPoint++;

        if (startPoint >= str.length())
            return 0;

        char first = str.charAt(startPoint);
        boolean isPositive = true;
        int ans = 0;

        if (first == '-')
            isPositive = false;
        else if (first == '+')
            isPositive = true;
        else if (!Character.isDigit(first))
            return 0;
        else if (Character.isDigit(first))
            ans = first - '0';

        for (int i = startPoint + 1; i < str.length(); i++){

            if (!Character.isDigit(str.charAt(i)))
                break;
            else {

                int digit = str.charAt(i) - '0';

                if (ans > (Integer.MAX_VALUE - digit) / 10) {
                    if (isPositive)
                        return Integer.MAX_VALUE;
                    else
                        return Integer.MIN_VALUE;
                }

                ans = ans * 10 + digit;
            }
        }

        if (!isPositive)
            ans *= -1;

        return ans;
    }
}
