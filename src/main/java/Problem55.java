import java.util.Scanner;

//Java Exception Handling Java Exception Handling
public class Problem55 {

    public static long power (int n, int p) throws Exception {
        if (n < 0 || p < 0)
            throw new Exception("n or p should not be negative.");

        if (n == 0 && p == 0)
            throw new Exception("n and p should not be zero.");

        long power = 1;
        int i = 0;

        while (i++ < p) power *= n;

        return power;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (scan.hasNextInt()) {
            int n = scan.nextInt();
            int p = scan.nextInt();
            try {
                System.out.println(power(n, p));
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}
