import java.util.HashMap;
import java.util.Scanner;

public class Mikeandstrings {
    
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        HashMap<String, Integer> h = new HashMap<String, Integer>();
        String sb = scan.next();
        int n = sb.length();
        h.put(sb, 0);
        for (int i = 0; i < n - 1; i++) {
            char k = sb.charAt(0);
            sb = sb.substring(1);
            sb += k;
            h.put(sb, i + 1);
            
        }
        
        while (t-- > 1) {
            String s = scan.next();
            n = s.length();
            if (!h.containsKey(s)) {
                System.out.println("-1");
                return;
            }
            h.put(s, h.get(s));
            for (int i = 0; i < n - 1; i++) {
                char k = s.charAt(0);
                s = s.substring(1);
                s += k;
                if (!h.containsKey(s)) {
                    System.out.println("-1");
                    return;
                } else {
                    int u = h.get(s);
                    h.put(s, u + (i + 1));
                }
                
            }
        }
      
        int res = 1111111111;
        for (Integer v : h.values()) {
            res = Math.min(res, v);
        }
        System.out.println(res);
        
    }
    
}