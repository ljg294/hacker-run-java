import java.security.MessageDigest;
import java.util.Scanner;

//Java SHA-256
public class Problem30 {
    public static void main(String[] args) {

        String s = new Scanner(System.in).nextLine();

        try {
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            md.update(s.getBytes());
            byte[] digest = md.digest();
            StringBuilder stringBuilder = new StringBuilder();

            for (byte b : digest)
                stringBuilder.append(String.format("%02x", b));

            System.out.println(stringBuilder);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
