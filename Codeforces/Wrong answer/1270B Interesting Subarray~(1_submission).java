import java.util.Scanner;

public class InterestingSubarray {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            int mn = Integer.MAX_VALUE;
            int mx = Integer.MIN_VALUE;
            
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                int in = scan.nextInt();
                a[i] = in;
                if (in < mn) {
                    mn = in;
                }
                if (in > mx) {
                    mx = in;
                }
            }
            if (mx - mn >= n) {
                System.out.println("YES");
                int c = 0;
                int e = 0;
                for (int i = 0; i < n; i++) {
                    if (a[i] == mn && e==0) {
                        System.out.print(i+1+" ");
                        ++e;
                    }
                   
                    if(a[i]==mx && c==0){
                        System.out.print(i+1+"");
                        ++c;
                        
                    }
                    if(c!=0 && e !=0){
                        break;
                    }
                }
                System.out.println();
            }else{
                System.out.println("NO");
            }

        }
    }

}