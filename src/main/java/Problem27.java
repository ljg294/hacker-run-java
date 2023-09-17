import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//Java String Tag Content Extractor
public class Problem27 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = Integer.parseInt(scan.nextLine());
        String regex = "<(.+)>([^<>]+)</(\\1)>";
        Pattern p = Pattern.compile(regex);

        for (int i = 0; i < N; i++) {
            String line = scan.nextLine();
            Matcher m = p.matcher(line);

            if (m.find()) {
                m.reset();

                while (m.find()) {
                    System.out.println(m.group(2));
                }
            }
            else {
                System.out.println("None");
            }
        }
    }
}
