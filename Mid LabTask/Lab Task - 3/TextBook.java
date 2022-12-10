//Md. Tahsin Hasib 22-46026-1

import java.lang.*;

public class TextBook{
    //attributes
    private String isbn;
    private String bookTitle;
    private String authorName;
    private double price;
    private int availableQuantity;
    private int standard;
    private static double discountRate;

    //constructors
    public TextBook(){
        System.out.println("\nEmpty TextBook Called!");
    }
    public TextBook(String isbn,
                    String bookTitle,
                    String authorName,
                    double price,
                    int availableQuantity,
                    int standard){

                        System.out.println("\nParameterized TextBook Called!");
                        this.isbn=isbn;
                        this.bookTitle=bookTitle;
                        this.authorName=authorName;
                        this.price=price;
                        this.availableQuantity=availableQuantity;
                        this.standard=standard;
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
    public void setStandard(int standard){
        this.standard=standard;
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
    public int getStandard(){
        return standard;
    }

    //add sell methods
    public void addQuantity(int amount){
        availableQuantity = availableQuantity + amount;
    }
    public void sellQuantity(int amount){
        availableQuantity = availableQuantity - amount;
    }

    //showing details of TextBook
    public void showDetails(){
        System.out.println("\nShowing Details for TextBook");
        System.out.println("ISBN                                  : "+isbn);
        System.out.println("Book Title                            : "+bookTitle);
        System.out.println("Author Name                           : "+authorName);
        System.out.println("Price                                 : "+price+" Taka");
        System.out.println("Available Quantity                    : "+availableQuantity);
        System.out.println("Standard                              : "+standard);
        System.out.println("Discount Rate                         : "+discountRate);
    }
}
