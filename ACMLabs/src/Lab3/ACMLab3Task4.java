package Lab3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class ACMLab3Task4 {
    public List<List<String>> groupAnagrams(String[] strs) {

        if (strs.length == 0)
            return new ArrayList();

        HashMap<String, ArrayList<String>> map = new HashMap<>();

        for (int i = 0; i < strs.length; i++) {

            char[] tmp = strs[i].toCharArray();

            Arrays.sort(tmp);

            String sortedString = String.valueOf(tmp);

            if (!map.containsKey(sortedString))
                map.put(sortedString, new ArrayList<String>());

            map.get(sortedString).add(strs[i]);

        }

        return new ArrayList<>(map.values());

    }
}
