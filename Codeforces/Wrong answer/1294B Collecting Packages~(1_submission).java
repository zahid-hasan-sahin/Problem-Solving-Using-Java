import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class CollectingPackages {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int testCase = scan.nextInt();
        while (testCase-- > 0) {
            int n = scan.nextInt();
            ArrayList<String> pos = new ArrayList<String>();
            for (int i = 0; i < n; i++) {
                pos.add(scan.nextInt() + " " + scan.nextInt());

            }
            Collections.sort(pos);
            String res = "";
            boolean ch = false;
            int x = 0;
            int y = 0;
         
            for (int i = 0; i < n - 1; i++) {
                String[] t1 = pos.get(i).split(" ");
                String[] t2 = pos.get(i + 1).split(" ");
                
                if ((Integer.valueOf(t1[0]) + Integer.valueOf(t1[1])) >= (Integer.valueOf(t2[0]) + Integer.valueOf(t2[1]))) {
                    ch = true;
                    break;
                }
            }
            if (ch) {
                System.out.println("NO");
            } else {
                for (int i = 0; i < n; i++) {
                    String[] t = pos.get(i).split(" ");
                    res += "R".repeat(Integer.valueOf(t[0]) - x);
                    res += "U".repeat(Integer.valueOf(t[1]) - y);
                    x = Integer.valueOf(t[0]);
                    y = Integer.valueOf(t[1]);

                }
                System.out.println("YES");
                System.out.println(res);
            }

        }

    }

}