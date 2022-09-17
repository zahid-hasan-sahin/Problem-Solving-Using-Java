import java.util.ArrayList;
import java.util.Scanner;

public class Mostsociallydistancedsubsequence {
    
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            ArrayList<Integer> res = new ArrayList<Integer>();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = scan.nextInt();
            }
            res.add(a[0]);
            for (int i = 1; i < n - 1; i++) {
           
               
                if ((a[i - 1] > a[i] && a[i] > a[i + 1]) || (a[i - 1] < a[i] && a[i] < a[i + 1])) {
                    continue;
                } else {
                    res.add(a[i]);
                }
            }
            res.add(a[n-1]);
            System.out.println(res.size());
            for (int i = 0; i < res.size(); i++) {
                System.out.print(res.get(i) + " ");
                
            }
            System.out.println();
            
        }
    }
}