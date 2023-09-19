import java.security.MessageDigest;
import java.util.Scanner;

//Java MD5
//Message-Digest algorithm 5
public class Problem29 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        try
        {
            MessageDigest md5 = MessageDigest.getInstance("MD5");
            md5.update(s.getBytes());
            byte[] digest = md5.digest();

            StringBuilder stringBuilder = new StringBuilder();
            for (byte b : digest)
            {
                stringBuilder.append(String.format("%02x",b));

            }
            System.out.println(stringBuilder);

        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
