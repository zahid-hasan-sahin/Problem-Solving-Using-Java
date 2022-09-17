import java.util.HashMap;
import java.util.Scanner;

public class cfContest1722 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int t = scan.nextInt();
        k:
        while (t-- > 0) {
            int n = scan.nextInt();
            String s = scan.next();
            int[] f = new int[n];
            long sum = 0;
            char[] k = new char[n];
            for (int i = 0; i < n; i++) {
                k[i] = s.charAt(i);
                if (s.charAt(i) == 'L') {
                    sum += i;
                    f[i] = i;
                } else {
                    sum += (n - 1 - i);
                    f[i] = (n - i - 1);

                }
            }

            int l = 0;
            int r = n - 1;

            for (int i = 0; i < n; i++) {
                while (l < n && k[l] != 'L') {
                    ++l;
                }
                while (r>=0 && k[r] != 'R') {
                    --r;

                }
                //   System.out.println(l+" "+r);
                int left = 0;
                int right = 0;
                if (l < n && k[l] == 'L') {
                    left = (n - l - 1) - f[l];
                }
                if (r >= 0 && k[r] == 'R') {
                    right = r - f[r];
                }
                if (left > right && left >= 1) {
                    sum -= f[l];
                    sum += (n - 1 - l);
                    k[l] = 'R';
                    f[l] = 100000000;
                    
                } else if (right >= 1) {
                    sum -= f[r];
                    sum += r;
                    k[r] = 'L';
                    f[r] = 100000000;
                }
              //  System.out.println(left + " " + right+" "+l+" "+r+" "+k[l]);
                
                sb.append(sum + " ");
            }
            sb.append("\n");
        }

        System.out.println(sb);
    }
}
/*
6
3
LLR
5
LRRLL
1
L
12
LRRRLLLRLLRL
10
LLLLLRRRRR
9
LRLRLRLR


3 5 5 
16 16 16 16 16 
0 
86 95 98 101 102 102 102 102 102 102 102 102 
29 38 45 52 57 62 65 68 69 70 
44 50 54 56 56 56 56 56 56 


 */