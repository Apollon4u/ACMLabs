package Lab1.Strings;

public class ACMLab1Task1 {
    public String reverseWords(String s) {

        String[] splittedStr = s.trim().replaceAll(" +", " ").split(" ");
        String ans = "";

        for (int i = 0; i < splittedStr.length; i++) {
            ans += splittedStr[splittedStr.length - i - 1] + " ";
        }

        return ans.substring(0, ans.length() - 1);
    }
}
