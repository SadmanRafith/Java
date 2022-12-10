import java.lang.*;

public class Start {
    public static void main(String[] args){
          //Book b2 = new Book();
            Book b1 = new Book("1",
                           "Mystery",
                           "Tahsin",
                           300.50,
                           7);


        b1.showDetails();
        
        //for set method----------------------------------------
        b1.setIsbn("2");
        b1.setBookTitle("Comic");
        b1.setAuthorName("Disha");
        b1.setPrice(500);
        b1.setAvailableQuantity(8);

        //for get method----------------------------------------
        System.out.println("\n------Getting Details------");
        System.out.println("Book Isbn            : "+b1.getIsbn());
        System.out.println("Book Title           :"+b1.getBookTitle());
        System.out.println("Author Name          :"+b1.getAuthorName());
        System.out.println("Price                :"+b1.getPrice());
        System.out.println("Available Quantity   :"+b1.getAvailableQuantity());

    


    }
}
