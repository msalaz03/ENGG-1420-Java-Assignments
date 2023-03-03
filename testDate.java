/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Assignment1;

/**
 *
 * @author matth
 */
public class testDate {
    
    
    public static void main(String[] args) {
        Date d1 = new Date();
        Date d2 = new Date();

        d1.month = 10;
        d1.day = 20;
        d1.year = 2022;

        d2.month = 1;
        d2.day = 18;
        d2.year = 2003;

        int x = d1.compare(d2);

        System.out.println(x);
    }

}
