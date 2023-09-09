import java.util.Scanner;
import java.util.regex.Pattern;

//Java Pattern Syntax Checker
public class Problem17 {
    public static void main(String []args){
        Scanner scan = new Scanner(System.in);
        int count = scan.nextInt();
        scan.nextLine();
        for(int i = 0; i < count; i++){
            String text = scan.nextLine();
            try{
                Pattern.compile(text);
                System.out.println("Valid");
            }
            catch(Exception e){
                System.out.println("Invalid");
            }
        }
        scan.close();
    }
}
