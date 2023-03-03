package Assignment4;

import java.util.Scanner;

/**
 * Author: Matthew Salazar 
 * Date: 02/13/23 
 * Purpose: Create a program that prints repeated characters.
 */
public class Q1 
{

    
static void printSum(String s) 
{
    
        for (int i = 0; i < s.length(); i++)
        {
            

            //count
            int count = 1;
            
            
            //compare current letter to next one
            while (i + 1 < s.length() && s.charAt(i) == s.charAt(i + 1)) 
            {
                i++;
                count++;
            }
            
            //print condition
            if (count != 1)
            System.out.print(s.charAt(i)+ "" + count);
            else
            System.out.print(s.charAt(i));
        }

        System.out.println();
}

    // main method
    public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your string: ");
        String str = sc.nextLine();
        
        printSum(str);
      
    }
}

