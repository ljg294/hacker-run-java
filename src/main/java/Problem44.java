import java.util.*;

//Java Data Structures Data Java BitSet
public class Problem44 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();

        BitSet[] bits = {new BitSet(n), new BitSet(n)};

        for (int i = 0; i < m; i++) {
            String operation = scan.next();
            int x = scan.nextInt();
            int y = scan.nextInt();

            switch (operation) {
                case "AND":
                    bits[x - 1].and(bits[y - 1]);
                    break;
                case "OR":
                    bits[x - 1].or(bits[y - 1]);
                    break;
                case "XOR":
                    bits[x - 1].xor(bits[y - 1]);
                    break;
                case "FLIP":
                    bits[x - 1].flip(y);
                    break;
                case "SET":
                    bits[x - 1].set(y);
                    break;
                default:
                    break;
            }
            System.out.println(bits[0].cardinality() + " " + bits[1].cardinality());
        }
    }
}
