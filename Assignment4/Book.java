
package Assignment4;

/**
 * Author: Matthew Salazar
 * Date: 02/13/23
 * Purpose: Create a book class with the concept of book with three constructors.
 */

public class Book 
{
    // declaration of variables
    String title;
    String author;
    int pages;
    int year;
    double price;

    // constructor #1
    public Book(String title, String author, int year)
    {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    //constructor #2
    public Book(String title, String author) 
    {
        this.title = title;
        this.author = author;
    }

    //constructors #3
    public Book(int pages, int year, double price) 
    {
        this.pages = pages;
        this.year = year;
        this.price = price;
    }

    
    boolean contains(String n) 
    {
        //this.title contains the letter string of n
        if (title.contains(n)) 
        {
            return true;
        } else 
        {
            return false;
        }

    }

    void printAuthors() 
    {
        //replace every instance of ',' with a new line
        System.out.print(this.author.replace(',', '\n'));
    }

    static String getTitleInTitleCase(String title)
    {
        String[] words = title.split(" ");
        StringBuilder sb = new StringBuilder();
        
        for (String word : words) 
        {
            sb.append(Character.toUpperCase(word.charAt(0))).append(word.substring(1).toLowerCase()).append(" ");
        }
        return sb.toString().trim();
        
        
        
    }

}
