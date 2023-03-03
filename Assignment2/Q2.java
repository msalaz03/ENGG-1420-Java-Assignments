package Assignment2;

/**
 * Author: Matthew Salazar 
 * Date: 01/23/23
 * Purpose: To create a program that will print all prime numbers less than 10000 using switch-case and for statements.
 */
public class Q2 
{

    
    public static void main(String[] args) 
    {
        
        
        for (int num = 2; num <= 10000; num++) //number
        {
            int isPrime = 1; //number is prime by default (boolean could've been used)
            
            for (int i = 2; i < num; i++)  //count
            {
                
                if (num % i == 0) //if any number divides into num equally isPrime is set to 0
                {
                    isPrime = 0;
                    break;
                }
            }
            
            switch (isPrime) //if isPrime is equal to one than the number is prime else print nothing.
            {
                case 1:
                    System.out.println("Prime:" + num );
                    break;
                default:
                    break;
            }
        }
        
    }
    
    
 
}
