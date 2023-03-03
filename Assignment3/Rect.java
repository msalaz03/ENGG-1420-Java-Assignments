package Assignment3;


/*
Author: Matthew Salazar
Date: 02/05/23
Purpose: Create a class of the properties of a rectangle and add the appropriate methods
 */
public class Rect 
{
    //declaration of variable
    int x;
    int y;
    int width;
    int length;

    //perimeter formula of a rectangle
    int getPerimeter() 
    {
        return (2 * width) + (2 * length);
    }
    
    //area formula of a rectangle
    int getArea()
    {
        return width * length;
    }

    //move coordinates, no need to return a value after changing hence void.
    void move(int x, int y) 
    {
        this.x = x;
        this.y = y;
    }

    //change size, no need to return a value after changing.
    void changeSize(int n) 
    {
        this.width = n;
        this.length = n;
    }

    //print out all components and there methods.
    void print(int area, int perimeter) {
        System.out.printf("X: %d ", this.x);
        System.out.printf("Y: %d\n", this.y);
        System.out.printf("Length: %d ", this.length);
        System.out.printf("Width: %d\n", this.width);
        System.out.printf("Area: %d ", area);
        System.out.printf("Perimeter: %d", perimeter);
    }

}
