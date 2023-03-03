
package Assignment3;
/**
*Author: Matthew Salazar
*Date: 02/05/23
*Purpose: Main for Rect2
*/

public class testRect2 
{
    
    public static void main(String [] args)
    {
        //create a rectangle with constructors
        Rect2 r1 = new Rect2(1,2,0,0);
        Rect2 r2 = new Rect2 (1,2,-5,-5);
        
        r2.move(2,2);
        
        int areaR1 = r1.getArea();
        int permR1 = r1.getPerimeter();
        
        int areaR2 = r2.getArea();
        int permR2 = r2.getPerimeter();
        
       
        r1.print(areaR1, permR1);
        System.out.println();
        
        
        boolean compare = r1.isBiggerThan(r2);
        System.out.println("\n" + compare + "\n");
        
        r2.print(areaR2, permR2);
    }
}
