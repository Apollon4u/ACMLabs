package Lab2;

public class ACMLab2Task1 {
    public String sortString(String s) {

        int[] alphabet = new int[26];

        for (int i = 0; i < s.length(); i++){
            alphabet[s.charAt(i) - 'a']++;
        }

        StringBuilder ans = new StringBuilder();

        while (ans.length() < s.length()) {

            for (int i = 0; i < 26; i++) {
                if (alphabet[i] != 0){
                    ans.append((char)(i + 'a'));
                    alphabet[i]--;
                }
            }

            for (int i = 25; i >= 0; i--) {
                if (alphabet[i] != 0) {
                    ans.append((char)(i + 'a'));
                    alphabet[i]--;
                }
            }
        }

        return ans.toString();
    }
}
