
package Assignment1;
import java.util.Scanner;

public class ENGG1420 {

   
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
       
  
        int sum = 0;
        
        while (true){
             System.out.println("Please enter a number or 0 to quit");
             int x = sc.nextInt();
             
             if (x == 0)
                 break;
             
             sum += x;
        }
        System.out.println("Sum: " + sum);
        
    }
    
    public void test(){
        
    }
    
}
