
package Assignment4;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Author: Matthew Salazar 
 * Date: 02/13/23 
 * Purpose: Create a program that takes a string of emails and separates them where appropriate.
 */


public class Email 
{

    public static void main(String[] args) 
    {
        
        //Get user input.
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your emails: ");
        
        
        String emails = sc.nextLine();
        
        //Array of type String that are split into compoents based off the pattern.
        String[] splitEmails = emails.split("[;,\\s]+");

        //print array 
        System.out.println(Arrays.toString(splitEmails));

        //print all occurances of gmail.com
        for (String splitEmail : splitEmails) 
        {    
                  //array contains @gmail.com
                  if (splitEmail.endsWith("@gmail.com") == true)
                  {
                      System.out.print(splitEmail + " ");
                  }
              
        }
        
        //print all occurces of an _
        for (String splitEmail : splitEmails) 
        {   
                  //if the particular string contains an underscore
                  if (splitEmail.contains("_") == true)
                  {
                      System.out.print("\n"+splitEmail);
                  }
              
        }
        

    }
}
