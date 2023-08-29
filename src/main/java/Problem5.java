import java.io.*;
import java.util.*;

//Java Output Formatting
public class Problem5 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++){
            String text = scan.next();
            int num = scan.nextInt();
            System.out.printf("%-15s%03d%n", text , num);
        }
        System.out.println("================================");

    }

}
