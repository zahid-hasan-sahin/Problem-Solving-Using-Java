import java.util.Arrays;
import java.util.Scanner;

public class NewClass4 {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);    
        int t = scan.nextInt();
        while(t-->0){
            int n = scan.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = scan.nextInt();
            }
            Arrays.sort(a);
            for (int i = 0; i < n; i++) {
                System.out.print(a[i]+" ");
            }
            System.out.println();
        }
        
    }
}