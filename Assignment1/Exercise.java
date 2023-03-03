
package Assignment1;

import java.util.Scanner;


public class Exercise {
    
    
    public static void main(String[] args){
        //Write a Java program to compare two numbers.
        
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Please enter #1: ");
        int num1 = sc.nextInt();
        
        System.out.print("Please enter #2: ");
        int num2 = sc.nextInt();
        
        
        if (num1 < num2)
            System.out.printf("\n%d is smaller than %d", num1, num2);     
        else if (num1 > num2)
            System.out.printf("\n%d is greater than %d", num1, num2);
        else
            System.out.printf("\n%d is equal to %d",num1, num2);
    }
    
    
}
