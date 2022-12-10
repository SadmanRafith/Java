//Md. Tahsin Hasib 22-46026-1

import java.lang.*;

public class StoryBook extends Book {
    
    //-----------------------------attributes
    private String category;

    public StoryBook(){
        System.out.println("Empty StoryBook Called!");
    }
    public StoryBook(String isbn,
                     String bookTitle,
                     String authorName,
                     double price,
                     int availableQuantity,
                     String category){

                        super(isbn,bookTitle,authorName,price,availableQuantity);
                        System.out.println("Parameterized StoryBook Called!");
                        this.category=category;
                    }

    //---------------------------------------------set methods
    public void setCategory(String category){
        this.category=category;
    }
    public String getCategory(){
        return category;
    }
    
    //-------------------------------------------------showing details of StoryBook
    public void showDetails(){

        System.out.println("\nShowing Details for StoryBook");
        super.showDetails();
        System.out.println("Category                               : "+category);
    }
}
