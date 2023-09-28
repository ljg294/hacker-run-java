import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//Java Data Structures Data Java List
public class Problem36 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int integerNumber = scan.nextInt();


        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < integerNumber; i++) {
            list.add(scan.nextInt());
        }

        int queryNumber = scan.nextInt();

        for (int i = 0; i < queryNumber; i++) {
            String query = scan.next();
            if (query.equals("Insert")) {
                int index = scan.nextInt();
                int value = scan.nextInt();
                list.add(index, value);
            } else if (query.equals("Delete")) {
                int index = scan.nextInt();
                list.remove(index);
            }
        }

        for (int num : list) {
            System.out.print(num + " ");
        }
    }
}
