//Md. Tahsin Hasib 22-46026-1

import java.lang.*;


public class Start {
    public static void main(String[] args) {
        System.out.println("---------------------------------------------------------");
        
        StoryBook sb1 = new StoryBook();
        StoryBook sb2 = new StoryBook("101", "Learn Java", "Adam", 500.50, 10, "Beginner");
        StoryBook sb3 = new StoryBook("102", "Learn C#", "Park", 600.50, 9, "Novice");
        StoryBook sb4 = new StoryBook("103", "Learn C", "Henry", 700.50, 8, "Intermediate");
        StoryBook sb5 = new StoryBook("104", "Learn PHP", "David", 800.50, 7, "Master");


        TextBook tb1 = new TextBook();
        TextBook tb2 = new TextBook("201", "Learn Javascript", "Jennie", 250, 8, 5);
        TextBook tb3 = new TextBook("202", "Learn Ruby", "Park", 350, 9, 2);
        TextBook tb4 = new TextBook("203", "Learn HTML", "Sydney", 450, 10, 6);
        TextBook tb5 = new TextBook("204", "Learn Python", "Alice", 550, 11, 5);


        System.out.println("\n>>>>>>>>>>>>>>>>>>>>> Showing Details >>>>>>>>>>>>>>>>>>>>>");
        sb2.showDetails();
        tb2.showDetails();

        //----------------------------------------------------------------setting values
        sb1.setIsbn("105");
        sb1.setBookTitle("Expert C#");
        sb1.setAuthorName("John");
        sb1.setPrice(450.00);
        sb1.setAvailableQuantity(10);
        sb1.addQuantity(7);
        sb1.sellQuantity(5);

        sb1.setCategory("Pro");

        tb1.setIsbn("205");
        tb1.setBookTitle("Expert Java");
        tb1.setAuthorName("Jennie");
        tb1.setPrice(350.00);
        tb1.setAvailableQuantity(10);
        tb1.addQuantity(9);
        tb1.sellQuantity(5);

        tb1.setStandard(7);

        System.out.println("\n>>>>>>>>>>>>>>>>>>>>> Get Function >>>>>>>>>>>>>>>>>>>>>");

        System.out.println("\nGetting Details for StoryBook");
        System.out.println("ISBN                                  : "+sb1.getIsbn());
        System.out.println("Book Title                            : "+sb1.getBookTitle());
        System.out.println("Author Name                           : "+sb1.getAuthorName());
        System.out.println("Price including discount              : "+sb1.getPrice()+" Taka");
        System.out.println("Available Quantity                    : "+sb1.getAvailableQuantity());
        System.out.println("Category                              : "+sb1.getCategory());

        System.out.println("\nGetting Details for TextBook");
        System.out.println("ISBN                                  : "+tb1.getIsbn());
        System.out.println("Book Title                            : "+tb1.getBookTitle());
        System.out.println("Author Name                           : "+tb1.getAuthorName());
        System.out.println("Price including discount              : "+tb1.getPrice()+" Taka");
        System.out.println("Available Quantity                    : "+tb1.getAvailableQuantity());
        System.out.println("Standard                              : "+tb1.getStandard());


        System.out.println("\n>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");

        BookShop b = new BookShop("\n>>>>>>>>>> Tahsin's Book Store <<<<<<<<<<");
        System.out.println(b.getName());

        System.out.println("\n>>>>>>>>>>>>>>>>>>>>>>>> Inserting TextBook >>>>>>>>>>>>>>>>>>>>>>>>");

        b.insertTextBook(tb1);
        b.insertTextBook(tb2);
        b.insertTextBook(tb3);
        b.insertTextBook(tb4);
        b.insertTextBook(tb5);

        System.out.println("\n>>>>>>>>>>>>>>>>>>>>>>>> Inserting StoryBook >>>>>>>>>>>>>>>>>>>>>>>>");

        b.insertStoryBook(sb1);
        b.insertStoryBook(sb2);
        b.insertStoryBook(sb3);
        b.insertStoryBook(sb4);
        b.insertStoryBook(sb5);

        System.out.println("\n>>>>>>>>>>>>>>>>>>>>>>>> Showing all Text Books >>>>>>>>>>>>>>>>>>>>>>>>");
        b.showAllTextBooks();
        System.out.println("\n>>>>>>>>>>>>>>>>>>>>>>>> Showing all Story Books >>>>>>>>>>>>>>>>>>>>>>>");
        b.showAllStoryBooks();


        System.out.println("\n>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println("\n>>>>>>>>>>>>>>>>>>>>>>>> Removing TextBook >>>>>>>>>>>>>>>>>>>>>>>>");
        b.removeTextBook(tb2);

        System.out.println("\n>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println("\n>>>>>>>>>>>>>>>>>>>>>>>> Removing StoryBook >>>>>>>>>>>>>>>>>>>>>>>");
        b.removeStoryBook(sb3);
        
        System.out.println("\n>>>>>>>>>>>>>>>>>>>>>>>> Showing all Text Books after Removing few  >>>>>>>>>>>>>>>>>>>>>>>");
        b.showAllTextBooks();
        System.out.println("\n>>>>>>>>>>>>>>>>>>>>>>>> Showing all Story Books after Removing few >>>>>>>>>>>>>>>>>>>>>>>");
        b.showAllStoryBooks();

        //---------------------------------------------------------------Searching methods

        System.out.println("\n>>>>>>>>>>>>>>>>>>>>>>>>>> Searching TextBooks >>>>>>>>>>>>>>>>>>>>>>>>>>");
        b.searchTextBook(tb1.getIsbn());
        System.out.println("\n>>>>>>>>>>>>>>>>>>>>>>>>>> Searching StoryBooks >>>>>>>>>>>>>>>>>>>>>>>>>");
        b.searchStoryBook(sb3.getIsbn());
        System.out.println("\n>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
    }
}