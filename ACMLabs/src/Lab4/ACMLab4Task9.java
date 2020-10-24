package Lab4;

import java.util.Stack;

public class ACMLab4Task9 {

    public boolean backspaceCompare(String S, String T) {

        Stack<Character> stS = new Stack<>();
        Stack<Character> stT = new Stack<>();

        for (char c : S.toCharArray()) {
            if (!stS.isEmpty() && c == '#')
                stS.pop();
            else if (c != '#')
                stS.push(c);
        }

        for (char ch : T.toCharArray()){
            if (!stT.isEmpty() && ch == '#')
                stT.pop();
            else if (ch != '#')
                stT.push(ch);
        }

        while (!stS.isEmpty() && !stT.isEmpty())
            if (stS.pop() != stT.pop())
                return false;

        return stS.isEmpty() && stT.isEmpty();
    }
}
