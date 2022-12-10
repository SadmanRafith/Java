import java.lang.*;

public class Start {
    public static void main(String[] args) {
        Book b = new Book();
        Book b1 = new Book("1001",
                            "Learn Java",
                            "Adam",
                            550.00,
                            10);

        Book b2 = new Book();
        Book b3 = new Book();
        Book b4 = new Book();
        Book b5 = new Book();

        //-------------------------------------- For b1
        b1.setIsbn("1000");
        b1.setBookTitle("Expert Java");
        b1.setAuthorName("John");
        b1.setPrice(450.00);
        b1.setAvailableQuantity(10);

        b1.addQuantity(5);
        b1.sellQuantity(2);

        //--------------------------------------- For b2
        b2.setIsbn("2000");
        b2.setBookTitle("Expert C++");
        b2.setAuthorName("Smith");
        b2.setPrice(550.00);
        b2.setAvailableQuantity(18);

        b2.addQuantity(4);
        b2.sellQuantity(1);

        //----------------------------------------- For b3
        b3.setIsbn("3000");
        b3.setBookTitle("Expert Python");
        b3.setAuthorName("Eric");
        b3.setPrice(220.00);
        b3.setAvailableQuantity(22);

        b3.addQuantity(2);
        b3.sellQuantity(6);

        //------------------------------------------ For b4
        b4.setIsbn("4000");
        b4.setBookTitle("Expert Ruby");
        b4.setAuthorName("James");
        b4.setPrice(700.00);
        b4.setAvailableQuantity(5);

        b4.addQuantity(3);
        b4.sellQuantity(2);

        //------------------------------------------- For b5
        b5.setIsbn("5000");
        b5.setBookTitle("Expert Dart");
        b5.setAuthorName("Victor");
        b5.setPrice(880.00);
        b5.setAvailableQuantity(9);

        b5.addQuantity(5);
        b5.sellQuantity(7);

        //--------------------------------------------- Creating array of Book

        Book arr[] = new Book[]{b1, b2, b3, b4, b5};

        System.out.println("----------------------------------------------------------------------");

        for(int i=0; i<arr.length; i++){

            System.out.println("-------------- For object of Book b["+(i+1)+"] -------------------------------\n");

            System.out.println("Book b["+i+"].ISBN                : "+arr[i].getIsbn());
            System.out.println("Book b["+i+"].BOOKTITLE           : "+arr[i].getBookTitle());
            System.out.println("Book b["+i+"].AUTHOR NAME         : "+arr[i].getAuthorName());
            System.out.println("Book b["+i+"].PRICE               : "+arr[i].getPrice()+" Taka");
            System.out.println("Book b["+i+"].AVAILABLE QUANTITY  : "+arr[i].getAvailableQuantity());

            System.out.println("----------------------------------------------------------------------");
        }
    }
}
