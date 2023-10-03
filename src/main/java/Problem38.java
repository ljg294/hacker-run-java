import java.util.Scanner;

//Java Data Structures Data Java Stack
public class Problem38 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        while (scan.hasNext()) {
            String input = scan.nextLine();
            while (true) {
                int inputLength = input.length();

                input = input.replace("()", "");
                input = input.replace("{}", "");
                input = input.replace("[]", "");

                int outputLength = input.length();

                if (inputLength == outputLength)
                    break;
            }

            int n = input.length();

            if (n == 0)
                System.out.println("true");
            else
                System.out.println("false");
        }
    }
}
