package Lab3;

import java.util.HashMap;

public class ACMLab3Task5 {
    public boolean wordPattern(String pattern, String s) {

        HashMap map = new HashMap<>();

        String[] words = s.split(" ");

        if (words.length != pattern.length())
            return false;

        for (Integer i = 0; i < words.length; i++) {

            String word = words[i];
            char letter = pattern.charAt(i);

            if (!map.containsKey(word))
                map.put(word, i);

            if (!map.containsKey(letter))
                map.put(letter, i);

            if (map.get(word) != map.get(letter))
                return false;
        }

        return true;

    }
}
