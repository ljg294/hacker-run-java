import java.util.Scanner;

//Java Substring (Java 7)
public class Problem21 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String S = scan.nextLine();
        int start = scan.nextInt();
        int end = scan.nextInt();
        System.out.println(   S.substring(start, end));
    }
}
