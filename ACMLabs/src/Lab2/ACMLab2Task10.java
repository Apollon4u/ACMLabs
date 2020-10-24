package Lab2;

import java.util.Arrays;
import java.util.Comparator;

public class ACMLab2Task10 {
    public String largestNumber(int[] nums) {

        Comparator<String> comparator = new Comparator<String>(){
            public int compare(String str1, String str2) {
                String str12 = str1.concat(str2);
                String str21 = str2.concat(str1);
                return str21.compareTo(str12);
            }
        };

        String[] ans = new String[nums.length];

        for (int i = 0; i < nums.length; i++)
            ans[i] = String.valueOf(nums[i]);

        Arrays.sort(ans, comparator);

        if(ans[0].charAt(0) == '0')
            return "0";

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < ans.length; i++)
            sb.append(ans[i]);

        return sb.toString();
    }
}
