import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Scanner;

public class cfContest1714 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();

        k:
        while (t-- > 0) {
            String s = scan.next();
            int n = scan.nextInt();
            String[] a = new String[n];
            for (int i = 0; i < n; i++) {
                a[i] = scan.next();
            }
            ArrayList<T> ar = new ArrayList<T>();
            for (int i = 0; i < s.length(); i++) {
                for (int j = i; j < s.length(); j++) {
                    String k = "";

                    for (int l = i; l <= j; l++) {
                        k += s.charAt(l);
                    }

                    for (int l = 0; l < n; l++) {
                        if (a[l].equals(k)) {
                            ar.add(new T(l, i, j));
                        }
                    }
                }
            }

            if (ar.size() == 0) {
                System.out.println("-1");
            } else {
                int pos = -1;
                ArrayList<T> res = new ArrayList<T>();
                for (int i = 0; i < ar.size(); i++) {
                    int k = i;
                    int mx = -1;
                    int last = -1;

                    while (k < ar.size() && ar.get(k).startIndex <= pos + 1) {

                        if (mx < ar.get(k).endIndex) {
                            mx = ar.get(k).endIndex;
                            last = k;
                        }
                        ++k;
                    }

                    if (last == -1) {
                        System.out.println("-1");
                        continue k;
                    }
                    pos = ar.get(last).endIndex;
                    res.add(ar.get(last));
                    if (pos == s.length() - 1) {

                        System.out.println(res.size());
                        for (T r : res) {
                            System.out.println((r.strIndex + 1) + " " + (r.startIndex + 1));
                        }
                        continue k;
                    }

                    i = last;

                }
                System.out.println("-1");
            }

        }
    }
}

class sorter implements Comparator<T> {

    @Override
    public int compare(T a, T b) {
        return a.startIndex - b.startIndex;
    }

}

class T {

    int strIndex;
    int startIndex;
    int endIndex;

    T(int s, int c, int e) {
        strIndex = s;
        startIndex = c;
        endIndex = e;
    }
}