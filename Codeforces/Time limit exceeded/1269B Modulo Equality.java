import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        ArrayList<Integer> a = new ArrayList<Integer>();
        ArrayList<Integer> b = new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {
            a.add(scan.nextInt());
        }
        for (int i = 0; i < n; i++) {
            b.add(scan.nextInt());
        }
        Collections.sort(b);
        int x = 0;
        while(true){
            for (int i = 0; i < n; i++) {
                a.set(i,(a.get(i)+x)%m);
            }
            Collections.sort(a);
            if(a.equals(b)){
                break;
            }
            ++x;
        }
        System.out.println(x);
        
        
    }
    
}