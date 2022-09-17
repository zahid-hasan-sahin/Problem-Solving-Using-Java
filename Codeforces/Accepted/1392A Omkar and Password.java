import java.util.HashSet;
import java.util.Scanner;

public class NewClass1 {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        while (q-- > 0) {
            int n = scan.nextInt();
            HashSet<Integer> a = new HashSet<Integer>();
            for (int i = 0; i < n; i++) {
                a.add(scan.nextInt());
            }
            if(a.size()==1){
                System.out.println(n);
            }else{
            System.out.println(1);
            }

        }

    }

}