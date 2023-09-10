import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;
import java.util.Scanner;

//Java Currency Formatter
public class Problem13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Double payment = scan.nextDouble();
        NumberFormat us     = NumberFormat.getCurrencyInstance(Locale.US);
        //INDIA currency doesn't work for JAVA 15 (try with JAVA 7,8)
        NumberFormat india=NumberFormat.getCurrencyInstance(new Locale("en","IN"));
        india.setCurrency(Currency.getInstance("INR"));
        NumberFormat china  = NumberFormat.getCurrencyInstance(Locale.CHINA);
        NumberFormat france = NumberFormat.getCurrencyInstance(Locale.FRANCE);

        System.out.println("US: "     + us.format(payment));
        System.out.println("India: "  + india.format(payment));
        System.out.println("China: "  + china.format(payment));
        System.out.println("France: " + france.format(payment));
    }
}
