import java.util.Scanner;

//Java 1D Array
public class Problem31 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int a[] = new int[n];

        for(int i = 0; i < n; i++)
            a[i] = scan.nextInt();

        for(int i:a)
            System.out.println(i);
    }
}
