import java.util.Arrays;
import java.util.Scanner;

//Java Anagrams
public class Problem24 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a = scan.nextLine();
        String b = scan.nextLine();

        a = a.toLowerCase();
        b = b.toLowerCase();
        char[] aCharArray = a.toCharArray();
        char[] bCharArray = b.toCharArray();

        Arrays.sort(aCharArray);
        Arrays.sort(bCharArray);

        if (Arrays.equals(aCharArray, bCharArray))
            System.out.println("Anagrams");
        else
            System.out.println("Not Anagrams");
    }
}
