import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ACMLab4Task7 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Pair> pairs = new ArrayList<>();

        while (sc.hasNext()) {
            int number = Integer.parseInt(sc.next());
            String surname = sc.next();
            pairs.add(new Pair(number, surname));
        }

        Collections.sort(pairs);

        for (Pair pair : pairs) {
            System.out.println(pair.getNumber() + " " + pair.getSurname());
        }

        sc.close();
    }

    static class Pair implements Comparable<Pair> {

        private int number;
        private String surname;

        Pair(int number, String surname) {
            this.number = number;
            this.surname = surname;
        }

        int getNumber() {
            return number;
        }

        String getSurname() {
            return surname;
        }

        @Override
        public int compareTo(Pair pair) {
            if (this == pair) return 0;
            return pair.number - number;
        }
    }
}
