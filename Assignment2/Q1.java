package Assignment2;

/**
 * Author: Matthew Salazar 
 * Date: 01/23/23
 * Purpose: To create a program that is prints all prime numbers under 10000 (using if-else and while loops).
 */
public class Q1 {

  
    public static void main(String args[]) 
    {
        
        int x = 2;
        
        while (x <= 10000) //Current Number 
        {
            
            int y = 2; //Count to check for prime
            
            while  (y <= x) //While count is less or equal than number
            {
                
                if (x == y) //If no number that is less than x evenly divides than it must be a prime number (if statement order is important)
                {
                    System.out.println("Prime Number: " + x);
                }
                
                if (x % y == 0) //It is not a prime number so go onto the next number
                {
                    break;
                }
                
                y++;//increase count
            }
            x++;//increase number
        }
    }
}
