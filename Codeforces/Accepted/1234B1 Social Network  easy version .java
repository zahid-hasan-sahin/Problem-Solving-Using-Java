import java.util.ArrayList;
import java.util.Scanner;

public class SocialNetwork {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();
        ArrayList<Integer> m = new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {
            int t = scan.nextInt();
            if(!m.contains(t)){
                m.add(0,t);
                if(m.size()>k){
                    m.remove(m.size()-1);
                }
            }
            
        }
        System.out.println(m.size());
        for (int i = 0; i < m.size(); i++) {
            System.out.print(m.get(i)+" ");
        }
        System.out.println();
        
        
    }
    
}