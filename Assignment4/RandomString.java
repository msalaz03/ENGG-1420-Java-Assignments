
package Assignment4;

import java.util.Random;

/**
 * Author: Matthew Salazar 
 * Date: 02/13/23 P
 * Purpose: Create a program that takes a string of emails and separates them where appropriate.
 */
public class RandomString 
{

    String nextString(int n) 
    {
        Random r = new Random();
        String contents = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ123456789";
        String test =  "";
        
        char text[] = new char[n];

        for (int i = 0; i < n; i++) 
        {

            if (i == 0) 
            {
                text[i] = contents.charAt(r.nextInt(contents.length() - 9));
            } 
            
            else 
            {
                text[i] = contents.charAt(r.nextInt(contents.length()));
            }

        }
        
        return new String(text);
    }
        
    public static void main(String[] args) 
    {
        //test method here
        RandomString st = new RandomString();
        System.out.println(st.nextString(10));

    }

}
