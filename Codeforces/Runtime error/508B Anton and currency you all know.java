import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Antonandcurrencyyouallknow {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        ArrayList<Integer> v = new ArrayList<Integer>();
        boolean ch = false;
        for (int i = s.length() - 2; i >= 0; i--) {
            if (s.charAt(i) % 2 == 0) {
                String temp = s.substring(0, i) + s.charAt(s.length() - 1) + s.substring(i + 1, s.length() - 1) + s.charAt(i);
                v.add(Integer.valueOf(temp));
                ch= true;
            }

        }
        if (ch) {
            Collections.sort(v);
            System.out.println(v.get(v.size()-1));
        } else {
            System.out.println("-1");
        }
    }

}