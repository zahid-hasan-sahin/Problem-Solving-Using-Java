import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class DivisorsofTwoIntegers {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
      
        ArrayList<Integer> nums = new ArrayList<Integer>();
        for (int i = 0; i <n; i++) {
            nums.add(scan.nextInt());
            
        }
        Collections.sort(nums);
        
          int firstNum = nums.get(n-1);
          for (int i = 0; i <   nums.size()-1; i++) {
            if(firstNum%nums.get(i)==0 && nums.get(i)!=nums.get(i+1)){
                nums.remove(nums.get(i));
                --i;               
            }
        }
            if(nums.size()==2 && nums.get(0)==nums.get(1)){
                System.out.println(firstNum +" "+firstNum);
            }else{
          System.out.print(firstNum+" ");
          System.out.println(nums.get(nums.size()-2));
            }
    }   
}