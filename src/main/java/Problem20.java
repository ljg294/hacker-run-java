import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//Java Strings Introduction
public class Problem20 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String A = scan.nextLine();
        String B = scan.nextLine();
        System.out.println(A.length() + B.length());
        System.out.println(A.compareTo(B) > 0 ? "Yes" : "No");
        A = A.replace(A.charAt(0), Character.toUpperCase(A.charAt(0)));
        B = B.replace(B.charAt(0), Character.toUpperCase(B.charAt(0)));
        System.out.println(A + " " + B);
    }
}
