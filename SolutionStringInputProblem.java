import java.lang.*;
import java.util.*;

public class SolutionStringInputProblem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        double d = input.nextDouble();

        /*
            The nextLine() method of java.util.Scanner class 
            advances this scanner past the current line and 
            returns the input that was skipped. This function 
            prints the rest of the current line, leaving out 
            the line separator at the end. The next is set to 
            after the line separator. Since this method 
            continues to search through the input looking 
            for a line separator, it may search all of the 
            input searching for the line to skip if no line 
            separators are present.
         */


         /*
              for example if input is 1 then there remains a
              cursor after typing 1. as 1 is an integer type, the
              space is not printed in the console. However, when the
              nextLine() is used the compiler then prints the null space
              instead of taking input from the user. In order to solve
              this issue, we have to use   input.nextLine();   once after
              everytime we take String input which is always after an int
              or double or any kinds of numeric.
          */


        input.nextLine();
        String s = input.nextLine();


        System.out.println("String: "+s);
        System.out.println("Double: "+d);
        System.out.println("Int: "+a);

        
    }
}
