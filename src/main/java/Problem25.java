import java.util.Scanner;

//Java String Tokens
public class Problem25 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();

        if(s.trim().length() == 0 || s.trim().length() > 400000) {
            System.out.println("0");
        }
        else {
            String arr[] = s.trim().split("[!,?._'@\\s]+");

            System.out.println(arr.length);
            for(String a : arr){
                System.out.println(a);
            }
        }
    }
}
