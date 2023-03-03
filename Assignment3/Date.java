package Assignment3;

/**
 * Author: Matthew Salazar 
 * Date: 02/05/23
 * Purpose: Create three methods, 
 * 1) print out the date in mm/dd/yyyy format
 * 2) add days method that will add a number of days onto a given date.
 * 3) compare the number of days between two dates.
 */

public class Date 
{
    //declaration of variables
    
    int year;
    int month;
    int day;

   void print() 
   { 
        //print out date variables
        System.out.printf("Date: %d/%d/%d", this.month, this.day, this.year);
    }

    void addDays(int n) 
    {
        //create an array of the days in months
        int[] month = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        //find the months array id
        int i = this.month - 1;
        
        //add the numbers of days n onto the current date
        int day = this.day + n;

        
        while (day > month[i]) 
        {
            //subtract the number of days from that particular month
            day -= month[i];
            
            //if condition for end of year
            if (this.month == 12) 
            {
                this.year++;
                this.month = 0;
                i = -1;
            }
            
            //next month
            this.month++;
            i++;

        }
        //does not meet condition add the remaining days.
        this.day = 0;
        this.day += day;

    }

    int compare(Date d1) {
        
        //declaration of variables and arrays
        int totalDays = 0;
        int[] month = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        
        
        //find the total year difference
        int yearDiff = Math.abs(this.year - d1.year);
        
        //add the total day difference
        totalDays += Math.abs(this.day - d1.day);
        
        //condition to add remaining years
        if (this.year != d1.year) 
        {
            totalDays += yearDiff * 365;
        }

        //condition if the month being compared to is less than our month
        while (this.month > d1.month) 
        {

            for (int i = (this.month - 1); i > (d1.month - 1); i--) 
            {
                totalDays -= month[i]; //subtract days
            }
            break;
        }
        
        //condition if the month being compared is greater than our month
        while (this.month < d1.month) 
        {

            for (int i = this.month - 1; i < d1.month - 1; i++) 
            {
                totalDays += month[i]; //add days
            }
            break;
        }
        

        return totalDays; //return number of days
    }
    
    
}

