import java.util.Scanner;

//Java Valid Username Regular Expression
public class Problem26 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        while (n-- != 0) {
            String userName = scan.nextLine();
            if (userName.matches("^[a-zA-Z]\\w{7,29}" )) {
                System.out.println("Valid");
            } else {
                System.out.println("Invalid");
            }
        }
    }
}
