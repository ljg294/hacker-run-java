import java.io.IOException;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//Java Advanced Prime Checker

class Prime {
    public void checkPrime(int[] n) {
        for(int i = 0; i < n.length; i++) {
            BigInteger bigInteger= BigInteger.valueOf(n[i]);
            if (bigInteger.isProbablePrime(10))
                System.out.print(n[i]+ " ");
        }
        System.out.println();

    }
}
public class Problem56 {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        Prime p = new Prime();
        List<Integer> integerList = new ArrayList<>();
        int[] array;
        for (int i = 0; i < 5; i++) {
            Integer input = scan.nextInt();
            integerList.add(input);

            if (i == 3) continue;
            array = integerList.stream()
                    .mapToInt(Integer::intValue)
                    .toArray();
            p.checkPrime( array);
        }
    }
}
