import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String aqrgs[]){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();
        int temp = 0;
        ArrayList<Integer> identi = new ArrayList<Integer>();      
        ArrayList<Integer> val = new ArrayList<Integer>();  
        for (int i = 0; i < n; i++) {
            val.add(scan.nextInt());
        }
        for (int i = 0; i < n; i++) {           
            for (int j = 0; j <= i; j++) {
                identi.add(val.get(j));  
                if(identi.size()==k){
                    break;
                }
            }
            if(identi.size()==k){
                break;
            }
        }
        
        System.out.println(identi.get(k-1));
    }
    
}