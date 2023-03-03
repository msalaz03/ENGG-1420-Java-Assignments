package Assignment4;

import static Assignment4.Book.getTitleInTitleCase;

public class BookTest 
{

    /**
     * Author: Matthew Salazar 
     * Date: 02/13/23 P
     * Purpose: main for book and use methods.
     */
    
    public static void main(String[] args) 
    {
        Book b1 = new Book("how to program in java", "Matthew Salazar,William Shakespeare,Barack Obama", 2004);
        Book b2 = new Book("stdio.h", "Mohammed Ali");
        
        
        String titleCase = getTitleInTitleCase(b1.title);

        System.out.println(titleCase);
        b1.printAuthors();
        System.out.print("\n");

        System.out.println(b1.contains("how"));

    }
}
