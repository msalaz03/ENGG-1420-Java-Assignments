/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Assignment1;



public class Rect2 {

    private int x;
    private int y;
    private int width;
    private int length;

    public Rect2(int x, int y, int width, int length) {
        this.x = x;
        this.y = y;

        if (length == 0 && width == 0) {
            width = 1;
            length = 1;
        } else if (width == 0) {
            width = 1;

        } else if (length == 0) {
            length = 1;
        }

        this.width = Math.abs(width);
        this.length = Math.abs(length);
    }

    public Rect2(int x, int y) {
        this.x = x;
        this.y = y;
    }

    int getPerimeter() {
        return (2 * width) + (2 * length);
    }

    int getArea() {
        return width * length;
    }

    void move(int x, int y) {
        this.x = x;
        this.y = y;
    }

    void changeSize(int n) {
        this.width = n;
        this.length = n;
    }

    boolean isBiggerThan(Rect2 otherRect) {

        if (this.getArea() > otherRect.getArea()) {
            return true;
        } else {
            return false;
        }
    }

    void print(int area, int perimeter) {
        System.out.printf("X: %d\n", this.x);
        System.out.printf("Y: %d\n", this.y);
        System.out.printf("Length: %d\n", this.length);
        System.out.printf("Width: %d\n", this.width);
        System.out.printf("Area: %d\n", area);
        System.out.printf("Perimeter: %d", perimeter);
    }

}

