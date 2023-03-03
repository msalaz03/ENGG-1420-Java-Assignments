package Assignment2;

import java.util.Scanner;

/**
 * Author: Matthew Salazar 
 * Date: 01/23/23
 * Purpose: Using a while and break statement create a program that will calculate the sum of numbers until 0 is inputted.
 */

public class Q4 
{

    public static void main(String[] args) 
    {
       
        int sum = 0;
        int num;
        
        Scanner sc = new Scanner(System.in);
        
        while(true) //will go until break
        {
            System.out.println("Enter a number or 0 to quit: "); //ask for user input
            num = sc.nextInt(); //scan int
            
            if(num == 0) //break out loop
            {
                break;
            }
            
            sum+= num; //otherwise num is added to sum
            
        }
        
        System.out.println("Sum: "+ sum); //when breaked up out loop print sum.
        
        
        
        
    }

}
