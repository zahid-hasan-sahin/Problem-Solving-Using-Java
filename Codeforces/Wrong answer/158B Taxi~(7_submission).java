import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Taxi {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int total = scan.nextInt();
        ArrayList<Integer> pass = new ArrayList<Integer>();
        for (int i = 0; i < total; i++) {
            pass.add(scan.nextInt());
        }
        Collections.sort(pass);
        int c = 0;
        int t = pass.size();
        int o = 0;
        for (int i = 0; i < t; i++) {
            if (pass.get(i).equals(1)) {
                o++;
            }

        }
        if (o == t) {
            int k = o/4;
            System.out.println(k);
        } else {
            for (int i = 0; i < pass.size(); i++) {
                for (int j = pass.size() - 1 - i; j >= 0; j--) {
                    if (i == j) {
                        break;
                    }
                    if (pass.get(i) + pass.get(j) <= 4) {
                        c++;
                        pass.remove(i);
                        break;
                    }

                }
            }

            System.out.println(t - c);
        }

    }
}