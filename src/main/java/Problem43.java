import java.util.*;

//Java Data Structures Data Java Dequeue
public class Problem43 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Deque<Integer> deque = new ArrayDeque<>();

        int n = scan.nextInt();
        int m = scan.nextInt();
        long max = 0;
        HashSet<Integer> integerHashSet = new HashSet<>();

        for (int i = 0; i < n; i++) {
            int number = scan.nextInt();
            deque.add(number);
            integerHashSet.add(number);
            if (deque.size() == m) {
                if (integerHashSet.size() > max)
                    max = integerHashSet.size();
                int first = deque.remove();
                if (!deque.contains(first))
                    integerHashSet.remove(first);
            }
        }
        System.out.println(max);
    }
}
