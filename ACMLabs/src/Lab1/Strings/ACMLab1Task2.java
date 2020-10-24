package Lab1.Strings;

public class ACMLab1Task2 {
    public String licenseKeyFormatting(String S, int K) {

        StringBuilder sb = new StringBuilder();

        for (int i = S.length() - 1; i >= 0; i--) {
            if (S.charAt(i) != '-') {
                if (sb.length() % (K + 1) == K) {
                    sb.append('-').append(S.charAt(i));
                } else sb.append("").append(S.charAt(i));
            }
        }

        return sb.reverse().toString().toUpperCase();
    }
}
