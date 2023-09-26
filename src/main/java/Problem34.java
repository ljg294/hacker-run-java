import java.util.ArrayList;
import java.util.Scanner;

//Java Data Structures Java ArrayList
public class Problem34 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        ArrayList<ArrayList> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int limit = scan.nextInt();
            ArrayList<Integer> list2 = new ArrayList<>();

            for (int j = 0; j < limit; j++) {
                list2.add(scan.nextInt());
            }
            list.add(list2);
        }

        int q = scan.nextInt();
        for (int i = 0; i < q; i++) {
            int x = scan.nextInt();
            int y = scan.nextInt();
            try {
                System.out.println((list.get(x - 1)).get(y - 1));
            } catch (Exception e) {
                System.out.println("ERROR!");
            }
        }
    }
}
