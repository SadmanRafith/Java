//Md. Tahsin Hasib 22-46026-1

import java.lang.*;

public class BookShop {
    
    //-------------------Attributes
    private String name;
    private TextBook textBooks[] = new TextBook[100];
    private StoryBook storyBooks[] = new StoryBook[100];


    BookShop(){
        System.out.println("Empty Constructor of BookShop!");
    }

    BookShop(String name){

        System.out.println("Parameterized Constructor of BookShop!");
        this.name = name;
    }

    //------------------------------------Set Get methods
    public void setName(String name){
        this.name = name;
    }
    String getName(){
        return name;
    }

    //>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
    //------------------------------------------------Insert method ( Text Book )
    public boolean insertTextBook(TextBook tb){
        for(int i=0; i<textBooks.length; i++){
            if(textBooks[i] == null){            
                textBooks[i] = tb;
                System.out.println("TextBook tb"+(i+1)+" Inserted!");
                return true;               
            }
            else{}
        }
        System.out.println("TextBook not Inserted!");
        return false;
    }

    //-------------------------------------------------Remove method ( Text Book )
    public boolean removeTextBook(TextBook tb){
        for(int i=0; i<textBooks.length; i++){
            if(textBooks[i] == tb){             
                textBooks[i] = null;
                System.out.println("\nTextBook tb"+(i+1)+" Removed!");            
                return true;
            }
            else{}
        }
        System.out.println("\nTextBook not Removed!");
        return false;
    }

    //----------------------------------------------------Search method ( Text Book )
    public TextBook searchTextBook(String isbn){
        for(int i=0; i<textBooks.length; i++){
            if(textBooks[i] != null){                            
                if(textBooks[i].getIsbn().equals(isbn)){ 
                    System.out.println("\nTextBook Found");        
                    return textBooks[i];
                }
            }
        }
        System.out.println("\nTextBook Not Found");
        return null;
    }

    //-------------------------------------- showing all ( Text Books )
    public void showAllTextBooks(){
        for(int i=0; i<textBooks.length; i++){
            if(textBooks[i] != null){        
                System.out.println("\n>>>>>>>>>>>>>>> TextBook tb"+(i+1)+" >>>>>>>>>>>>>>>");                 
                textBooks[i].showDetails();
            }
        }
    }

    //>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
    //--------------------------------------------------------Insert method ( Story Book )
    public boolean insertStoryBook(StoryBook sb){
        for(int i=0; i<storyBooks.length; i++){
            if(storyBooks[i]==null){                        
                storyBooks[i] = sb;
                System.out.println("StoryBook sb"+(i+1)+" Inserted!");
                return true;
            }
            else{}
        }
        System.out.println("StoryBook not Inserted!");
        return false;
    }

    //------------------------------------------------------Remove method ( Story Book )
    public boolean removeStoryBook(StoryBook sb){
        for(int i=0; i<textBooks.length; i++){
            if(storyBooks[i] == sb){                        
                storyBooks[i] = null;
                System.out.println("\nStoryBook sb"+(i+1)+" Removed!");
                return true;
            }
            else{}
        }
        System.out.println("\nStoryBook Not Removed!");
        return false;
    }


    //----------------------------------------------------Search method ( Story Book )
    public StoryBook searchStoryBook(String isbn){
        for(int i=0; i<storyBooks.length; i++){
            if(storyBooks[i] != null){                           
                if(storyBooks[i].getIsbn().equals(isbn)){        
                    System.out.println("\nStoryBook Found");
                    return storyBooks[i];
                }
            }
        }
        System.out.println("\nStoryBook Not Found");
        return null;
    }

    //--------------------------------------------------Showing all ( Story Books )
    public void showAllStoryBooks(){
        for(int i=0; i<storyBooks.length; i++){
            if(storyBooks[i] != null){       
                System.out.println("\n>>>>>>>>>>>>>>> StoryBook sb"+(i+1)+" >>>>>>>>>>>>>>>");                   
                storyBooks[i].showDetails();
            }
        }
    }

}