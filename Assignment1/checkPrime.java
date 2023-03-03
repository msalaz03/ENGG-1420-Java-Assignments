/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Assignment1;

/**
 *
 * @author matth
 */
public class checkPrime {
    
    
    
    public static void main(String[] args){
  
 
        for (int num = 2; num < 100; num++){
              int isPrime = 1;
              
            for(int count = 2; count < num; count++){
                
                if (num % count == 0){
                    isPrime = 0;
                    break;
                }
               
                
                       
            }
            
           if (isPrime == 1){
               System.out.println(num);
           }
            
            
        }
    }
}
