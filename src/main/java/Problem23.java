import java.util.Scanner;

//Java String Reverse
public class Problem23 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String A = scan.nextLine();
        boolean flag = true;

        for (int i = 0; i < A.length() / 2; i++) {
            if (A.charAt(i) != A.charAt(A.length() - i - 1))
                flag = false;
        }

        if (flag)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
