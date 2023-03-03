/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Assignment1;

/**
 *
 * @author matth
 *
 *
 *
 */
public class Date {

    int year;
    int month;
    int day;

    void print() {
        System.out.printf("Date: %d/%d/%d", this.month, this.day, this.year);
    }

    void addDays(int n) {
        int[] month = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        int i = this.month - 1;

        int day = this.day + n;

        while (day > month[i]) {

            day -= month[i];
            if (this.month == 12) {
                this.year++;
                this.month = 0;
                i = -1;
            }

            this.month++;
            i++;

        }
        this.day = 0;
        this.day += day;

    }

    int compare(Date d1) {

        int totalDays = 0;
        int[] month = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        int yearDiff = Math.abs(this.year - d1.year);

        totalDays += Math.abs(this.day - d1.day);

        if (this.year != d1.year) {
            totalDays += yearDiff * 365;
        }

        while (this.month > d1.month) {

            for (int i = (this.month - 1); i > (d1.month - 1); i--) {
                totalDays -= month[i];
            }
            break;
        }

        while (this.month < d1.month) {

            for (int j = (this.month - 1); j < (d1.month - 1); j++) {
                totalDays += month[j];
            }
            break;
        }
        

        return totalDays;
    }

    
}
