import java.util.Scanner;
import java.util.regex.Pattern;

//Java Regex
public class Problem18 {
    public static void main(String []args){
        Scanner scan = new Scanner(System.in);
        while(scan.hasNext()){
            String textIP = scan.next();
            String pattern = "^(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)$";
            System.out.println(textIP.matches(pattern));
        }
        scan.close();
    }
}
