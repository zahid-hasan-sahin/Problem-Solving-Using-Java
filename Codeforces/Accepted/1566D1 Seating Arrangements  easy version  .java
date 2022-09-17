import java.util.ArrayList;
import java.util.Scanner;

public class B {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        k:
        while (t-- > 0) {
            int m = scan.nextInt();
            int n = scan.nextInt();
            store[] a = new store[n];
            for (int i = 0; i < n; i++) {
                a[i] = new store(i, scan.nextInt());
            }
            sort(a, 0, a.length - 1);
           
            long res = 0;
            for (int i = 0; i < n; i++) {
                int c = 0;
                for (int j = 0; j < i; j++) {
                   
                    if (a[i].ind > a[j].ind) {
                        ++res;
                        ++c;

                    }
                }
           
            }
            System.out.println(res);

        }
    }

    static void merge(store arr[], int l, int m, int r) {

        int n1 = m - l + 1;
        int n2 = r - m;

        store L[] = new store[n1];
        store R[] = new store[n2];

        for (int i = 0; i < n1; ++i) {
            L[i] = arr[l + i];
        }
        for (int j = 0; j < n2; ++j) {
            R[j] = arr[m + 1 + j];
        }

        int i = 0, j = 0;

        int k = l;
        while (i < n1 && j < n2) {
            if (L[i].val == R[j].val) {
                if (L[i].ind > R[j].ind) {
                    arr[k] = L[i];
                    i++;
                } else {
                    arr[k] = R[j];
                    j++;
                }
            } else if (L[i].val <= R[j].val) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    static void sort(store arr[], int l, int r) {
        if (l < r) {

            int m = l + (r - l) / 2;

            sort(arr, l, m);
            sort(arr, m + 1, r);

            merge(arr, l, m, r);
        }
    }

}

class store {

    int ind;
    int val;

    store(int i, int v) {
        ind = i;
        val = v;
    }
}