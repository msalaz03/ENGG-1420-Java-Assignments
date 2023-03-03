package Assignment3;

/**
 * Author: Matthew Salazar 
 * Date: 02/05/23
 * Purpose: Add additional methods and constructors.
 */

public class Rect2 {
    //private variable declaration, only accessed via getters and setters or constructors.
    
    private int x;
    private int y;
    private int width;
    private int length;
 
    
    //constructor #1
    public Rect2(int x, int y, int width, int length) 
    {
        this.x = x;
        this.y = y;
        
        //condition for 0 case
        if (length == 0 && width == 0) 
        {
            width = 1;
            length = 1;
        } 
        else if (width == 0) 
        {
            width = 1;

        } 
        else if (length == 0)
        {
            length = 1;
        }
        
        //given value cannot be negative
        this.width = Math.abs(width);
        this.length = Math.abs(length);
    }
    
    //constructor #2
    public Rect2(int length, int width) 
    {
        
        if (length == 0 && width == 0) 
        {
            width = 1;
            length = 1;
        } 
        else if (width == 0) 
        {
            width = 1;

        } 
        else if (length == 0)
        {
            length = 1;
        }
        this.width = Math.abs(width);
        this.length = Math.abs(length);
        
    }

    int getPerimeter() 
    {
        return (2 * width) + (2 * length);
    }

    int getArea() 
    {
        return width * length;
    }

    void move(int x, int y) 
    {
        this.x = x;
        this.y = y;
    }

    void changeSize(int n)
    {
        this.width = n;
        this.length = n;
    }
    
    
    //calculate the area and based off result return true or false.
    boolean isBiggerThan(Rect2 otherRect) {

        if (this.getArea() > otherRect.getArea()) {
            return true;
        } else {
            return false;
        }
    }

    void print(int area, int perimeter) {
        System.out.printf("X: %d ", this.x);
        System.out.printf("Y: %d\n", this.y);
        System.out.printf("Length: %d ", this.length);
        System.out.printf("Width: %d\n", this.width);
        System.out.printf("Area: %d ", area);
        System.out.printf("Perimeter: %d", perimeter);
    }

}
