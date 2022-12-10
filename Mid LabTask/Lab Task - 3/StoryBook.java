//Md. Tahsin Hasib 22-46026-1

import java.lang.*;

public class StoryBook{

    //attributes
    private String isbn;
    private String bookTitle;
    private String authorName;
    private double price;
    private int availableQuantity;
    private String category;
    private static double discountRate;

    //constructors
    public StoryBook(){
        System.out.println("\nEmpty StoryBook Called!");
    }
    public StoryBook(String isbn,
                    String bookTitle,
                    String authorName,
                    double price,
                    int availableQuantity,
                    String category){

                        System.out.println("\nParameterized StoryBook Called!");
                        this.isbn=isbn;
                        this.bookTitle=bookTitle;
                        this.authorName=authorName;
                        this.price=price;
                        this.availableQuantity=availableQuantity;
                        this.category=category;
                    }

    //static methods
    public static void setDiscountRate(double rate){
        discountRate=rate;
    }
    public static double getDiscountRate(){ 
        return discountRate;
    }
    
    //set get methods
    public void setIsbn(String isbn){
        this.isbn=isbn;
    }
    public void setBookTitle(String bookTitle){
        this.bookTitle=bookTitle;
    }
    public void setAuthorName(String authorName){
        this.authorName=authorName;
    }
    public void setPrice(double price){
        this.price=price;
    }
    public void setAvailableQuantity(int availableQuantity){
        this.availableQuantity=availableQuantity;
    }
    public void setCategory(String category){
        this.category=category;
    }

    public String getIsbn(){
        return isbn;
    }
    public String getBookTitle(){
        return bookTitle;
    }
    public String getAuthorName(){
        return authorName;
    }
    public double getPrice(){
        return price = price - (price*discountRate)/100;
    }
    public int getAvailableQuantity(){
        return availableQuantity;
    }
    public String getCategory(){
        return category;
    }

    //add sell methods
    public void addQuantity(int amount){
        availableQuantity = availableQuantity + amount;
    }
    public void sellQuantity(int amount){
        availableQuantity = availableQuantity - amount;
    }

    //showing details of StoryBook
    public void showDetails(){
        System.out.println("\nShowing Details for StoryBook");
        System.out.println("ISBN                                   : "+isbn);
        System.out.println("Book Title                             : "+bookTitle);
        System.out.println("Author Name                            : "+authorName);
        System.out.println("Price                                  : "+price+" Taka");
        System.out.println("Available Quantity                     : "+availableQuantity);
        System.out.println("Category                               : "+category);
        System.out.println("Discount Rate                          : "+discountRate);
    }
}