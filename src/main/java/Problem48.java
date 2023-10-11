import java.util.BitSet;
import java.util.Scanner;

//Java Object Oriented Programming Java Abstract Class

abstract class Book{
    String title;
    abstract void setTitle(String s);
    String getTitle(){
        return title;
    }
}

class NewBook extends Book
{
    @Override
    void setTitle(String s)
    {
        this.title = s;
    }
}
public class Problem48 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        NewBook newBook = new NewBook();
        newBook.setTitle(scan.nextLine());

        System.out.println("The title is: " + newBook.getTitle());
    }
}
