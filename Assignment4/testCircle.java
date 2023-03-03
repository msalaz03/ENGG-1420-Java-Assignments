
package Assignment4;

import java.util.ArrayList;
import java.util.Random;


public class testCircle 
{
    
 /**
 * Author: Matthew Salazar 
 * Date: 02/13/23 
 * Purpose: test the methods of circles
 */
    
    public static void main(String [] args)
    {
        //create an array of 100 circles (empty)
        Circle circles[] = new Circle[100];
        
        //change all radius
        for (int i = 0; i < circles.length; i++)
        {         
            circles[i] = new Circle(i + 1);
        
           
        }
        
        //print circles
        for (Circle circle : circles) 
        {
            System.out.println(circle.radius);
        }
        
        
        //////////////      part 2      /////////////////
        Random r = new Random();
        Circle c1 = new Circle(r.nextInt(991) + 10);
        c1.addAll(circles);               
        System.out.println(c1.radius);
        
        
        
        //// test decompose /////
        
        Circle c = new Circle(120);
        ArrayList<Circle> result = c.decompose();
        for (Circle circle : result) {
            System.out.println("Radius: " + circle.radius);
        }
   
        
    }
    
}
