package Assignment3;


/**
*Author: Matthew Salazar
*Date: 02/05/23
*Purpose: Main for Date
*/
public class testDate
{
    
    public static void main(String[] args)
    {
       //declaring a date
       Date d1 = new Date();
       Date d2 = new Date();
       
       //declare a date no private variables so no getters necessary
       d1.month = 3;
       d1.day = 15;
       d1.year = 2023;
       
       d2.month = 3;
       d2.day = 20;
       d2.year = 2023;
       
       
       
       //method caller must be a date before d2.
       System.out.println(d1.compare(d2));
       
       d1.addDays(150);
       d1.print();
       
      
       
    }
}
