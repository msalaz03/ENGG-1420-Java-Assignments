package Assignment4;

import java.util.ArrayList;

/**
 * Author: Matthew Salazar Date: 02/13/23 P Purpose: Create a class circle and
 * create the following methods
 */
public class Circle {

    //declaration of variables
    int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    //add the radius of parameter onto the callers radius.
    void add(Circle c1) {
        this.radius += c1.radius;
    }

    //take an array of circles and add the total radius of them.
    void addAll(Circle[] circles) {

        for (Circle circle : circles) {
            this.radius += circle.radius;
        }
    }

    public ArrayList<Circle> decompose() 
    {
        
        //create an array list of circles
        ArrayList<Circle> result = new ArrayList<Circle>();
        int currentRadius = this.radius;
        
        while (currentRadius >= 2) 
        {
            //keep track so that loop does not break out.
            boolean pDivisor = false;
            for (int i = 2; i <= currentRadius / i; i++) 
            {
                //if perfect divisor create circle an add to list with value of i
                if (currentRadius % i == 0)
                {
                    result.add(new Circle(i));
                    currentRadius /= i;
                    pDivisor = true;
                    break;
                }
            }
            
            //condition for final circle.
            if (!pDivisor && currentRadius >= 2) 
            {
                result.add(new Circle(currentRadius));
                break;
            }
            
        }
        
        return result;
        
    }


}
