package Assignment1;

import java.util.Scanner;

public class ConvertBinary {
    //convert binary number to actual number

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a binary number: ");
        long bin = sc.nextLong();
        long x = 1;
        long sum = 0;

        while (true) {

            //1010
            long digit = bin % 10;

            if (digit != 0) {
                sum += digit * x;
            }
            else if (bin == 0) {
                break;
            }

            x *= 2;
            bin /= 10;

        }

        System.out.print("Decimal: " + sum);

    }

}
