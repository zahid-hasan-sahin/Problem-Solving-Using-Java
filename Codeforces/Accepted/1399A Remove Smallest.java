import java.util.Arrays;
import java.util.Scanner;

public class NewClass9 {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        while (q-- > 0) {
            int n = scan.nextInt();
            boolean b = false;
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = scan.nextInt();
            }
            Arrays.sort(a);
            for (int i = 0; i < n-1; i++) {
              if(a[i+1]-a[i]>1){
                  b = true;
              }  
              
            }
            if(b){
                System.out.println("NO");
            }else{
                System.out.println("YES");
            }

        }

    }

}