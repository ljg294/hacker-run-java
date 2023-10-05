import java.util.HashSet;
import java.util.Scanner;

//Java Data Structures Data Java Hashset
public class Problem39 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        scan.nextLine();

        HashSet<String> stringHashSet = new HashSet<>();
        for(int i = 0; i < t; i++)
        {
            String input = scan.nextLine();
            stringHashSet.add(input);
            System.out.println(stringHashSet.size());
        }
    }
}
