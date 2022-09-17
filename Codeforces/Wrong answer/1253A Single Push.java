import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int total = scan.nextInt();
        while (total-- > 0) {
            int n = scan.nextInt();
            ArrayList<Integer> a = new ArrayList<Integer>();
            ArrayList<Integer> b = new ArrayList<Integer>();
            for (int i = 0; i < n; i++) {
                a.add(scan.nextInt());
            }
            for (int i = 0; i < n; i++) {
                b.add(scan.nextInt());
            }
            if (a.equals(b)) {
                System.out.println("YES");
            } else {
                for (int i = 0; i < n; i++) {
                    if (a.get(i) != b.get(i) && b.get(i) - a.get(i) > 0) {
                        int k = (b.get(i) - a.get(i));
                        while (a.get(i) != b.get(i)) {
                            int temp = a.get(i);
                            a.set(i, (temp + k));
                            if (a.size() - 1 == i) {
                                break;
                            }
                            ++i;

                        }
                        break;
                    }
                }
                System.out.println(a.equals(b) ? "YES" : "NO");
            }
        }
    }

}