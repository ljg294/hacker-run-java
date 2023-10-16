import java.util.InputMismatchException;
import java.util.Scanner;

//Java Exception Handling Java Exception Handling (Try-catch)
public class Problem54 {

    public static void calculate() throws InputMismatchException {

        try {
            Scanner scan = new Scanner(System.in);
            Integer iOne = Integer.valueOf(scan.nextLine());
            Integer iTwo = Integer.valueOf(scan.nextLine());
            System.out.print(iOne / iTwo);

        } catch (NumberFormatException e) {
            throw new InputMismatchException();
        }
    }

    public static void main(String[] args) {

        try {
            calculate();
        } catch (Exception e) {

            if (e.getMessage() == null) {
                System.out.println(e.getClass().getName());
            } else {
                System.out.println(e.getClass().getName() + ": " + e.getMessage());
            }
        }
    }
}
