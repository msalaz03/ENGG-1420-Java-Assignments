package Assignment3;

/**
Author: Matthew Salazar
Date: 02/05/23
Purpose: Main for Rect
 */
public class testRect 
{

    public static void main(String[] args) 
    {
        //create rect object and set variables
        Rect r1 = new Rect();

        r1.x = 1;
        r1.y = 2;
        r1.length = 3;
        r1.width = 4;
        
        //use methods created in class
        int perm = r1.getPerimeter();
        int area = r1.getArea();

        r1.move(5, 3);
        r1.changeSize(5);

        r1.print(area, perm);

    }

}
