//Md. Tahsin Hasib 22-46026-1

import java.lang.*;

public class Start{
    public static void main(String[] args) {

        System.out.println("\n--------- Lab Task - 3-----------");
        System.out.println("---------------------------------");

        // for storybook
        StoryBook s1 = new StoryBook();
        StoryBook s2 = new StoryBook("1001",
                                    "Learn Java",
                                    "Adam",
                                    550.00,
                                    3,
                                    "Education");
        
        StoryBook.setDiscountRate(50);
        StoryBook.getDiscountRate();

        s2.showDetails();

        s2.addQuantity(5);
        s2.sellQuantity(2);

        s2.setIsbn("8001");
        s2.setBookTitle("Expert Java");
        s2.setAuthorName("John");
        s2.setPrice(450.00);
        s2.setCategory("Pro");



        System.out.println("\nGetting Details for StoryBook");
        System.out.println("ISBN                                   : "+s2.getIsbn());
        System.out.println("Book Title                             : "+s2.getBookTitle());
        System.out.println("Author Name                            : "+s2.getAuthorName());
        System.out.println("Price including discount               : "+s2.getPrice()+" Taka");
        System.out.println("Available Quantity                     : "+s2.getAvailableQuantity());
        System.out.println("Category                               : "+s2.getCategory());

        

        // for textbook
        TextBook t1 = new TextBook();
        TextBook t2 = new TextBook("3001",
                                    "Learn C++",
                                    "Marvik",
                                    850.00,
                                    7,
                                    5);
                                    
        TextBook.setDiscountRate(20.00);
        TextBook.getDiscountRate();

        t2.showDetails();

        t2.addQuantity(5);
        t2.sellQuantity(2);

        t2.setIsbn("4001");
        t2.setBookTitle("Expert C++");
        t2.setAuthorName("Daddy");
        t2.setPrice(950.00);
        t2.setStandard(6);

        System.out.println("\nGetting Details for TextBook");
        System.out.println("ISBN                                  : "+t2.getIsbn());
        System.out.println("Book Title                            : "+t2.getBookTitle());
        System.out.println("Author Name                           : "+t2.getAuthorName());
        System.out.println("Price including discount              : "+t2.getPrice()+" Taka");
        System.out.println("Available Quantity                    : "+t2.getAvailableQuantity());
        System.out.println("Standard                              : "+t2.getStandard());

    }
}
