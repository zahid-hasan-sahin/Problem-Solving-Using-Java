import java.util.Scanner;

public class CalculatingFunction {
 
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int temp = 0;
        for (int i = 1; i <= n; i++) {
            if(i%2==1){
                temp = temp - i;
            }else{
                temp = temp +i;
            }
            
        }
        System.out.println(temp);
        
        
    }
    
}