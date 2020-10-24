package Lab1.Strings;

public class ACMLab1Task5 {
    public String reverseWords(String s) {

        StringBuilder sb = new StringBuilder();

        String splittedStr[] = s.split(" ");

        for (int i = 0; i < splittedStr.length; i++)
            sb.append(new StringBuffer(splittedStr[i]).reverse() + " ");

        return sb.toString().trim();
    }
}
